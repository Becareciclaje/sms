package com.gestor.sms.controladores;


import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Compra;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;

import com.gestor.sms.servicios.ComprasServiceInterface;

@Controller
public class ComprasControler
{
	@Autowired
	private ComprasServiceInterface comprasServiceInterface;

	@RequestMapping("/listaCompras")
	public ModelAndView listaCompras(HttpServletRequest request, Compra compra)
	{
		ModelAndView modelAndView =new ModelAndView("listaCompras");
		Usuario usuario=(Usuario) request.getSession(true).getAttribute("usuario");
		List<Compra> compras= null;
		try
		{
			getComprasServiceInterface().getListaCompras(compra.getCuenta(), compras);
			modelAndView.addObject("compras", compras);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	
	@RequestMapping("/grabaCompra")
	public ModelAndView grabaCompra(Compra compra)
	{
		ModelAndView modelAndView = new ModelAndView("compras");
		System.out.println(compra.getFechaTexto());
		String dato=compra.getFechaTexto();
		
		int dia= Integer.parseInt(dato.substring(0, dato.indexOf("/")));
		int mes= Integer.parseInt(dato.substring(dato.indexOf("/")+1, dato.lastIndexOf("/")));
		int ano= Integer.parseInt(dato.substring(dato.lastIndexOf("/")+1));
	
		GregorianCalendar calendar= new GregorianCalendar(ano,mes-1,dia);
		
		compra.setFecha(new Date(calendar.getTimeInMillis()));
		
		System.out.println(dia+" - "+mes+" - "+ano);
		try
		{
			getComprasServiceInterface().grabaCompra(compra);
			modelAndView.addObject("error","Grabado Correctamente");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			modelAndView.addObject("error","No Grabado");
		}
		
		return modelAndView;
	}

	@RequestMapping("compras")
	public ModelAndView compras(HttpServletRequest request)
	{
		

		
		  if(request.getSession(true).getAttribute("usuario")==null) {
		  request.getSession(true).invalidate();
		  return new ModelAndView("home");
		  }
		Usuario usuario = (Usuario) request.getSession(true).getAttribute("usuario");

		ModelAndView modelAndView = new ModelAndView("compras");
		List<Cuenta> cuentas = new ArrayList<>();

		try
		{
			List<Usuario> usuarios = new ArrayList<>();
			
			getComprasServiceInterface().cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login", usuario.getLogin());

			getComprasServiceInterface().cargaCuentasByUsuario(cuentas, usuarios.get(0));

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		modelAndView.addObject("cuentas", cuentas);
		modelAndView.addObject("compra", new Compra());

		return modelAndView;

	}

	public ComprasServiceInterface getComprasServiceInterface()
	{
		return comprasServiceInterface;
	}

	public void setComprasServiceInterface(ComprasServiceInterface comprasServiceInterface)
	{
		this.comprasServiceInterface = comprasServiceInterface;
	}

}

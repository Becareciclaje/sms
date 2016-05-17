package com.gestor.sms.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.servicios.ComprasService;
import com.gestor.sms.servicios.ComprasServiceInterface;
 
@Controller
public class ComprasControler
{
	@Autowired
	private ComprasServiceInterface comprasServiceInterface;
	
	@RequestMapping("compras")
public ModelAndView compras(HttpServletRequest request)
{

		/*if(request.getSession(true).getAttribute("usuario")==null)
		{
			request.getSession(true).invalidate();
			return new ModelAndView("/");
		}*/
		Usuario usuario=(Usuario) request.getSession(true).getAttribute("usuario");
	
	ModelAndView modelAndView= new ModelAndView("compras");
	List<Cuenta> cuentas=new ArrayList<>();
	
	try
	{
		List<Usuario> usuarios=new ArrayList<>();
		getComprasServiceInterface().cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login", "fer");
	
		getComprasServiceInterface().cargaCuentasByUsuario(cuentas, usuarios.get(0));
		
	} catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	modelAndView.addObject("cuentas",cuentas);
	modelAndView.addObject("cuenta",new Cuenta());
	
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

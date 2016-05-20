package com.gestor.sms.controladores;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.servicios.EnviosServiceInterface;

@Controller
public class EnviosControler 
{

	@Autowired
	private EnviosServiceInterface enviosServiceInterface;

	@RequestMapping("envios")
	public ModelAndView envios(HttpServletRequest request, Destinatario destinatario)
	{
//		if (request.getSession(true).getAttribute("usuario") == null)
//		{
//			request.getSession(true).invalidate();
//			return new ModelAndView("home");
//		}

		ModelAndView modelAndView = new ModelAndView("envios");
		Usuario usuario = (Usuario) request.getSession(true).getAttribute("usuario");

		List<Cuenta> cuentas = new ArrayList<>();

		try
		{

			List<Usuario> usuarios = new ArrayList<>();
			getEnviosServiceInterface().cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login",
					usuario.getLogin());

			getEnviosServiceInterface().cargaCuentasByUsuario(cuentas, usuarios.get(0));
			modelAndView.addObject("cuentas", cuentas);

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (destinatario.getCuenta()==null)
		{
			modelAndView.addObject("destinatario", new Destinatario());
			return modelAndView;			
		}
		
		List<Destinatario> destinatarios = new ArrayList<>();

		try
		{
			getEnviosServiceInterface().dameDestinatarios(destinatarios, cuentas.get(0).getId());
			modelAndView.addObject("destinatarios", destinatarios);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

		return modelAndView;
	}

	@RequestMapping(value = "/destinatarios", method = RequestMethod.GET)
	public ModelAndView cargarDestinarios(HttpServletRequest request)
	{
		String cuenta = request.getParameter("Cuenta") ;
		
		if (request.getSession(true).getAttribute("usuario") == null)
		{
			request.getSession(true).invalidate();
			return new ModelAndView("home");
		}
		Usuario usuario = (Usuario) request.getSession(true).getAttribute("usuario");

		ModelAndView modelAndView = new ModelAndView("envios");

		String response = "";
		// Process the request
		List<Destinatario> destinatarios = new ArrayList<>();
		try
		{
			int idcuenta = Integer.parseInt(cuenta);
			getEnviosServiceInterface().dameDestinatarios(destinatarios, idcuenta );
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Prepare the response string
		return modelAndView;
	}

	@RequestMapping("/seleccionar")
	public ModelAndView seleccionar(HttpServletRequest request, Usuario usuario)
	{
		ModelAndView modelAndView = new ModelAndView("envios");

		try
		{
			getEnviosServiceInterface().grabaEnvios(request, usuario);
			modelAndView.addObject("error", "Grabado Correctamente");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			modelAndView.addObject("error", "No se ha podido grabar");
		}

		return modelAndView;
	}

	public EnviosServiceInterface getEnviosServiceInterface()
	{
		return enviosServiceInterface;
	}

	public void setEnviosServiceInterface(EnviosServiceInterface enviosServiceInterface)
	{
		this.enviosServiceInterface = enviosServiceInterface;
	}

}

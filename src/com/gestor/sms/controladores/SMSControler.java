package com.gestor.sms.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.beans.Registro;
import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.excepciones.UsuarioExisteException;
import com.gestor.sms.servicios.GestorServiceInterface;
import com.gestor.sms.servicios.SMSServiceInterface;

@Controller
public class SMSControler
{
	private SMSServiceInterface smsServiceInterface;

	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("usuario", new Usuario());
		return modelAndView;
	}

	@RequestMapping(value = "/registro")
	public ModelAndView registro()
	{
		ModelAndView modelAndView= new ModelAndView("registro");
		Registro registro= new Registro();
		registro.setUsuario(new Usuario());
		registro.setCuenta(new Cuenta());
		modelAndView.addObject("registro",registro);
		return modelAndView;
	}
	
	@RequestMapping("/altaUsuario")
	public ModelAndView altaUsuario(HttpServletRequest request,Registro registro)
	{
		ModelAndView modelAndView= new ModelAndView();
		try
		{
			getSmsServiceInterface().verLogin(registro);
			request.getSession(true).setAttribute("usuario", registro.getUsuario());
			modelAndView.setViewName("");
			
		} catch (UsuarioExisteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			modelAndView.setViewName("registro");
			modelAndView.addObject("error", "El usuario ya existe");
		}
		return modelAndView;
	}

	public SMSServiceInterface getSmsServiceInterface()
	{
		return smsServiceInterface;
	}

	public void setSmsServiceInterface(SMSServiceInterface smsServiceInterface)
	{
		this.smsServiceInterface = smsServiceInterface;
	}

	

}

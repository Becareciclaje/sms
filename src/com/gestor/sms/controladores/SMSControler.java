package com.gestor.sms.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Usuario;
import com.gestor.sms.servicios.GestorServiceInterface;


@Controller
public class SMSControler
{
	private GestorServiceInterface gestorServiceInterface;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView modelAndView= new ModelAndView("login");
		modelAndView.addObject("usuario", new Usuario());
		return modelAndView;
	}
	
	@RequestMapping(value = "/verLogin", method = RequestMethod.POST)
	public String verLogin(Usuario login)
		{
		return null;
	}

	public GestorServiceInterface getGestorServiceInterface()
	{
		return gestorServiceInterface;
	}

	public void setGestorServiceInterface(GestorServiceInterface gestorServiceInterface)
	{
		this.gestorServiceInterface = gestorServiceInterface;
	}


}

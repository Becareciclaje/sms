package com.gestor.sms.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Usuario;

@Controller
public class SMSControler
{
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView modelAndView= new ModelAndView("login");
		modelAndView.addObject("usuario", new Usuario());
		return modelAndView;
	}

}

package com.gestor.sms.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Usuario;
import com.gestor.sms.servicios.SmsService;


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
	private SmsService smsService;
	@RequestMapping(value = "/verLogin", method = RequestMethod.POST)
	public String verLogin(Usuario login)
		{
		try
		{
			getSmsService().verificaLogin(login);
			return "menu";
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "errorLogin";
		}
	}
	public SmsService getSmsService()
	{
		return smsService;
	}
	public void setSmsService(SmsService smsService)
	{
		this.smsService = smsService;
	}

}

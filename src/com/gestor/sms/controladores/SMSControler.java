package com.gestor.sms.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SMSControler
{
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}

}
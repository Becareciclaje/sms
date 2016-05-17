package com.gestor.sms.controladores;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Destinatario;
import com.gestor.sms.datos.Usuario;
import com.gestor.sms.servicios.EnviosServiceInterface;

@Controller
public class EnviosControler
{
	
	@Autowired
	private EnviosServiceInterface  enviosServiceInterface;
	
	@RequestMapping("/envios")
	public ModelAndView envios()
	{
		ModelAndView modelAndView = new ModelAndView("envios");
		List<Destinatario> destinatarios=new ArrayList<>();;
		try
		{
			List<Usuario> usuarios=new ArrayList<>();
			getEnviosServiceInterface().cargaEntidadWithFilterProperty(usuarios, Usuario.class, "login", "fer");
			getEnviosServiceInterface().dameDestinatarios(destinatarios, usuarios.get(0).getId());

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		modelAndView.addObject("destinatarios", destinatarios);
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

package com.gestor.sms.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private SMSServiceInterface smsServiceInterface;

	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView modelAndView = new ModelAndView("home");
		//modelAndView.addObject("usuario", new Usuario());
		//ModelAndView modelAndView = new ModelAndView("login");
		//modelAndView.addObject("usuario", new Usuario());
		return modelAndView;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("usuario", new Usuario());
		//ModelAndView modelAndView = new ModelAndView("login");
		//modelAndView.addObject("usuario", new Usuario());
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
		ModelAndView modelAndView= new ModelAndView("registro");
		try
		{
			getSmsServiceInterface().registro(registro);
			request.getSession(true).setAttribute("usuario", registro.getUsuario());
			request.getSession(true).setAttribute("cuenta", registro.getCuenta());
			modelAndView.setViewName("");
			modelAndView.addObject("texto", "El usuario ha sido grabado correctamente");
			
		} catch (UsuarioExisteException e)
		{
			// TODO Auto-generated catch block
			
			modelAndView.setViewName("registro");
			modelAndView.addObject("texto", "Error: el usuario ya existe");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			modelAndView.addObject("texto", "problemas de conexion");
		}
		return modelAndView;
	}
	
	//private String vacio = "       "; 
	
	@RequestMapping("/verLogin")
	public ModelAndView verLogin(HttpServletRequest request,Usuario usuario)
		
	{
		
		ModelAndView modelAndView= new ModelAndView("login");
				try
		
		
		{
			getSmsServiceInterface().verUsuario(usuario);
			request.getSession(true).invalidate();
			modelAndView.addObject("texto", "usuario no  es valido");
	
		} catch (UsuarioExisteException e)
		{
			// TODO Auto-generated catch block
			
			//request.getSession(true).invalidate();
			request.getSession(true).setAttribute("usuario", usuario);
			modelAndView.addObject("texto", "usuario  es valido");
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			modelAndView.addObject("texto", "problemas de conexion");
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

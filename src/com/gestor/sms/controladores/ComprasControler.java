package com.gestor.sms.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gestor.sms.datos.Cuenta;
import com.gestor.sms.servicios.ComprasService;
import com.gestor.sms.servicios.ComprasServiceInterface;
 
@Controller
public class ComprasControler
{
	@Autowired
	private ComprasServiceInterface comprasServiceInterface;
	
	@RequestMapping("compras")
public ModelAndView compras()
{
		
	
	ModelAndView modelAndView= new ModelAndView("compras");
	List<Cuenta> cuentas=new ArrayList<>();
	
	try
	{
	
		getComprasServiceInterface().cargaEntidadWithFilterProperty(cuentas, Cuenta.class, "id", 0);
		
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

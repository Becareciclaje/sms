package com.gestos.sms.confuguracion;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Inicializador extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses()
	{
		// TODO Auto-generated method stub
		return new Class<?>[]{ServletContext.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses()
	{
		// TODO Auto-generated method stub
		return new Class<?>[]{DispatcherServlet.class};
	}

	@Override
	protected String[] getServletMappings()
	{
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}

}

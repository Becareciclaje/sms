package com.gestor.sms.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.gestor.sms.servicios.GestorService;

@Component
@Aspect
public class AspectoSessionManager 
{
	@Pointcut("execution(@com.gestor.sms.anotaciones.SessionManager * *(..))")
	public void ejecutar()
	{

	}

	@Around("ejecutar()")
	public void ponerSesion(ProceedingJoinPoint joinPoint)
	{

		GestorService gestorService = (GestorService) joinPoint.getTarget();
		try
		{
			// Before
			
			gestorService.getGestorDao().
				setSession(gestorService.getGestorDao().getFactory().openSession());
			joinPoint.proceed();
			
			// AfterReturning
		} catch (Throwable e)
		{
			// AfterThrowing
			e.printStackTrace();

		} finally
		{
			// After
			gestorService.getGestorDao().getSession().close();
		}

	}

}

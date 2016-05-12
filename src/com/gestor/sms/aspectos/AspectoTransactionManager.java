package com.gestor.sms.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.gestor.sms.servicios.GestorService;

@Component
@Aspect
public class AspectoTransactionManager
{
	@Pointcut("execution(@com.gestor.sms.anotaciones.TransactionManager * *(..))") 
	public void ejecutar()
	{

	}

	@Around("ejecutar()")
	public void ponerTransaccion(ProceedingJoinPoint joinPoint)
	{
		GestorService gestorService = (GestorService) joinPoint.getTarget();
		try
		{
			gestorService.getGestorDao().setSession(gestorService.getGestorDao().getFactory().openSession());
			gestorService.getGestorDao().
			setTransaction(gestorService.getGestorDao().getSession().getTransaction());
			gestorService.getGestorDao().getTransaction().begin();
			
			joinPoint.proceed();
			
			gestorService.getGestorDao().getTransaction().commit();
		} catch (Throwable e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			gestorService.getGestorDao().getTransaction().rollback();
		}
		finally
		{
			gestorService.getGestorDao().getSession().close();
		}

	}

}








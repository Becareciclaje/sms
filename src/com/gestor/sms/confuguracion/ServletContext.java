
package com.gestor.sms.confuguracion;

import java.util.Properties;
//prueba
//Fer
//esto es de lino
//beA
//francisco
//Roberto cambio

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.gestor.sms.daos.ComprasDao;
import com.gestor.sms.daos.GestorDao;
import com.gestor.sms.daos.SMSDao;
import com.gestor.sms.servicios.ComprasService;
import com.gestor.sms.servicios.SMSService;

@Configuration
@EnableWebMvc
@ComponentScan(
	{ "com.gestor.sms.controladores", "com.gestor.sms.servicios", "com.gestor.sms.daos",
			"com.gestor.sms.aspectos", })
@EnableAspectJAutoProxy
public class ServletContext extends WebMvcConfigurerAdapter
{
	@Bean
	public ComprasDao getComprasDao()
	{
		return new  ComprasDao();
	}
	
	
	@Bean
	public ComprasService getComprasService()
	{
		ComprasService comprasService= new ComprasService();
		comprasService.setComprasdao(getComprasDao());;
		return comprasService;
	}
	
	public SMSDao getSMSDao()
	{
		return new SMSDao();
	}
	@Bean
	public SMSService getSMSService()
	{
		SMSService service= new SMSService();
		service.setSmsDao(getSMSDao());
		return service;
	}
	
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://192.168.120.28:3306/" + "gestorsms?useUnicode=true&useLegacyDatetime"
				+ "Code=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("tecnocom");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getLocalSessionFactoryBean()
	{
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDriverManagerDataSource());
		factoryBean.setPackagesToScan("com.gestor.sms.datos");
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.id.new_generator_mappings", "false");
		factoryBean.setHibernateProperties(properties);
		return factoryBean;
	}

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver()
	{
		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
		internalResourceViewResolver.setPrefix("/WEB-INF/views/");
		internalResourceViewResolver.setSuffix(".jsp");
		return internalResourceViewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}

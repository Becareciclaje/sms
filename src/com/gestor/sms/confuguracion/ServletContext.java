
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



@Configuration
@EnableWebMvc
@ComponentScan(
	{ "com.gestor.sms.controladores", 
		})
@EnableAspectJAutoProxy
public class ServletContext extends WebMvcConfigurerAdapter
{
	@Bean
	public DriverManagerDataSource getDriverManagerDataSource()
	{
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.
		setUrl("jdbc:mysql://192.168.120.28:3306/"
				+ "gestorsms?useUnicode=true&useLegacyDatetime"
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
		factoryBean.setPackagesToScan("curso.tecnocom.spring.datos");
		Properties properties= new Properties();
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
		InternalResourceViewResolver internalResourceViewResolver= 
				new InternalResourceViewResolver();
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

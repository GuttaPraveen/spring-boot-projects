package com.trio.praveen.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.trio.praveen.entity.Book;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer
{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors)
	{

		HttpMethod[] unsupportedMethods = {HttpMethod.PUT,HttpMethod.DELETE };
		
		config.getExposureConfiguration()
			  .forDomainType(Book.class)
			  .withItemExposure((metadata, http) -> http.disable(unsupportedMethods))
			  .withCollectionExposure((metadata,http) -> http.disable(unsupportedMethods));
	}
}
/*

========================================================
How to disable HTTP Requests in Data REST application ?
========================================================

=> Add below class in Data REST Application to disable PUT and DELETE methods.

Note: With below configuration our api will not accept PUT and DELETE methods.
		
*/

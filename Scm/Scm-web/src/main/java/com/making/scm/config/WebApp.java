package com.making.scm.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/webresources")
public class WebApp extends ResourceConfig {
	public WebApp(){
        packages("com.making.scm.autenticaService");
    }
}
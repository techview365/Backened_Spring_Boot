package com.techview365.springboot1.springbootjerseyrestcrudjpa.config;

import com.techview365.springboot1.springbootjerseyrestcrudjpa.controller.UserResource;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/boot-jersey")
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration(){
        register(UserResource.class);
    }
}

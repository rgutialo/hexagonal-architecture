package com.example.quarkus;

import com.example.application.GetGreeting;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetingResource {
    @Inject
    GreetingServiceImpl greetingService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@QueryParam("name") String name) {
        GetGreeting getGreeting = new GetGreeting(greetingService);
        return getGreeting.execute(name);
    }
}
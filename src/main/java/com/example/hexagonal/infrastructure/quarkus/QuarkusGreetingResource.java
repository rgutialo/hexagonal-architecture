package com.example.hexagonal.infrastructure.quarkus;

import com.example.hexagonal.domain.service.GreetingService;
import com.example.hexagonal.application.GreetingServiceImpl;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/quarkus/greet")
@Produces(MediaType.TEXT_PLAIN)
public class QuarkusGreetingResource {

    private final GreetingService greetingService = new GreetingServiceImpl();

    @GET
    public String greet(@QueryParam("name") @DefaultValue("World") String name) {
        return greetingService.greet(name);
    }
}

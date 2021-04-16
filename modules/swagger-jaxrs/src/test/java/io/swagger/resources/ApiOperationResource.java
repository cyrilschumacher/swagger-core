package io.swagger.resources;

import io.swagger.annotations.Api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Api
@Path("/")
public class ApiOperationResource {
    @GET
    @Path("/users")
    @Uber(description = "Test Uber Description")
    public String getResponse() {
        return "Response";
    }
}

package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Api
@Produces(MediaType.APPLICATION_JSON)
public class TestSubResource {
    @Path("/otherStatus")
    @GET
    @ApiOperation("Get the other status!")
    public String otherStatus() {
        return "{\"a\":\"Still Ok!\"}";
    }
}
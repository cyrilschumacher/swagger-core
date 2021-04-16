package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Api(value = "/external/info/", description = "it's an api")
@Path("external/info/{id}")
public class Resource1085 {
    @ApiOperation(value = "test")
    @GET
    public Response getTest(@PathParam("id") Long id) {
        return Response.ok().build();
    }
}
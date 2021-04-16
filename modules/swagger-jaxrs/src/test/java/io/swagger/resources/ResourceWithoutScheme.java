package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "test")
public class ResourceWithoutScheme {
    @Path("/status")
    @GET
    @ApiOperation(value = "Get status")
    public String getStatus() {
        return "{\"status\":\"OK!\"}";
    }

    @Path("/value")
    @GET
    @ApiOperation(value = "Get value", protocols = "ftp")
    public String getValue() {
        return "{\"value\":\"OK!\"}";
    }
}

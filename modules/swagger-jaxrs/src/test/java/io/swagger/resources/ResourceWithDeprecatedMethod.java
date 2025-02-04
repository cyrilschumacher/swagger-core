package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Api
@Path("/")
public class ResourceWithDeprecatedMethod {

    @Deprecated
    @GET
    @Path("/testDeprecated")
    @ApiOperation("Method with deprecated annotation")
    public void testDeprecated() {
    }

    @GET
    @Path("/testAllowed")
    @ApiOperation("Method without deprecated annotation")
    public void testAllowed() {
    }
}

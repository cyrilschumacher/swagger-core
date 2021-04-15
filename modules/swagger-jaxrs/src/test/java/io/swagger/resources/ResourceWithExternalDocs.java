package io.swagger.resources;

import io.swagger.annotations.*;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Api
@Path("/")
public class ResourceWithExternalDocs {

    @GET
    @Path("/testString")
    @ApiOperation("Test operation without externalDocs")
    public void testStringGet() {
    }

    @POST
    @Path("/testString")
    @ExternalDocs(value = "Test Description", url = "https://swagger.io/")
    @ApiOperation("Test operation with externalDocs")
    public void testStringPost() {
    }
}

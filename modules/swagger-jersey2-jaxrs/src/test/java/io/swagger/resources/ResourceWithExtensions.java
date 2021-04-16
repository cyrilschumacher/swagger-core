package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Extension;
import io.swagger.annotations.ExtensionProperty;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Produces("application/json")
@Path("/rest")
@Api("hello-world-v1")
@SwaggerDefinition(info =
@Info(title = "hello-world",
        version = "v1",
        extensions = {
                @Extension(properties = {
                        @ExtensionProperty(name = "accessLevel", value = "private"),
                })}))
public class ResourceWithExtensions {

    public ResourceWithExtensions() {
    }

    @GET
    @Path("/test/")
    @ApiOperation(value = "Test",
            extensions = {
                    @Extension(properties = {
                            @ExtensionProperty(name = "externalPath", value = "/hello-world/v1/")
                    })})
    public Response getGreeting() {
        return Response.ok("Test").build();
    }
}
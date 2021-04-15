package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Api
@Path("subresource")
public class ClassPathSubResource {
    @GET
    @ApiOperation(value = "getCodeExtended")
    public String getCode(){
        return "400";
    }

    @GET @Path("{id}")
    public String getWidget(@PathParam("id") String id) {return "widget";}
}

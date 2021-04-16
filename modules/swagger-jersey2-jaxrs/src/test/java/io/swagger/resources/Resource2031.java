package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Api
@Path("/")
public class Resource2031 {
    @GET
    @Path("paged")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation("Get list of the paged pickticket for datatable")
    public Response getRequestData(@BeanParam NonFieldMethodBean object) throws Exception {
        return Response.ok().build();
    }

    public static class NonFieldMethodBean{
        private Integer id;
        private String name;

        public String sayHello() {
            return "Hello";
        }
    }
}

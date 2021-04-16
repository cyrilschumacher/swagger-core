package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Api("test")
public class TestResource {
    @Path("/status")
    @GET
    @ApiOperation("Get status")
    public String getStatus() {
        return "{\"status\":\"OK!\"}";
    }

    @Path("/more")
    @ApiOperation("Get more")
    @Produces({MediaType.APPLICATION_XML})
    public TestSubResource getSubResource(
            @ApiParam("a query param") @QueryParam("qp") Integer qp) {
        return new TestSubResource();
    }
}
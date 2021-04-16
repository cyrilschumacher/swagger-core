package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Sample;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@Api(value = "/basic", description = "Basic resource")
@Produces({"application/xml"})
@Path("/")
public class ResourceWithValidation {

    @GET
    @Path("/swagger-and-303")
    @ApiOperation(value = "Get",
            httpMethod = "GET")
    public Response getTestSwaggerAnd303(
            @ApiParam(value = "sample param data", required = false, allowableValues = "range[7, infinity]")
            @QueryParam("id") @NotNull @Min(5) Integer id) throws WebApplicationException {
        Sample out = new Sample();
        out.setName("foo");
        out.setValue("bar");
        return Response.ok().entity(out).build();
    }

    @GET
    @Path("/swagger")
    @ApiOperation(value = "Get",
            httpMethod = "GET")
    public Response getTestSwagger(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[7, infinity]")
            @QueryParam("id") Integer id) throws WebApplicationException {
        Sample out = new Sample();
        out.setName("foo");
        out.setValue("bar");
        return Response.ok().entity(out).build();
    }

    @GET
    @Path("/303")
    @ApiOperation(value = "Get",
            httpMethod = "GET")
    public Response getTest303(
            @ApiParam(value = "sample param data")
            @QueryParam("id") @NotNull @Min(10) Integer id) throws WebApplicationException {
        Sample out = new Sample();
        out.setName("foo");
        out.setValue("bar");
        return Response.ok().entity(out).build();
    }
}

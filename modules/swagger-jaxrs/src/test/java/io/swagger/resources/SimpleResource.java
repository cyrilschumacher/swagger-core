package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.NotFoundModel;
import io.swagger.models.Sample;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@Path("/")
@Api(value = "/basic", description = "Basic resource")
@Produces({"application/xml"})
public class SimpleResource {
    @GET
    @Path("/{id}")
    @ApiOperation(value = "Get object by ID",
            notes = "No details provided",
            response = Sample.class,
            position = 0)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid ID", response = NotFoundModel.class),
            @ApiResponse(code = 404, message = "object not found")})
    public Response getTest(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
            @DefaultValue("5")
            @PathParam("id") String id,
            @QueryParam("limit") Integer limit
    ) throws WebApplicationException {
        Sample out = new Sample();
        out.setName("foo");
        out.setValue("bar");
        return Response.ok().entity(out).build();
    }

    @GET
    @Path("/{id}/value")
    @Produces({"text/plain"})
    @ApiOperation(value = "Get simple string value",
            notes = "No details provided",
            response = String.class,
            position = 0)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid ID", response = NotFoundModel.class),
            @ApiResponse(code = 404, message = "object not found")})
    public Response getStringValue() throws WebApplicationException {
        return Response.ok().entity("ok").build();
    }

    @PUT
    @Path("/{id}")
    @ApiOperation(value = "Update by ID",
            notes = "No details provided",
            position = 1)
    @ApiResponses({
            @ApiResponse(code = 400, message = "Invalid ID"),
            @ApiResponse(code = 404, message = "object not found")})
    public Response updateTest(
            @ApiParam(value = "sample param data", required = true) Sample sample,
            @HeaderParam(value = "Authorization") String authorization,
            @QueryParam(value = "dateUpdated") java.util.Date dateUpdated,
            @CookieParam(value = "X-your-cookie") String cookieId) {
        return Response.ok().build();
    }

    @PUT
    @Path("/{bodyparams}")
    @ApiOperation(value = "Body parameters test")
    public Response sendBodyParams(
            @ApiParam(value = "Required body parameter", required = true) String param0,
            @ApiParam(value = "Non-required body parameter") String param1) {
        return Response.ok().build();
    }
}

package io.swagger.resources;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.models.Sample;

@Api(value = "/basicWithException", description = "Basic resource")
@Produces({"application/xml"})
@Path("/")
public class ResourceWithCustomException {

    @GET
    @Path("/{id}")
    @ApiOperation(value = "Get object by ID",
            notes = "No details provided",
            response = Sample.class,
            position = 0)
    public Response getTest(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
            @DefaultValue("5")
            @PathParam("id") String id,
            @QueryParam("limit") Integer limit
    ) throws CustomException {
        return Response.ok().build();
    }


    @PUT
    @Path("/{id}")
    @ApiOperation(value = "Update object by ID",
            notes = "No details provided",
            response = Sample.class,
            position = 0)
    @ApiResponses({
            @ApiResponse(code = 409, message = "Conflict")
    })
    public Response putTest(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
            @DefaultValue("5")
            @PathParam("id") String id,
            Sample sample
    ) throws CustomException {
        return Response.ok().build();
    }

}

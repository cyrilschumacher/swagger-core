package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.Sample;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Api(value = "/basicApiResponse", description = "Basic resource")
@Produces({"application/xml"})
@Path("/")
@ApiResponses({
        @ApiResponse(code = 409, message = "Class level"),
        @ApiResponse(code = 403, message = "Forbidden class level")
})
public class ResourceWithClassLevelApiResourceNoMethodLevelApiResources {

    @GET
    @Path("/{id}")
    public Response getTest(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
            @DefaultValue("5")
            @PathParam("id") String id,
            @QueryParam("limit") Integer limit
    ) {
        return Response.ok().build();
    }


    @PUT
    @Path("/{id}")
    public Response putTest(
            @ApiParam(value = "sample param data", required = true, allowableValues = "range[0,10]")
            @DefaultValue("5")
            @PathParam("id") String id,
            Sample sample
    ) {
        return Response.ok().build();
    }

}

package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Api(value = "/external/info/")
@Path("/")
public class RegexPathParamResource {
    @GET
    @ApiOperation(value = "this", tags = "tag1")
    @Path("/{report_type:[aA-zZ]+}")
    public Response getThis(@ApiParam(value = "test") @PathParam("report_type") String param) {
        return Response.ok().build();
    }
}

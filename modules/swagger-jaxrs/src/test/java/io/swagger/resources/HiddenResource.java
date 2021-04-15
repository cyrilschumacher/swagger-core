package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;

@Api(value = "/external/info/", hidden = true)
@Path("fun")
public class HiddenResource {
    @GET
    @ApiOperation(value = "this", tags = "tag1")
    @Path("/this")
    public Response getThis(@ApiParam(value = "test") ArrayList<String> tenantId) {
        return Response.ok().build();
    }
}
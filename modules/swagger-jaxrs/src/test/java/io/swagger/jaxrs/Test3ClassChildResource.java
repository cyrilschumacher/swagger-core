package io.swagger.jaxrs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Api
@Path("/classChild")
public class Test3ClassChildResource extends Test3ClassParentResource {

    @GET
    @Path("/testValue")
    @ApiOperation("Returns a test value")
    @ApiResponses({@ApiResponse(code = 200, message = "Success", response = String.class)})
    public Response getTestValue() {
        return Response.ok("Success").build();
    }
}

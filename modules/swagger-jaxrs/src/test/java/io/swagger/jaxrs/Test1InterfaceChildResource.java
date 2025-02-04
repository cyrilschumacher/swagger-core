package io.swagger.jaxrs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Api
@Path("/interfaceChild")
public interface Test1InterfaceChildResource extends Test1InterfaceParentResource {

    @GET
    @Path("/testValue")
    @ApiOperation("Returns a test value")
    @ApiResponses({@ApiResponse(code = 200, message = "Success", response = String.class)})
    Response getTestValue();
}

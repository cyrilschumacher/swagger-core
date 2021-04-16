package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;

@Api(value = "/external/info/")
@Path("external/info/")
public class NicknamedOperation {
    @ApiOperation(value = "test", nickname = "getMyNicknameTest")
    @GET
    public Response.Status getTest(@ApiParam(value = "test") ArrayList<String> tenantId) {
        return Response.Status.OK;
    }
}

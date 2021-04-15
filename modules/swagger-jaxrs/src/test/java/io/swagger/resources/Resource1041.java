package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.ArrayList;

@Api(value = "/external/info/", authorizations = @Authorization("my_auth"))
@Path("external/info/")
public class Resource1041 {
    @ApiOperation(value = "test")
    @GET
    @Path("/path1")
    public void getTest(@ApiParam(value = "test") ArrayList<String> tenantId) {
        return;
    }

    @ApiOperation(value = "test", authorizations = @Authorization("your_auth"))
    @GET
    @Path("/path2")
    public void getTest2(@ApiParam(value = "test") ArrayList<String> tenantId) {
        return;
    }
}
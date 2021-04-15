package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.EmptyModel;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Api("/test")
@Path("/test")
public class ResourceWithEmptyModel {
    @ApiOperation(value = "test", response = EmptyModel.class)
    @GET
    public void getTest(@ApiParam(value = "test") @QueryParam("test") Integer param) {
        return;
    }
}

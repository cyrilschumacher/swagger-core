package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@Api("/external/info/")
@Path("external/info/")
public class Resource937 {
    @ApiOperation(value = "test")
    @GET
    public void getTest(@ApiParam(required = false, defaultValue = "dogs") @DefaultValue("cats") @QueryParam("isRequired") Boolean isRequired) {
        return;
    }
}
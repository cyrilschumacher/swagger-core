package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Api
@Path("/")
public class ResourceWithImplicitFileParam {
    @POST
    @Path("/testString")
    @ApiImplicitParams({
      @ApiImplicitParam(name = "sort", paramType = "form", dataType = "java.io.File", required = false, value = "file to upload")
    })
    @ApiOperation("Test operation with implicit parameters")
    public void testImplicitFileParam() {
    }
}

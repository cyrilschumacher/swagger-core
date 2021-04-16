package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Employee;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Api("/test")
@Path("/test")
public class Resource942 {
    @ApiOperation(value = "test")
    @POST
    public void addTest(@ApiParam(required = false) Employee employee) {
        return;
    }

    @GET
    public Resource942SubResource getSub() {
        return new Resource942SubResource();
    }
}
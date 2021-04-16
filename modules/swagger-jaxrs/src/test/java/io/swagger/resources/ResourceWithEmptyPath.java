package io.swagger.resources;

import io.swagger.annotations.Api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("")
@Api
public class ResourceWithEmptyPath {

    @GET
    public void getTest() {
    }
}

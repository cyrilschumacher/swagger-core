package io.swagger.resources;

import io.swagger.annotations.Api;

import jakarta.ws.rs.Path;

@Api
@Path("/v1")
public class ClassPathParentResource {
    @Path("parent")
    public ClassPathSubResource getSubResource() {
        return new ClassPathSubResource();
    }
}

package io.swagger.resources.generics;

import io.swagger.annotations.Api;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api/users")
@Api(value = "/users")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class UserApiRoute extends ApiCrudRoute<UserEntity> {

}

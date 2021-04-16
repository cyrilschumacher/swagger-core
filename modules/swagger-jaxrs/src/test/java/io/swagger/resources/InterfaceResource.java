package io.swagger.resources;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

public interface InterfaceResource {
    @GET
    @Path("/{petId5}")
    @ApiOperation(value = "Find pet by ID",
            notes = "Returns a single pet",
            response = String.class
    )
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Pet not found")})
    Response methodFromInterface(
            @ApiParam(value = "ID of pet to return") @PathParam("petId5") Number petId);

    @GET
    @Path("/{petId6}")
    @ApiOperation(value = "Find pet by ID",
            notes = "Returns a single pet",
            response = String.class
    )
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Pet not found")})
    Response methodFromInterface(
            @ApiParam(value = "Method to check ArrayIndexOutOfBoundsException") @PathParam("petId6") Number petId, String str);

    @GET
    @Path("/deprecated/{petId7}")
    @ApiOperation(value = "Find pet by ID",
            notes = "Returns a single pet",
            response = String.class
    )
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Pet not found")})
    @Deprecated
    Response deprecatedMethodFromInterface(
            @ApiParam(value = "ID of pet to return") @PathParam("petId7") Number petId);
}

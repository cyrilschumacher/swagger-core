package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.ModelContainingModelWithReference;
import io.swagger.models.ModelWithReference;
import io.swagger.models.ModelWithReferences;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;

@Api(value = "/basic")
@Path("/")
public class ResourceWithMoreReferences {

    @GET
    @Path("/test")
    @ApiResponses({
            @ApiResponse(code = 500, message = "Error", reference = "http://swagger.io/schemas.json#/Models/ErrorResponse")
    })
    public Response getTest() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/some")
    @ApiOperation(value = "Get Some", responseReference = "http://swagger.io/schemas.json#/Models/SomeResponse")
    public Response getSome() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/testSome")
    @ApiOperation(value = "Get Some", responseReference = "http://swagger.io/schemas.json#/Models/SomeResponse")
    @ApiResponses({
            @ApiResponse(code = 500, message = "Error", reference = "http://swagger.io/schemas.json#/Models/ErrorResponse")
    })
    public Response getTestSome() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/testSomeOther")
    @ApiOperation(value = "Get Some Other", responseReference = "foo")
    @ApiResponses({
            @ApiResponse(code = 500, message = "Error", reference = "foo.json"),
            @ApiResponse(code = 502, message = "Error", reference = "foo.json.MyClass")
    })
    public Response getTestSomeOther() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/model")
    @ApiOperation(value = "Get Model", response = ModelContainingModelWithReference.class)
    public Response getModel() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/anotherModel")
    @ApiOperation(value = "Get Another Model", response = ModelWithReference.class)
    public Response getAnotherModel() throws WebApplicationException {
        return Response.ok().build();
    }

    @GET
    @Path("/aThirdModel")
    @ApiOperation(value = "Get A Third Model", response = ModelWithReferences.class)
    public Response getAThirdModel() throws WebApplicationException {
        return Response.ok().build();
    }
}

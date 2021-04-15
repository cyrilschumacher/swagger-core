package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Response;

@Api(value = "test")
@Path("fun")
public class Issue1979Resource {
    @GET
    @ApiOperation(value = "tests read only", tags = "tag1")
    @Path("/readOnly")
    public Response operationWithReadOnly(@ApiParam(value = "test", readOnly = true) @QueryParam("tenantId") String tenantId) {
        return Response.ok().build();
    }

    @GET
    @ApiOperation(value = "tests read only", tags = "tag1")
    @Path("/allowEmpty")
    public Response operationWithEmptyValue(@ApiParam(value = "test", allowEmptyValue = true) @QueryParam("deleteEverything") Boolean deleteEverything) {
        return Response.ok().build();
    }
}

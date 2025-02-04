package io.swagger.resources;

import io.swagger.annotations.*;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;
import java.util.ArrayList;

@Api("/external/info/")
@Path("/")
public class ClassWithExamplePostClass {
    @ApiOperation(value = "test")
    @POST
    @Path("external/info")
    public void postTest(@ApiParam(value = "test",
    examples = @Example(value = {
            @ExampleProperty(mediaType="application/json", value="[\"a\",\"b\"]")
    })) ArrayList<String> tenantId) {
        return;
    }

    @ApiOperation(value = "test")
    @POST
    @Path("external/info2")
    @ApiImplicitParams({
        @ApiImplicitParam(
                paramType = "body",
                name = "myPody",
                dataTypeClass = String[].class,
                examples = @Example(value = {
                        @ExampleProperty(mediaType="application/json", value="[\"a\",\"b\"]")}))
    })
    public void implicitPostTest() {
        return;
    }

    @ApiOperation(value = "test")
    @GET
    @Path("external/info")
    public void queryExample(@ApiParam(value = "test",
    example = "a,b,c") @QueryParam("tenantId") ArrayList<String> tenantId) {
        return;
    }

    @ApiOperation(value = "test")
    @GET
    @Path("external/info2")
    @ApiImplicitParams({
        @ApiImplicitParam(
                paramType = "query",
                name = "myId",
                dataTypeClass = Long.class,
                example = "77") })
    public void implicitQueryExample() {
        return;
    }
}

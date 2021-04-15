package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import java.util.List;

@Api
@Path("/collectionFormat")
public class CollectionFormatResource {

    @POST
    @Path("/testQueryParam")
    @ApiOperation("Tests Query Param")
    public void testQueryParam(@QueryParam("list") List<Integer> list, @QueryParam("scalar") Integer scalar,
                               @QueryParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }

    @POST
    @Path("/testFormParam")
    @ApiOperation("Tests Form Param")
    public void testFormParam(@FormParam("list") List<Integer> list, @FormParam("scalar") Integer scalar,
                              @FormParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }

    @POST
    @Path("/testPathParam")
    @ApiOperation("Tests Path Param")
    public void testPathParam(@PathParam("list") List<Integer> list, @PathParam("scalar") Integer scalar,
                              @PathParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }

    @POST
    @Path("/testHeaderParam")
    @ApiOperation("Tests Header Param")
    public void testHeaderParam(@HeaderParam("list") List<Integer> list, @HeaderParam("scalar") Integer scalar,
                                @HeaderParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }

    @POST
    @Path("/testCookieParam")
    @ApiOperation("Tests Cookie Param")
    public void testCookieParam(@CookieParam("list") List<Integer> list, @CookieParam("scalar") Integer scalar,
                                @CookieParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }

    @POST
    @Path("/testMixedParam")
    @ApiOperation("Tests Mixed Param")
    public void testMixedParam(@QueryParam("queryList") List<Integer> queryList,
                               @PathParam("pathList") List<Integer> pathList, @HeaderParam("scalar") Integer scalar,
                               @CookieParam("forced") @ApiParam(allowMultiple = true) int forced) {
    }
}

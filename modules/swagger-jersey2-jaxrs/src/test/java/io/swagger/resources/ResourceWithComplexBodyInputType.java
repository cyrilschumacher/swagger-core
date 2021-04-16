package io.swagger.resources;

import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("myapi")
@Api(value = "myapi", description = "myapi routes", produces = "application/json")
public class ResourceWithComplexBodyInputType {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("testPostWithBody")
    @ApiOperation(response = String.class, value = "Returns string with provided parameter")
    public String testPostWithBody(@ApiParam(name = "body", value = "input parameters in json form")
                                   List<ClassWithString> items) {

        List<String> result = Lists.newArrayList();
        return String.format("Given parameters are %s", Arrays.toString(result.toArray(new String[result.size()])));
    }

}
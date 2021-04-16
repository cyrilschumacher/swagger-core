package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Api(value = "/root")
@Path("/")
public class ResourceWithResponseExamples {

    @GET
    @Path("testPrimitiveResponses")
    @ApiResponses({
            @ApiResponse(
                    code = 404,
                    message = "Message for String",
                    response = String.class,
                    examples = @Example(value =
                            {
                                    @ExampleProperty(mediaType = "*/*", value = "message example 1"),
                                    @ExampleProperty(mediaType = "application/json", value = "message example 2")
                            }
                    ))
    })
    public Response testPrimitiveResponses() {
        return null;
    }

}

package io.swagger.resources;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/v1/users")
@IndirectAnnotation
public interface IndirectImplicitParams {

    @ApiImplicitParams(value = {
            @ApiImplicitParam(
                    paramType = "query",
                    name = "myQuery",
                    dataType = "java.lang.String"
            )
    })
    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface IndirectImplicitQueryParam {

    }

    @POST
    @IndirectImplicitQueryParam
    void createUser();

    @GET
    @Path("/{id}")
    String findById(@PathParam("id") String id);

}

package io.swagger.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Sample;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Api(value = "/basic", description = "Basic resource", produces = MediaType.APPLICATION_ATOM_XML, consumes = MediaType.APPLICATION_XHTML_XML)
@Path("/")
public class ApiConsumesProducesResource {

    @GET
    @Path("/{id}")
    @ApiOperation(value = "Get object by ID",
            notes = "No details provided",
            response = Sample.class,
            position = 0)
    public Response noConsumesProduces() {
        return Response.ok().entity("ok").build();
    }

    @GET
    @Path("/{id}/value")
    @Produces("text/html;charset=UTF-8,text/json")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get simple string value",
            notes = "No details provided",
            response = String.class,
            position = 0,
            produces = "text/plain,text/xml;charset=UTF-8",
            consumes = "application/xml,text/html;charset=UTF-8")
    public Response bothConsumesProduces() {
        return Response.ok().entity("ok").build();
    }

    @PUT
    @Path("/{id}")
    @Produces({"text/plain,text/xml;charset=UTF-8"})
    @Consumes(MediaType.APPLICATION_JSON + ",text/html;charset=UTF-8")
    @ApiOperation(value = "Update by ID",
            notes = "No details provided",
            position = 1)
    public Response rsConsumesProduces() {
        return Response.ok().build();
    }

    @PUT
    @Path("/{id}/value")
    @ApiOperation(value = "Update by ID",
            notes = "No details provided",
            position = 1,
            produces = "text/plain",
            consumes = "application/xml")
    public Response apiConsumesProduces() {
        return Response.ok().build();
    }
}
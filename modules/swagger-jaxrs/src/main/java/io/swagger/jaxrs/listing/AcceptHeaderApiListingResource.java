package io.swagger.jaxrs.listing;

import io.swagger.annotations.ApiOperation;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.*;

/**
 * Created by rbolles on 2/15/16.
 */
@Path("/swagger")
public class AcceptHeaderApiListingResource extends BaseApiListingResource {

    @Context
    ServletContext context;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(value = "The swagger definition in JSON", hidden = true)
    public Response getListingJson(
            @Context Application app,
            @Context ServletConfig sc,
            @Context HttpHeaders headers,
            @Context UriInfo uriInfo) {
        return getListingJsonResponse(app, context, sc, headers, uriInfo);
    }

    @GET
    @Produces("application/yaml")
    @ApiOperation(value = "The swagger definition in YAML", hidden = true)
    public Response getListingYaml(
            @Context Application app,
            @Context ServletConfig sc,
            @Context HttpHeaders headers,
            @Context UriInfo uriInfo) {
        return getListingYamlResponse(app, context, sc, headers, uriInfo);
    }
}

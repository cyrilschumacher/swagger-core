package io.swagger.jaxrs.listing;

import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.*;

@Path("/swagger.{type:json|yaml}")
public class ApiListingResource extends BaseApiListingResource {

    @Context
    ServletContext context;

    @GET
    @Produces({MediaType.APPLICATION_JSON, "application/yaml"})
    @ApiOperation(value = "The swagger definition in either JSON or YAML", hidden = true)
    public Response getListing(
            @Context Application app,
            @Context ServletConfig sc,
            @Context HttpHeaders headers,
            @Context UriInfo uriInfo,
            @PathParam("type") String type) {
        if (StringUtils.isNotBlank(type) && type.trim().equalsIgnoreCase("yaml")) {
            return getListingYamlResponse(app, context, sc, headers, uriInfo);
        } else {
            return getListingJsonResponse(app, context, sc, headers, uriInfo);
        }
    }

}

package io.swagger.resources;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.FormDataParam;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import java.io.InputStream;

@Path("test")
@Api(value = "test", description = "test routes", produces = "application/json")
public class ResourceWithFormData {

    @POST
    @Path("/document/{documentName}.json")
    @ApiOperation(value = "uploadAttachAndParseUserDocument", notes = "Uploads, parses, and attaches the document to the user's job application.", position = 509)
    public String uploadAttachAndParseUserDocument(@PathParam("documentName") final String documentName,
                                                   @FormDataParam("document") final FormDataContentDisposition detail,
                                                   @FormDataParam("document2") final FormDataBodyPart bodyPart,
                                                   @FormDataParam("input") final InputStream input,
                                                   @FormDataParam("id") final Integer id) throws Exception {
        return "";
    }
}

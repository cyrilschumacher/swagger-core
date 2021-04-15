package com.splitresourcesTest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 * Created by KangoV on 2016-05-22
 * #1800
 */
@Path("/api/1.0")
public interface SplitResource {
	
  @GET
	public Response getChildren();
	
}
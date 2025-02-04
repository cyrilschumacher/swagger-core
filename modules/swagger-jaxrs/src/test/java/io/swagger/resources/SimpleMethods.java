package io.swagger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

public class SimpleMethods {
    @GET
    @Path("/int")
    public int getInt() {
        return 0;
    }

    @GET
    @Path("/intArray")
    public int[] getIntArray() {
        return new int[]{0};
    }

    @GET
    @Path("/string")
    public String[] getStringArray() {
        return new String[]{};
    }

    @GET
    @Path("/stringArray")
    public void getWithIntArrayInput(@QueryParam("ids") int[] inputs) {
    }
}
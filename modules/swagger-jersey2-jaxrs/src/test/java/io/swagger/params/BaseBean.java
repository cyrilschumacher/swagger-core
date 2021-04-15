package io.swagger.params;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.FormParam;

/**
 * Simple Bean containing two parameters.
 */
public class BaseBean {

    @CookieParam("CookieParam")
    private String cookieParam;
    private String formParam;

    public String getCookieParam() {
        return cookieParam;
    }

    public void setCookieParam(String cookieParam) {
        this.cookieParam = cookieParam;
    }

    public String getFormParam() {
        return formParam;
    }

    @FormParam("FormParam")
    public void setFormParam(String formParam) {
        this.formParam = formParam;
    }

}

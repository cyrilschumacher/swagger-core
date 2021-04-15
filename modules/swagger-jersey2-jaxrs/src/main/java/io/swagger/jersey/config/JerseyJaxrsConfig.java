package io.swagger.jersey.config;

import io.swagger.jaxrs.config.DefaultJaxrsConfig;
import jakarta.servlet.ServletConfig;

public class JerseyJaxrsConfig extends DefaultJaxrsConfig {
    @Override
    public void init(ServletConfig servletConfig) throws jakarta.servlet.ServletException {
        super.init(servletConfig);
    }
}

package io.swagger.servlet.config;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;

public class DefaultServletConfig extends HttpServlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        super.init(servletConfig);

        servletConfig.getServletContext().setAttribute("reader", new WebXMLReader(servletConfig));
        servletConfig.getServletContext().setAttribute("scanner", new ServletScanner(servletConfig));
    }
}

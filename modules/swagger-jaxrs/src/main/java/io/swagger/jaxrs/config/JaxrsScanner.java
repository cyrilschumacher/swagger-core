package io.swagger.jaxrs.config;

import io.swagger.config.Scanner;

import jakarta.servlet.ServletConfig;
import jakarta.ws.rs.core.Application;
import java.util.Set;

public interface JaxrsScanner extends Scanner {
    Set<Class<?>> classesFromContext(Application app, ServletConfig sc);
}
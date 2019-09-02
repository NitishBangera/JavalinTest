package com.test.javalin;

import java.util.List;

import io.dinject.SystemContext;
import io.dinject.controller.WebRoutes;
import io.javalin.Javalin;

public class App {
	public static void main(String[] args) {
        Javalin app = Javalin.create().start(8080);
        
        // get all WebRoutes from DI Context
        List<WebRoutes> webRoutes = SystemContext.getBeans(WebRoutes.class);

        // register all WebRoutes with Javalin
        app.routes(() -> webRoutes.forEach(WebRoutes::registerRoutes));
    }
}

package com.boot.home.config;

// Legacy servlet initializer disabled because this is a Spring Boot app.
// Keeping both Boot auto-config and this classic initializer active causes
// duplicate Spring MVC/Security registration and redirect loops.
//
// import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
// public class WebAppInitializer extends
// AbstractAnnotationConfigDispatcherServletInitializer {
//
//     protected Class<?>[] getRootConfigClasses() {
//         return new Class[] { MyAppConfig.class };
//     }
//
//     protected Class<?>[] getServletConfigClasses() {
//         return null;
//     }
//
//     protected String[] getServletMappings() {
//         return new String[] { "/" };
//     }
// }
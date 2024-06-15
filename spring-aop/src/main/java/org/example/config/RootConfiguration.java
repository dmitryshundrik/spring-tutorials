package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * To use @AspectJ aspects in a Spring configuration you need to enable Spring support for configuring Spring AOP based
 * on @AspectJ aspects, and autoproxying beans based on whether or not they are advised by those aspects.
 * To enable @AspectJ support with Java @Configuration add the @EnableAspectJAutoProxy annotation.
 */
@Configuration
@ComponentScan(basePackages = "org.example")
@EnableAspectJAutoProxy
public class RootConfiguration {
}

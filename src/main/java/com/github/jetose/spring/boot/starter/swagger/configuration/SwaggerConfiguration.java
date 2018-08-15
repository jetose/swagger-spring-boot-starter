package com.github.jetose.spring.boot.starter.swagger.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

@Configuration
@ConditionalOnProperty(name = "swagger.enable", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class
})
public class SwaggerConfiguration {

}

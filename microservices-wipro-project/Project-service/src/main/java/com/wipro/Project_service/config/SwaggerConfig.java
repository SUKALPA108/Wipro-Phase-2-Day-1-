package com.wipro.Project_service.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI collegeManagementOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("College Management API")
                        .description("API for managing colleges, departments, and faculties")
                        .version("1.0.0"));
    }
}
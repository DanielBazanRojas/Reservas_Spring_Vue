package com.dwi.backend.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket bookingApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dwi.backend"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo getApiInfo(){
        Contact contact = new Contact("soraci", "http://soraci.pe", "soraci@claro.pues");
        return new ApiInfoBuilder()
                .title("Reservas")
                .description("Documentos de la api")
                .version("1.0.0")
                .license("Apache 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                .contact(contact)
                .build();
    }
}

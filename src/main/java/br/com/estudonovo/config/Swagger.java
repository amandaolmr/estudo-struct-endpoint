package br.com.estudonovo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class Swagger {

    @Bean
    public Docket ApiDesafioArmazemPb() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .select()
                .apis(RequestHandlerSelectors.basePackage("br.com.estudonovo")).paths(PathSelectors.regex("/.*"))
                .build().apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        return new ApiInfo("API DE ESTUDO", "API DE ESTUDO", "1.0", "Termos para ServiÃƒÂ§o",
                new Contact("https://www.linkedin.com/in/amandaolmr/", "(83) 99404-3126", "amandaoliveirabcc@gmail.com	"),
                "Apache License Version 2.0", "https://www.apache.org/licesen.html", new ArrayList<>());
    }


}

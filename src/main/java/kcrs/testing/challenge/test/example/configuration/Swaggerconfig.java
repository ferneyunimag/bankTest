package kcrs.testing.challenge.test.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swaggerconfig {

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("test bank")
                .description("API bank test")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.OAS_30)
                //.tags(new Tag("accounts", "accounts related"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("kcrs.testing.challenge.test.example"))
                .build()
                .apiInfo(apiInfo());
    }


}


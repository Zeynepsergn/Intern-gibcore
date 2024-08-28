//package tr.gov.gib.gibcore.config;
//
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Contact;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Value("${swagger.info.title}")
//    private String title;
//
//    @Value("${swagger.info.version}")
//    private String version;
//
//    @Value("${swagger.info.description}")
//    private String description;
//
//    @Value("${swagger.info.termsOfService}")
//    private String termsOfService;
//
//    @Value("${swagger.info.contact.name}")
//    private String name;
//
//    @Value("${swagger.info.contact.email}")
//    private String email;
//
//    @Bean
//    public OpenAPI customOpenAPI() {
//        return new OpenAPI()
//                .info(new Info()
//                        .title(title)
//                        .version(version)
//                        .description(description)
//                        .termsOfService(termsOfService)
//                        .license(new License()
//                                .name("Gelir Idaresi Baskanligi Lisanlidir.")
//                                .url(termsOfService)
//                        )
//                        .contact(new Contact()
//                                .email(email)
//                                .name(name)
//                                .url(email)
//                        )
//                );
//    }
//}

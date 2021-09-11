package dare.springframework.sfppetclinic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

/*

    @Bean
    @Order(0)
    public MappingJackson2HttpMessageConverter actuatorJacksonHttpMessageConverter(Jackson2ObjectMapperBuilder builder) {
        var converter = new MappingJackson2HttpMessageConverter(builder.build()) {
            @Override
            protected boolean canWrite(MediaType mediaType) {
                //only exact matches
                if (mediaType == null) {
                    return false;
                }
                return super.canWrite(mediaType);
            }
        };
        converter.setSupportedMediaTypes(MediaType.parseMediaTypes(List.of(
                ActuatorMediaType.V2_JSON,
                ActuatorMediaType.V3_JSON
        )));
        return converter;
    }

    @Bean
    @Order(Ordered.LOWEST_PRECEDENCE)
    MappingJackson2HttpMessageConverter defaultJackson2HttpMessageConverter(Jackson2ObjectMapperBuilder builder) {
        builder.serializationInclusion(JsonInclude.Include.NON_NULL).propertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return new MappingJackson2HttpMessageConverter(builder.build());
    }

*/

}

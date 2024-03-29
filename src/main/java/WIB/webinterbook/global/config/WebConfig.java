package WIB.webinterbook.global.config;

import WIB.webinterbook.global.config.converter.StringToStudyTagConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins(
                "http://localhost:8080",
//                "http://ec2-3-39-199-70.ap-northeast-2.compute.amazonaws.com:8080",
                "http://localhost:3000",
                "https://localhost:3000",
                "https://127.0.0.1:3000")
            .allowedMethods("GET", "POST", "PUT");
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToStudyTagConverter());
    }
}
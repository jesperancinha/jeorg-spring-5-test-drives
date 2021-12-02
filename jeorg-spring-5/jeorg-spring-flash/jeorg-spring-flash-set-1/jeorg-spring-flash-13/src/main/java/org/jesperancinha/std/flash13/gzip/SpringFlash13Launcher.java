package org.jesperancinha.std.flash13.gzip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.lang.NonNull;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.EncodedResourceResolver;
import org.springframework.web.servlet.resource.GzipResourceResolver;

@SpringBootApplication
public class SpringFlash13Launcher {
    public static void main(String[] args) {
        SpringApplication.run(SpringFlash13Launcher.class, args);
    }

    /**
     * I leave both {@link EncodedResourceResolver} and {@link GzipResourceResolver} in the chain because both work
     * {@link EncodedResourceResolver} is the new version and {@link GzipResourceResolver} is now deprecated.
     *
     * @return {@link WebMvcConfigurer}
     */
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(
                    @NonNull
                            ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/static/")
                        .resourceChain(false)
                        .addResolver(new EncodedResourceResolver())
                        .addResolver(new GzipResourceResolver());
            }
        };
    }
}

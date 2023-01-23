package org.jesperancinha.std.flash410;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;

@Configuration
@EnableWebMvc
@ImportResource({
        "classpath:WEB-INF/dispatcher-servlet.xml",
        "classpath:WEB-INF/spring-security.xml"
})
@EnableWebSecurity
public class SpringFlash410MvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
        BLUE.printGenericLn("Initializing viewResolver -> %s", internalResourceViewResolver);
        printUnicornsLn(100);
        BRIGHT_MAGENTA.printGenericLn("Remember that you need the jasper dependency for the JSP Mapping to work");
        return internalResourceViewResolver;
    }

}
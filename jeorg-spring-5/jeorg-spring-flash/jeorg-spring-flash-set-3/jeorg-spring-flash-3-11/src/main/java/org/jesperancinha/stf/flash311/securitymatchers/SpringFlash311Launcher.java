package org.jesperancinha.stf.flash311.securitymatchers;

import org.jesperancinha.stf.flash311.securitymatchers.configuration.Flash311ConfigurationAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringFlash311Launcher {
    public static void main(String[] args) {
        SpringApplication.run(SpringFlash311Launcher.class, args);
    }
}

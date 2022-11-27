package org.jesperancinha.std.flash17.cipher.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

@Profile("test")
@Configuration
@EnableWebSecurity
public class Flash17CSRFConfigurationAdapter {

    private JdbcUserDetailsManager jdbcUserDetailsManager;

    public Flash17CSRFConfigurationAdapter(final JdbcUserDetailsManager jdbcUserDetailsManager) {
        this.jdbcUserDetailsManager = jdbcUserDetailsManager;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        GREEN.printGenericLn("Note that ADMIN in this case is a short statement for ROLE_ADMIN");
        GREEN.printGenericLn("When we assign our SimpleGrantedAuthority to our Authentication, we give it a role as parameter");
        GREEN.printGenericLn("The role is an extended name. In our case it will be ROLE_ADMIN");
        return http
                .userDetailsService(jdbcUserDetailsManager)
                .authorizeRequests()
                .requestMatchers("/open/**")
                .permitAll()
                .requestMatchers("/**").hasRole("ADMIN")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin().and().build();
    }

}
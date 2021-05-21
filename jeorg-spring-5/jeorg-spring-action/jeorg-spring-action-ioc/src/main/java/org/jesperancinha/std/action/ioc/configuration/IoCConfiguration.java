package org.jesperancinha.std.action.ioc.configuration;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.jesperancinha.std.action.ioc.model.Cutlery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title;

@Configuration
public class IoCConfiguration {

    @Value("La tagliatella")
    public String restaurante;

    @Bean
    public Cutlery cutlery(
            @Value("${org.jesperancinha.std.action.ioc.cutlery}")
            final String allCutlery) {
        return Cutlery
                .builder()
                .contents(allCutlery)
                .build();
    }

    @Autowired
    public void perform(
            @Value("${org.jesperancinha.std.action.ioc.cutlery}")
            final String allCutlery) {
        ConsolerizerComposer.outSpace()
                .blue("This is directly done via initialization")
                .blue(allCutlery)
                .reset();

        ConsolerizerComposer.outSpace()
                .cyan(title("Our restaurante name is:"))
                .cyan(restaurante)
                .reset();
    }

    @Value("${org.jesperancinha.std.action.ioc.cutlery}")
    public void perform2(final String allCutlery) {
        ConsolerizerComposer.outSpace()
                .blue("This is directly done via initialization2")
                .blue(allCutlery)
                .reset();

        ConsolerizerComposer.outSpace()
                .cyan(title("Our restaurante name is:"))
                .cyan(restaurante)
                .reset();
    }


}

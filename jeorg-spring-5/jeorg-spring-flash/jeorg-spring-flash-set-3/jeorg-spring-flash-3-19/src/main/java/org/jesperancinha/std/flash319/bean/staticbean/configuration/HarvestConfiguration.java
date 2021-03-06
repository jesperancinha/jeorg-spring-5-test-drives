package org.jesperancinha.std.flash319.bean.staticbean.configuration;

import org.jesperancinha.std.flash319.bean.staticbean.model.Harvest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

@Configuration
public class HarvestConfiguration {

    @Bean
    public static Harvest harvest1() {
        final Harvest forTheWorld = new Harvest("for the world");
        GREEN.printGenericLn("This is the static harvest. It has been created -> %s", forTheWorld);
        return forTheWorld;
    }

    @Bean
    public Harvest harvest2() {
        final Harvest forTheWorld = new Harvest("for the world");
        MAGENTA.printGenericLn("This is the instance harvest. It has been created -> %s", forTheWorld);
        return forTheWorld;
    }
}

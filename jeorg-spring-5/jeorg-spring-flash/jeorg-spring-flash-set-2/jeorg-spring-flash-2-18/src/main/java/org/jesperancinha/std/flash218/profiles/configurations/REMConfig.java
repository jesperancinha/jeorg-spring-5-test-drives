package org.jesperancinha.std.flash218.profiles.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

@Configuration
@Profile("rem")
public class REMConfig {
    REMConfig() {
        ORANGE.printGenericLn("We would circle and we'd circle and we'd circle to stop and consider and centered on the pavement stacked up all the trucks jacked up and our wheels in slush and orange crush in pocket and all this here county, hell, any county, it's just like heaven here, and I was remembering and I was just in a different county and all then this whirlybird that I headed for I had my goggles pulled off; I knew it all, I knew every back road and every truck stop");
    }
}

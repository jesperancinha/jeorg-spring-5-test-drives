package org.jesperancinha.std.flash212.logs;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.jesperancinha.console.consolerizer.console.ConsolerizerComposer.title;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringFlash212LauncherTest {

    @Test
    void testContext() {
        ConsolerizerComposer.outSpace()
                .magenta(title("Logback example"))
                .magenta("In this example we check how Spring Framework can use Logback when it finds a logback file")
                .reset();
    }
}
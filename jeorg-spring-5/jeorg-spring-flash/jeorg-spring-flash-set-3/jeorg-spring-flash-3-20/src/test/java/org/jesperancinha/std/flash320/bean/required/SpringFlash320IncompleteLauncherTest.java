package org.jesperancinha.std.flash320.bean.required;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * This test is purposely here to investigate what happens when injection is incorrectly setup in the beans.xml file.
 */
@SpringBootTest
@ActiveProfiles("incomplete")
@Disabled
class SpringFlash320IncompleteLauncherTest {

    @Test
    void testContext() {
    }
}
package org.jesperancinha.std.flash218.profiles

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("garbage", "pumpkin")
internal class SpringFlash218GarbageORPumpkinConfigLauncherKotlinTest {
    @Test
    fun `should load context correctly`() {
    }
}
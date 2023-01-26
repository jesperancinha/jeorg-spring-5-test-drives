package org.jesperancinha.std.flash28.security

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("prod")
internal class SpringFlash28LauncherProdKotlinTest(
    @Autowired
    private val mockMvc: MockMvc
) {
    @Test
    @Throws(Exception::class)
    fun `should return bird`() {
        mockMvc.perform(get("/"))
            .andExpect(status().isOk)
            .andExpect(content().string("A little bird lit down on henry lee"))
    }
}
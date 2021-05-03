package org.jesperancinha.std.flash415.http.converter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.jesperancinha.std.flash415.http.converter.domain.TearDrop;
import org.jesperancinha.std.flash415.http.converter.domain.TearDropReport;
import org.jesperancinha.std.flash415.http.converter.domain.TearDropType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;
import java.util.Set;

import static org.jesperancinha.std.flash415.http.converter.domain.TearDropType.HAPPINESS;
import static org.jesperancinha.std.flash415.http.converter.domain.TearDropType.SADNESS;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class TearDropControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void testCreateTearDropReport_whenCalled_thenReturnConvertedValues() throws Exception {
        final var tearDrop1 = TearDrop.builder().tearDropType(HAPPINESS).count(100L).build();
        final var tearDrop2 = TearDrop.builder().tearDropType(SADNESS).count(50L).build();

        mockMvc.perform(post("/")
                .contentType(APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(List.of(tearDrop1, tearDrop2))))
                .andExpect(status().isOk())
                .andExpect(content().json(objectMapper.writeValueAsString(
                        TearDropReport.builder().totalCount(150L).average(75L).stdDeviation(35L).tearDropTypeSet(Set.of(SADNESS, HAPPINESS)).build()
                )));
    }
}
package org.jesperancinha.std.flash27.monitoring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Health(
        @JsonProperty("components") Components components,
        @JsonProperty("status") String status) {
}

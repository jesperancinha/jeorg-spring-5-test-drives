package org.jesperancinha.std.flash27.monitoring.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor(onConstructor_ = @JsonCreator)
public class Details {
    @JsonProperty("database")
    String database;
    @JsonProperty("result")
    Integer result;
    @JsonProperty("validationQuery")
    String validationQuery;
    @JsonProperty("total")
    Long total;
    @JsonProperty("free")
    Long free;
    @JsonProperty("threshold")
    Long threshold;
    @JsonProperty("lyric")
    String lyric;
    @JsonProperty("path")
    String path;
    @JsonProperty("exists")
    Boolean exists;
}

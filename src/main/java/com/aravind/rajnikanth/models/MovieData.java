package com.aravind.rajnikanth.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MovieData {
    @Getter(onMethod_ = {@JsonProperty("cast")})
    @Setter(onMethod_ = {@JsonProperty("cast")})
    private Cast[] cast;
    @Getter(onMethod_ = {@JsonProperty("crew")})
    @Setter(onMethod_ = {@JsonProperty("crew")})
    private Cast[] crew;
    @Getter(onMethod_ = {@JsonProperty("id")})
    @Setter(onMethod_ = {@JsonProperty("id")})
    private long id;
}

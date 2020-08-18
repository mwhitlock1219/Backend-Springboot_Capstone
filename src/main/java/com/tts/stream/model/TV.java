package com.tts.stream.model;

import java.util.List;

import lombok.Data;

@Data
public class TV {
    private String name;
    private String overview;
    private String vote_average;
    private List<String> origin_country;
    private String first_air_date;
    private String id;

}
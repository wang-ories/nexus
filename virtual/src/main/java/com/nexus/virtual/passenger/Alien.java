package com.nexus.virtual.passenger;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alien {
    private Long id;
    private String name;
    private  String itinerary;
    private String code;
    private  Integer weight;

    @Override
    public String toString() {
        return "alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itinerary='" + itinerary + '\'' +
                ", code='" + code + '\'' +
                ", weight=" + weight +
                '}';
    }
}

package com.nexus.virtual.passenger;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlienService {
    public List<Alien> getAliens(){
        return  List.of(
                new Alien(1L, "Aliezus ", "Saturn-Mars-Jupiter", "0SO45", 450)
        );
    }
}

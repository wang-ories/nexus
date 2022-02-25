package com.nexus.virtual.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alien")
public class AlienController {
    private final AlienService alienService;

    @Autowired
    public AlienController(AlienService alienService) {
        this.alienService = alienService;
    }

    @GetMapping
    public List<Alien> getAliens(){
        return  alienService.getAliens();
    }
}

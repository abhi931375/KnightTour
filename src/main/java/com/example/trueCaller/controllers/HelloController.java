package com.example.trueCaller.controllers;

import com.example.trueCaller.services.PieceTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    private PieceTourService pieceTourService;

    @Autowired
    public void setPieceTourService(PieceTourService pieceTourService) {
        this.pieceTourService = pieceTourService;
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/getMoves/{xCoOrd}/{yCoOrd}")
    public List<List<Integer>> getPossibleValidMoves(@PathVariable int xCoOrd, @PathVariable int yCoOrd) {
        String x =  "This is the test page with values x = " + xCoOrd + " and y = " + yCoOrd;
        return pieceTourService.getValidMoves(xCoOrd, yCoOrd);
    }
}

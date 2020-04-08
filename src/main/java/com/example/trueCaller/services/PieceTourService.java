package com.example.trueCaller.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PieceTourService {
    public List<List<Integer>> getValidMoves(int x, int y);
}

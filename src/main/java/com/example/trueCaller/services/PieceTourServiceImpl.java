package com.example.trueCaller.services;

import com.example.trueCaller.models.PieceTour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PieceTourServiceImpl implements PieceTourService {
    @Autowired
    private PieceTour pieceTour;

    @Override
    public List<List<Integer>> getValidMoves(int x, int y) {
        pieceTour.tours = new ArrayList<List<Integer> >();
        pieceTour.getMoves(x, y);
        return pieceTour.tours;
    }
}

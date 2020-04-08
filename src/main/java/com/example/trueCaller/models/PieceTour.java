package com.example.trueCaller.models;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PieceTour{
    final private int len = 10;
    final private int width = 10;
    final private int digonalSteps = 2;
    final private int horizontalSteps = 3;
    final private int verticalSteps = 3;

    private final int[][] nonDigonalArr = {{0, verticalSteps} ,{horizontalSteps, 0} ,{0, -verticalSteps}, {-horizontalSteps, 0}};
    private final int[][] digonalArr = {{digonalSteps, -digonalSteps}, {digonalSteps, digonalSteps}, {-digonalSteps, digonalSteps}, {-digonalSteps, -digonalSteps}};

    public List<List<Integer> > tours;

    private void printValidMoves(int x, int y){
        System.out.println("Valid Moves after one tour from x=" + x + " and y=" + y + " are: ");
        for(int i=0; i<tours.size(); i++){
            System.out.print("x = " + tours.get(i).get(0));
            System.out.print(" ,y = " + tours.get(i).get(1));
            System.out.println();
        }
    }

    private boolean validateMove(int x, int y){
        return ((x < len) && (y < width) && (x >= 0) && (y >= 0));
    }

    private void allMoves(int x, int y, int[][] moves){
        int xCoord, yCoord;
        for(int i=0; i<moves.length; i++){
            xCoord = x+moves[i][0];
            yCoord = y+moves[i][1];
            if (validateMove(xCoord, yCoord))
                tours.add(Arrays.asList(xCoord, yCoord));
        }
    }

    public void getMoves(int x, int y){
        allMoves(x, y, nonDigonalArr);
        allMoves(x, y, digonalArr);
    }
}

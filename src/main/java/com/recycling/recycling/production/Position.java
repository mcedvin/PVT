package com.recycling.recycling.production;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return ""+x + " " +y;
    }
}

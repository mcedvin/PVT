package com.recycling.recycling.production;

import java.util.ArrayList;
import java.util.Date;

public class Station {


    private ArrayList<Material> availableMaterials = new ArrayList<Material>();
    private String stationName;
    private Position pos;
    private Date lastEmpty;

    public Station(String stationName, Position pos){
        this.stationName = stationName;
        this.pos = pos;
    }
    public String getStationName(){
        return stationName;
    }
    public Position getPos(){
        return pos;
    }
    public Date getLastEmpty(){
        return lastEmpty;
    }
    public void setLastEmpty(){
        lastEmpty = new Date();
    }

    public String toString(){
        return stationName + " på position: " + pos;
    }
}

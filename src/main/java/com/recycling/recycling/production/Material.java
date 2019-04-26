package com.recycling.recycling.production;

public class Material {
    private String materialType;
    private double Co2Emmission;

    public Material(String materialType, double Co2Emmission){
        this.materialType = materialType;
        this.Co2Emmission = Co2Emmission;
    }

    public String getMaterialType(){
        return materialType;
    }
    public double getCo2Emmission(){
        return Co2Emmission;
    }
}

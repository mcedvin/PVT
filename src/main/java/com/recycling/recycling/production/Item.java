package com.recycling.recycling.production;

public class Item {

    private String name;
    private int weight;
    private Material material;

    public Item(String name, int weight, Material material){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public Material getMaterial() {
        return material;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

}

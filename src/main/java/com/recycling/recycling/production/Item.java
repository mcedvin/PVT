package com.recycling.recycling.production;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Item")
public class Item implements Serializable {

    @Id
    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "weight")
    private int weight;

    @ManyToOne(optional = true)
    @JoinColumn(nullable = true, name = "material")
    private Material itemMaterial; //TODO: dessa ska fixas


    public Item(String name, int weight, Material material){
        this.name = name;
        this.weight = weight;
        this.itemMaterial = material;
    }
    public Item(){

    }

    public String getName(){
        return name;
    }

    public Material getMaterial() {
        return itemMaterial;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

}

package com.recycling.recycling.production;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Item")
public class Item implements Serializable {

    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private int weight;
//    @ManyToOne
//    @JoinColumn(name = "material")
//    private Material material; //TODO: dessa ska fixas

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
//        this.material = material;
    }
    public Item(){

    }

    public String getName(){
        return name;
    }

//    public Material getMaterial() {
//        return material;
//    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

}

package com.recycling.recycling.production;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "material")
public class Material implements Serializable {
//    @GeneratedValue
//    @Id @GeneratedValue(generator="system-uuid")
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Id
    @Column(name = "materialType", length = 100)
    private String materialType;
    @Column(name = "emmission")
    private double Co2Emmission; //per gram

    public Material(String materialType, double Co2Emmission) {
        this.materialType = materialType;
        this.Co2Emmission = Co2Emmission;
    }

    public String getMaterialType() {
        return materialType;

    }
    public double getCo2Emmission() {
        return Co2Emmission;
    }
    public void setCo2Emmission(double Co2Emmission){
        this.Co2Emmission = Co2Emmission;
    }

}

package com.recycling.recycling.production;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "position")
@IdClass(PositionID.class)
public class Position implements Serializable {
    @GeneratedValue
    @Id
    @Column(name = "x")
    private int x;
    @Id
    @Column(name = "y")
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "" + x + " " + y;
    }
}

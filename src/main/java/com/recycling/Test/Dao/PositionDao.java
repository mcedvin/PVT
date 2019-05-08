package com.recycling.Test.Dao;

import com.recycling.recycling.production.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface PositionDao { //TODO: måste extendas någon annanstans
    public Collection<Position> getAllPositions();

    public Position getPositionById(int id);

    public void removePositionById(int id);

    public void updatePosition(Position updatedPosition);

    public void addPosition(Position newPosition);
}

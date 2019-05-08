package com.recycling.Test.Dao;

import com.recycling.DB.repository.PositionRepository;
import com.recycling.recycling.production.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
//@Qualifier("MySQL")
public class PositionSQLDao implements PositionDao{

    @Autowired
    PositionRepository PositionRepository;

    public Collection<Position> getAllPositions(){
        return PositionRepository.findAll();
//        return null;
    }

    public Position getPositionById(int id){
        return null;
    }

    public void removePositionById(int id){

    }

    public void updatePosition(Position updatedPosition){
    }

    public void addPosition(Position newPosition){
        PositionRepository.save((newPosition));
    }
}

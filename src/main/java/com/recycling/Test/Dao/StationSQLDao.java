package com.recycling.Test.Dao;

import com.recycling.DB.repository.StationRepository;
import com.recycling.recycling.production.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class StationSQLDao implements StationDao {

    @Autowired
    StationRepository stationRepository;

    public Collection<Station> getAllStations(){
    return stationRepository.findAll();
    }

    public Station getStationById(int id){
        return null;
    }

    public void removeStationById(int id){

    }

    public void updateStation(Station updatedStation){

    }

    public void addStation(Station newStation){
    stationRepository.save(newStation);
    }
}

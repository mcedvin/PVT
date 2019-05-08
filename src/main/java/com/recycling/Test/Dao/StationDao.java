package com.recycling.Test.Dao;

import com.recycling.recycling.production.Station;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface StationDao {

    public Collection<Station> getAllStations();

    public Station getStationById(int id);

    public void removeStationById(int id);

    public void updateStation(Station updatedStation);

    public void addStation(Station newStation);
}

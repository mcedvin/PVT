package com.recycling.Test.Dao;

import com.recycling.recycling.JSON.JSONparsing;
import com.recycling.recycling.production.Position;
import com.recycling.recycling.production.Station;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class FakeStationDao {
    private Map<Integer, Station> stations = new JSONparsing().getAllStations();

//    static {
//        stations = new HashMap<Integer, Station>() {
//            {
//                put(1, new Station("årstaviken", new Position(1,1)));
//                put(2, new Station("gullmars", new Position(2,2)));
//                put(3, new Station("årstaviken", new Position(3,3)));
//
//            }
//        };
//    }

    public Collection<Station> getAllStations() {
        return this.stations.values();
    }
}

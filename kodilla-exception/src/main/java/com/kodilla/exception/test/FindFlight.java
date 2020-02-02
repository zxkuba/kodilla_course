package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {

//Nie bardzo mam pomysł jak to zorbić

    public Map<Flight, Boolean> findFlight(Flight flight) throws RouteNotFoundException{
        HashMap<Flight, Boolean> fly = new HashMap<>();
        if(flight != null) {
            fly.put(flight, true);
        }else {
           throw new RouteNotFoundException("ghsdgi");
        }
        return fly;
    }

}

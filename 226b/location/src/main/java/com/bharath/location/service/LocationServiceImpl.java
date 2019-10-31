package com.bharath.location.service;

import com.bharath.location.entities.Location;
import com.bharath.location.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LocationServiceImpl implements LocationService {  // nur das schreiben, dann drüber hovern und implementieren, der Rest wird dann selbst erstellt
    @Autowired
    private LocationRepository repository;   //selber schreiben, die returns auch selber schreiben mit den methoden, die wir vorher im LocationService definiert haben

    @Override
    public Location saveLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocationById(int id) {
        return repository.getOne(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }

}

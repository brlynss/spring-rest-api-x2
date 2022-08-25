/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Location;
import com.example.fuex.repository.LocationRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class LocationServiceImpl implements LocationService{
    
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location addNewLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> getAllLocation() {
        return locationRepository.findAll();
    }

    @Override
    public Location getById(Integer id) {
        return locationRepository.findById(id).get();
    }

    @Override
    public Location updateData(Integer id, Location location) {
        Location updateLocation = locationRepository.findById(id).get();
        updateLocation.setLokasi(location.getLokasi());
        return locationRepository.save(updateLocation);
    }

    @Override
    public Map<String, Boolean> deleteLocation(Integer id) {
        Location updateLocation = locationRepository.findById(id).get();
        locationRepository.delete(updateLocation);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

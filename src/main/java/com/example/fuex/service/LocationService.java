/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Location;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface LocationService {
    
    Location addNewLocation (Location location);
    
    List<Location> getAllLocation();
    
    Location getById(Integer id);
    
    Location updateData(Integer id, Location location);
    
    Map<String, Boolean> deleteLocation(Integer id);
}

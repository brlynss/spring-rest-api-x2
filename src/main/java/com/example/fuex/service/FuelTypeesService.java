/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.FuelTypees;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface FuelTypeesService {
    
    FuelTypees addNewFuelTypees (FuelTypees fuelTypees);
    
    List<FuelTypees> getAllFuelTypees();
    
    FuelTypees create(Integer vehicleTypeId, FuelTypees fuelTypees);
    
    FuelTypees getById(Integer id);
    
    FuelTypees updateData(Integer id, FuelTypees fuelTypees);
    
    Map<String, Boolean> deleteFuelTypees(Integer id);
    
}

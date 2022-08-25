/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.VehicleTypees;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface VehicleTypeesService {
    
    VehicleTypees addNewVehicleTypees (VehicleTypees vehicleTypees);
    
    List<VehicleTypees> getAllVehicleTypees();
    
    VehicleTypees getById(Integer id);
    
    VehicleTypees updateData(Integer id, VehicleTypees vehicleTypees);
    
    Map<String, Boolean> deleteVehicleTypees(Integer id);
}

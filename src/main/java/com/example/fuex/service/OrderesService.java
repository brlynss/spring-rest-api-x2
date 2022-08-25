/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Orderes;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface OrderesService {
    
    Orderes addNewOrderes (Orderes orderes);
    
    List<Orderes> getAllOrderes();
    
    Orderes create(Integer fuelTypeeId, Integer orderStatusId, Integer vehicleTypeId, Integer vocherId, Orderes orderes);
    
    Orderes getById(Integer id);
    
    Orderes updateData(Integer id, Orderes orderes);
    
    Map<String, Boolean> deleteOrderes(Integer id);
    
}

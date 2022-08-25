/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.VehicleTypees;
import com.example.fuex.repository.VehicleTypeesRepository;
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
public class VehicleTypeesServiceImpl implements VehicleTypeesService{
    
    @Autowired
    private VehicleTypeesRepository vehicleTypeesRepository;

    @Override
    public VehicleTypees addNewVehicleTypees(VehicleTypees vehicleTypees) {
        return vehicleTypeesRepository.save(vehicleTypees);
    }

    @Override
    public List<VehicleTypees> getAllVehicleTypees() {
        return vehicleTypeesRepository.findAll();
    }

    @Override
    public VehicleTypees getById(Integer id) {
        return vehicleTypeesRepository.findById(id).get();
    }

    @Override
    public VehicleTypees updateData(Integer id, VehicleTypees vehicleTypees) {
        VehicleTypees updateVehicleTypees = vehicleTypeesRepository.findById(id).get();
        updateVehicleTypees.setTipeKedaran(vehicleTypees.getTipeKedaran());
        return vehicleTypeesRepository.save(updateVehicleTypees);
    }

    @Override
    public Map<String, Boolean> deleteVehicleTypees(Integer id) {
        VehicleTypees updateVehicleTypees = vehicleTypeesRepository.findById(id).get();
        vehicleTypeesRepository.delete(updateVehicleTypees);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

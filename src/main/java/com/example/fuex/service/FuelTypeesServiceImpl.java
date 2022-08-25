/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.FuelTypees;
import com.example.fuex.repository.FuelTypeesRepository;
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
public class FuelTypeesServiceImpl implements FuelTypeesService{
    
    @Autowired
    private FuelTypeesRepository fuelTypeesRepository;
    
    @Autowired
    private VehicleTypeesRepository vehicleTypeesRepository;

    @Override
    public FuelTypees addNewFuelTypees(FuelTypees fuelTypees) {
        return fuelTypeesRepository.save(fuelTypees);
    }

    @Override
    public List<FuelTypees> getAllFuelTypees() {
        return fuelTypeesRepository.findAll();
    }

    @Override
    public FuelTypees getById(Integer id) {
        return fuelTypeesRepository.findById(id).get();
    }

    @Override
    public FuelTypees updateData(Integer id, FuelTypees fuelTypees) {
        FuelTypees updateFuelTypees = fuelTypeesRepository.findById(id).get();
        updateFuelTypees.setCapacity(fuelTypees.getCapacity());
        updateFuelTypees.setPrice(fuelTypees.getPrice());
        updateFuelTypees.setTipeBensin(fuelTypees.getTipeBensin());
        return fuelTypeesRepository.save(updateFuelTypees);
    }

    @Override
    public Map<String, Boolean> deleteFuelTypees(Integer id) {
        FuelTypees updateFuelTypees = fuelTypeesRepository.findById(id).get();
        fuelTypeesRepository.delete(updateFuelTypees);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }

    @Override
    public FuelTypees create(Integer vehicleTypeId, FuelTypees fuelTypees) {
        fuelTypees.setVehicleTypeId(vehicleTypeesRepository.findById(vehicleTypeId).get());
        return fuelTypeesRepository.save(fuelTypees);
    }
    
}

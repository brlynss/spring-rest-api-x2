/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Orderes;
import com.example.fuex.repository.FuelTypeesRepository;
import com.example.fuex.repository.OrderStatusesRepository;
import com.example.fuex.repository.OrderesRepository;
import com.example.fuex.repository.VehicleTypeesRepository;
import com.example.fuex.repository.VocheresRepository;
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
public class OrderesServiceImpl implements OrderesService{
    
    @Autowired
    private OrderesRepository orderesRepository;
    
    @Autowired
    private FuelTypeesRepository fuelTypeesRepository;
    
    @Autowired
    private OrderStatusesRepository orderStatusesRepository;
    
    @Autowired
    private VehicleTypeesRepository vehicleTypeesRepository;
    
    @Autowired
    private VocheresRepository vocheresRepository;

    @Override
    public Orderes addNewOrderes(Orderes orderes) {
        orderes.setIsEmergency(false);
        return orderesRepository.save(orderes);
    }

    @Override
    public List<Orderes> getAllOrderes() {
        return orderesRepository.findAll();
    }

    @Override
    public Orderes getById(Integer id) {
        return orderesRepository.findById(id).get();
    }

    @Override
    public Orderes updateData(Integer id, Orderes orderes) {
        Orderes updateOrderes = orderesRepository.findById(id).get();
        updateOrderes.setAlamat(orderes.getAlamat());
        updateOrderes.setAtasNama(orderes.getAtasNama());
        updateOrderes.setBiayaLayanan(orderes.getBiayaLayanan());
        updateOrderes.setFuelType(orderes.getFuelType());
        updateOrderes.setLiter(orderes.getLiter());
        updateOrderes.setNoTelpon(orderes.getNoTelpon());
        updateOrderes.setNumberPlat(orderes.getNumberPlat());
        updateOrderes.setOrderStatus(orderes.getOrderStatus());
        updateOrderes.setTotalPembayaran(orderes.getTotalPembayaran());
        updateOrderes.setUsers(orderes.getUsers());
        updateOrderes.setVehicleType(orderes.getVehicleType());
        updateOrderes.setVocher(orderes.getVocher());
        return orderesRepository.save(updateOrderes);
    }

    @Override
    public Map<String, Boolean> deleteOrderes(Integer id) {
        Orderes updateUserType = orderesRepository.findById(id).get();
        orderesRepository.delete(updateUserType);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }

    @Override
    public Orderes create(Integer fuelTypeeId, Integer orderStatusId, Integer vehicleTypeId, Integer vocherId, Orderes orderes) {
        orderes.setFuelTypeId(fuelTypeesRepository.findById(fuelTypeeId).get());
        orderes.setOrderStatusId(orderStatusesRepository.findById(orderStatusId).get());
        orderes.setVehicleTypeId(vehicleTypeesRepository.findById(vehicleTypeId).get());
        orderes.setVocherId(vocheresRepository.findById(vocherId).get());
        return orderesRepository.save(orderes);
    }

    
    
    
}

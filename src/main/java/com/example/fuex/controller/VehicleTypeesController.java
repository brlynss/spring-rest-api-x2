/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.VehicleTypees;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.VehicleTypeesService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/vehicle-typees")
public class VehicleTypeesController {
    
    @Autowired
    private VehicleTypeesService vehicleTypeesService;
    
    @PostMapping
    public VehicleTypees addNewVehicleTypees(@RequestBody VehicleTypees vehicleTypees){
        return vehicleTypeesService.addNewVehicleTypees(vehicleTypees);
    }
    
    @GetMapping
    public List<VehicleTypees> getAllVehicleTypees(){
        return vehicleTypeesService.getAllVehicleTypees();
    }

    @GetMapping("/{id}")
    public CommonResponse<VehicleTypees> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(vehicleTypeesService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public VehicleTypees updateData(@PathVariable("id") Integer id, @RequestBody VehicleTypees vehicleTypees){
        return vehicleTypeesService.updateData(id, vehicleTypees);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteVehicleTypees(@PathVariable("id") Integer Id){
        return vehicleTypeesService.deleteVehicleTypees(Id);
    }
    
}

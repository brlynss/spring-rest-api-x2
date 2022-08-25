/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.FuelTypees;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.FuelTypeesService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/fuel-typees")
public class FuelTypeesController {
    
    @Autowired
    private FuelTypeesService fuelTypeesService;
    
    @PostMapping
    public CommonResponse<FuelTypees> create(@RequestParam("vehicleTypeId") Integer vehicleTypeId, @RequestBody FuelTypees fuelTypees){
        return CommonResponseGenerator.successResponse(fuelTypeesService.create(vehicleTypeId, fuelTypees));
    }
    
    @GetMapping
    public List<FuelTypees> getAllFuelTypees(){
        return fuelTypeesService.getAllFuelTypees();
    }
    
    @GetMapping("/{id}")
    public CommonResponse<FuelTypees> getById(@PathVariable (name = "id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(fuelTypeesService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @PutMapping("/{id}")
    public CommonResponse<FuelTypees> updateData(@PathVariable("id") Integer id, @RequestBody FuelTypees fuelType){
        try {
             return CommonResponseGenerator.successResponse(fuelTypeesService.updateData(id, fuelType));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteFuelTypees(@PathVariable("id") Integer Id){
        return fuelTypeesService.deleteFuelTypees(Id);
    }
    
}

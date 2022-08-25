/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.Location;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.LocationService;
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
@RequestMapping("/location")
public class LocationController {
    
    @Autowired
    private LocationService locationService;
    
    @PostMapping
    public Location addNewLocation(@RequestBody Location location){
        return locationService.addNewLocation(location);
    }
    
    @GetMapping
    public List<Location> getAllLocation(){
        return locationService.getAllLocation();
    }

    @GetMapping("/{id}")
    public CommonResponse<Location> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(locationService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public Location updateData(@PathVariable("id") Integer id, @RequestBody Location location){
        return locationService.updateData(id, location);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteLocation(@PathVariable("id") Integer Id){
        return locationService.deleteLocation(Id);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.Orderes;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.OrderesService;
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
@RequestMapping("/orderes")
public class OrderesController {
    
    @Autowired
    private OrderesService orderesService;
    
    @PostMapping
    public CommonResponse<Orderes> create(@RequestParam("fuelTypeeId") Integer fuelTypeeId,@RequestParam("orderStatusId") Integer orderStatusId, @RequestParam("vehicleTypeId") Integer vehicleTypeId, @RequestParam("vocherId") Integer vocherId, @RequestBody Orderes orderes){
        return CommonResponseGenerator.successResponse(orderesService.create(fuelTypeeId, orderStatusId, vehicleTypeId, vocherId, orderes));
    }
    
    @GetMapping
    public List<Orderes> getAllOrderes(){
        return orderesService.getAllOrderes();
    }
    
    @GetMapping("/{id}")
    public CommonResponse<Orderes> getById(@PathVariable (name = "id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(orderesService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @PutMapping("/{id}")
    public CommonResponse<Orderes> updateData(@PathVariable("id") Integer id, @RequestBody Orderes orderes){
        try {
             return CommonResponseGenerator.successResponse(orderesService.updateData(id, orderes));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteOrderes(@PathVariable("id") Integer Id){
        return orderesService.deleteOrderes(Id);
    }
}

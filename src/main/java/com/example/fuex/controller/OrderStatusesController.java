/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.OrderStatuses;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.OrderStatusesService;
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
@RequestMapping("/order-statuses")
public class OrderStatusesController {
    
    @Autowired
    private OrderStatusesService orderStatusesService;
    
    @PostMapping
    public OrderStatuses addNewOrderStatuses(@RequestBody OrderStatuses orderStatuses){
        return orderStatusesService.addNewOrderStatuses(orderStatuses);
    }
    
    @GetMapping
    public List<OrderStatuses> getAllOrderStatuses(){
        return orderStatusesService.getAllOrderStatuses();
    }

    @GetMapping("/{id}")
    public CommonResponse<OrderStatuses> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(orderStatusesService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public OrderStatuses updateData(@PathVariable("id") Integer id, @RequestBody OrderStatuses orderStatuses){
        return orderStatusesService.updateData(id, orderStatuses);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteOrderStatuses(@PathVariable("id") Integer Id){
        return orderStatusesService.deleteOrderStatuses(Id);
    }
}

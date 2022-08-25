/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.OrderStatuses;
import com.example.fuex.repository.OrderStatusesRepository;
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
public class OrderStatusesServiceImpl implements OrderStatusesService{
    
    @Autowired
    private OrderStatusesRepository orderStatusesRepository;

    @Override
    public OrderStatuses addNewOrderStatuses(OrderStatuses orderStatuses) {
        return orderStatusesRepository.save(orderStatuses);
    }

    @Override
    public List<OrderStatuses> getAllOrderStatuses() {
        return orderStatusesRepository.findAll();
    }

    @Override
    public OrderStatuses getById(Integer id) {
        return orderStatusesRepository.findById(id).get();
    }

    @Override
    public OrderStatuses updateData(Integer id, OrderStatuses orderStatuses) {
        OrderStatuses updateOrderStatuses = orderStatusesRepository.findById(id).get();
        updateOrderStatuses.setOrderStatusName(orderStatuses.getOrderStatusName());
        return orderStatusesRepository.save(updateOrderStatuses);
    }

    @Override
    public Map<String, Boolean> deleteOrderStatuses(Integer id) {
        OrderStatuses updateOrderStatuses = orderStatusesRepository.findById(id).get();
        orderStatusesRepository.delete(updateOrderStatuses);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

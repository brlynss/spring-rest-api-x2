/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.OrderStatuses;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface OrderStatusesService {
    OrderStatuses addNewOrderStatuses (OrderStatuses orderStatuses);
    
    List<OrderStatuses> getAllOrderStatuses();
    
    OrderStatuses getById(Integer id);
    
    OrderStatuses updateData(Integer id, OrderStatuses orderStatuses);
    
    Map<String, Boolean> deleteOrderStatuses(Integer id);
    
}

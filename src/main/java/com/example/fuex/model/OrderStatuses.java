/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.model;

import javax.persistence.*;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "orderes_statuses")
public class OrderStatuses {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_status_id")
    private int orderStatusId;
    @Column(name = "order_status_name")
    private String orderStatusName;

    public OrderStatuses() {
    }

    public OrderStatuses(int orderStatusId, String orderStatusName) {
        this.orderStatusId = orderStatusId;
        this.orderStatusName = orderStatusName;
    }

    public int getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(int orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }
    
    
}

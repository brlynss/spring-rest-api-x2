/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "fuel_typees")
public class FuelTypees {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fuel_type_id")
    private int fuelTypeId;
    @Column(name = "capacity")
    private int capacity;
    @Column(name = "price")
    private int price;
    @Column(name = "tipe_bensin")
    private String tipeBensin;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "vehicle_type_id")
    private VehicleTypees vehicleTypeId;

    public FuelTypees() {
    }

    public FuelTypees(int fuelTypeId, int capacity, int price, String tipeBensin, VehicleTypees vehicleTypeId) {
        this.fuelTypeId = fuelTypeId;
        this.capacity = capacity;
        this.price = price;
        this.tipeBensin = tipeBensin;
        this.vehicleTypeId = vehicleTypeId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTipeBensin() {
        return tipeBensin;
    }

    public void setTipeBensin(String tipeBensin) {
        this.tipeBensin = tipeBensin;
    }

    public VehicleTypees getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(VehicleTypees vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

   
}

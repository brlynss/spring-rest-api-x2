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
@Table(name = "vehicle_typees")
public class VehicleTypees {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_type_id")
    private int vehicleTypeId;
    @Column(name = "tipe_kendaran")
    private String tipeKedaran;

    public VehicleTypees() {
    }

    public VehicleTypees(int vehicleTypeId, String tipeKedaran) {
        this.vehicleTypeId = vehicleTypeId;
        this.tipeKedaran = tipeKedaran;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(int vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public String getTipeKedaran() {
        return tipeKedaran;
    }

    public void setTipeKedaran(String tipeKedaran) {
        this.tipeKedaran = tipeKedaran;
    }
    
    
}

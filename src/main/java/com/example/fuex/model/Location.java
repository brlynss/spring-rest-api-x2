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
@Table(name = "location")
public class Location {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "lokasi")
    private String lokasi;

    public Location() {
    }

    public Location(int Id, String lokasi) {
        this.Id = Id;
        this.lokasi = lokasi;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
    
    
}

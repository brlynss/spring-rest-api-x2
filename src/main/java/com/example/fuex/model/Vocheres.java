/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.model;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "vocheres")
public class Vocheres {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vocher_id")
    private int vocherId;
    @Column(name = "code")
    private String code;
    @Column(name = "discount")
    private int discount;
    @Column(name = "expired")
    private Date expired;
    @Column(name = "image")
    private String image;
    @Column(name = "use_count")
    private int useCount;

    public Vocheres() {
    }

    public Vocheres(int vocherId, String code, int discount, Date expired, String image, int useCount) {
        this.vocherId = vocherId;
        this.code = code;
        this.discount = discount;
        this.expired = expired;
        this.image = image;
        this.useCount = useCount;
    }

    public int getVocherId() {
        return vocherId;
    }

    public void setVocherId(int vocherId) {
        this.vocherId = vocherId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getExpired() {
        return expired;
    }

    public void setExpired(Date expired) {
        this.expired = expired;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }
    
    
}

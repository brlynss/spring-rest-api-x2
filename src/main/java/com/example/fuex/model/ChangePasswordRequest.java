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
@Table(name = "change_password_request")
public class ChangePasswordRequest {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "already_used")
    private Boolean alreadyUsed;
    @Column(name = "code")
    private String code;
    @Column(name = "email")
    private String email;

    public ChangePasswordRequest() {
    }

    public ChangePasswordRequest(int Id, Boolean alreadyUsed, String code, String email) {
        this.Id = Id;
        this.alreadyUsed = alreadyUsed;
        this.code = code;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public Boolean getAlreadyUsed() {
        return alreadyUsed;
    }

    public void setAlreadyUsed(Boolean alreadyUsed) {
        this.alreadyUsed = alreadyUsed;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

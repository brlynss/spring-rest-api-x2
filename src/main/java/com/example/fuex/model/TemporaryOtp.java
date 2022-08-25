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
@Table(name = "temporary_otp")
public class TemporaryOtp {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "otp_id")
    private int otpId;
    @Column(name = "email")
    private String email;
    @Column(name = "date_expired")
    private Date dateExpired;
    @Column(name = "otp_number")
    private String otpNumber;
    @Column(name = "is_verified")
    private Boolean isVerified;

    public TemporaryOtp() {
    }

    public TemporaryOtp(int otpId, String email, Date dateExpired, String otpNumber, Boolean isVerified) {
        this.otpId = otpId;
        this.email = email;
        this.dateExpired = dateExpired;
        this.otpNumber = otpNumber;
        this.isVerified = isVerified;
    }

    public int getOtpId() {
        return otpId;
    }

    public void setOtpId(int otpId) {
        this.otpId = otpId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }

    public String getOtpNumber() {
        return otpNumber;
    }

    public void setOtpNumber(String otpNumber) {
        this.otpNumber = otpNumber;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }
    
    
}

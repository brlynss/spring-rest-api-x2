/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.TemporaryOtp;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface TemporaryOtpService {
    TemporaryOtp addNewTemporaryOtp (TemporaryOtp temporaryOtp);
    
    List<TemporaryOtp> getAllTemporaryOtp();
    
    TemporaryOtp getById(Integer id);
    
    TemporaryOtp updateData(Integer id, TemporaryOtp temporaryOtp);
    
    Map<String, Boolean> deleteTemporaryOtp(Integer id);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.ChangePasswordRequest;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface ChangePasswordService {
    ChangePasswordRequest addNewRequest (ChangePasswordRequest changePasswordRequest);
    
    List<ChangePasswordRequest> getAllRequest();
    
    ChangePasswordRequest getById(Integer id);
    
    ChangePasswordRequest updateData(Integer id, ChangePasswordRequest changePasswordRequest);
    
    Map<String, Boolean> deleteRequest(Integer id);
    
}

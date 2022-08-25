/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.UserType;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface UserTypeService {
    UserType addNewUserType (UserType userType);
    
    List<UserType> getAllUserType();
    
    UserType getById(Integer id);
    
    UserType updateData(Integer id, UserType userType);
    
    Map<String, Boolean> deleteUserType(Integer id);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.UserType;
import com.example.fuex.repository.UserTypeRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class UserTypeServiseImpl implements UserTypeService{
    
    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public UserType addNewUserType(UserType userType) {
        return userTypeRepository.save(userType);
    }

    @Override
    public List<UserType> getAllUserType() {
        return userTypeRepository.findAll();
    }

    @Override
    public UserType getById(Integer id) {
        return userTypeRepository.findById(id).get();
    }

    @Override
    public UserType updateData(Integer id, UserType userType) {
        UserType updateUserType = userTypeRepository.findById(id).get();
        updateUserType.setUserTypeName(userType.getUserTypeName());
        return userTypeRepository.save(updateUserType);
    }

    @Override
    public Map<String, Boolean> deleteUserType(Integer id) {
        UserType updateUserType = userTypeRepository.findById(id).get();
        userTypeRepository.delete(updateUserType);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

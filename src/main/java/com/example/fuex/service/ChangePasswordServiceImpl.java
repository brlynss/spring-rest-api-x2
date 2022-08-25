/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.ChangePasswordRequest;
import com.example.fuex.repository.ChangePasswordRequestRepository;
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
public class ChangePasswordServiceImpl implements ChangePasswordService{
    
    @Autowired
    private ChangePasswordRequestRepository changePasswordRequestRepository;

    @Override
    public ChangePasswordRequest addNewRequest(ChangePasswordRequest changePasswordRequest) {
        changePasswordRequest.setAlreadyUsed(false);
        return changePasswordRequestRepository.save(changePasswordRequest);
    }

    @Override
    public List<ChangePasswordRequest> getAllRequest() {
        return changePasswordRequestRepository.findAll();
    }

    @Override
    public ChangePasswordRequest getById(Integer id) {
        return changePasswordRequestRepository.findById(id).get();
    }

    @Override
    public ChangePasswordRequest updateData(Integer id, ChangePasswordRequest changePasswordRequest) {
        ChangePasswordRequest updateRequest = changePasswordRequestRepository.findById(id).get();
        updateRequest.setCode(changePasswordRequest.getCode());
        updateRequest.setEmail(changePasswordRequest.getEmail());
        return changePasswordRequestRepository.save(updateRequest);
    }

    @Override
    public Map<String, Boolean> deleteRequest(Integer id) {
        ChangePasswordRequest updateRequest = changePasswordRequestRepository.findById(id).get();
        changePasswordRequestRepository.delete(updateRequest);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

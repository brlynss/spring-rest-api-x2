/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.TemporaryOtp;
import com.example.fuex.repository.TemporaryOtpRepository;
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
public class TemporaryOtpServiceImpl implements TemporaryOtpService{
    
    @Autowired
    private TemporaryOtpRepository temporaryOtpRepository;

    @Override
    public TemporaryOtp addNewTemporaryOtp(TemporaryOtp temporaryOtp) {
        temporaryOtp.setIsVerified(false);
        return temporaryOtpRepository.save(temporaryOtp);
    }

    @Override
    public List<TemporaryOtp> getAllTemporaryOtp() {
        return temporaryOtpRepository.findAll();
    }

    @Override
    public TemporaryOtp getById(Integer id) {
        return temporaryOtpRepository.findById(id).get();
    }

    @Override
    public TemporaryOtp updateData(Integer id, TemporaryOtp temporaryOtp) {
        TemporaryOtp updateTemporaryOtp = temporaryOtpRepository.findById(id).get();
        updateTemporaryOtp.setEmail(temporaryOtp.getEmail());
        updateTemporaryOtp.setDateExpired(temporaryOtp.getDateExpired());
        updateTemporaryOtp.setOtpNumber(temporaryOtp.getOtpNumber());
        return temporaryOtpRepository.save(updateTemporaryOtp);
    }

    @Override
    public Map<String, Boolean> deleteTemporaryOtp(Integer id) {
        TemporaryOtp updateTemporaryOtp = temporaryOtpRepository.findById(id).get();
        temporaryOtpRepository.delete(updateTemporaryOtp);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

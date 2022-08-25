/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Useres;
import com.example.fuex.repository.UserTypeRepository;
import com.example.fuex.repository.UseresRepository;
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
public class UseresServiceImpl implements UseresService {
    
    @Autowired
    private UseresRepository useresRepository;
    
    @Autowired
    private UserTypeRepository userTypeRepository;

    @Override
    public Useres addNewUseres(Useres useres) {
        return useresRepository.save(useres);
    }

    @Override
    public List<Useres> getAllUseres() {
        return useresRepository.findAll();
    }

    @Override
    public Useres getById(Integer id) {
        return useresRepository.findById(id).get();
    }

    @Override
    public Useres updateData(Integer id, Useres useres) {
        Useres updateUseres = useresRepository.findById(id).get();
        updateUseres.setEmail(useres.getEmail());
        updateUseres.setFullName(useres.getFullName());
        updateUseres.setMobilePhoneNumber(useres.getMobilePhoneNumber());
        updateUseres.setPassword(useres.getPassword());
        updateUseres.setUserType(useres.getUserType());
        updateUseres.setUserName(useres.getUserName());
        updateUseres.setUserName(useres.getUserName());
        return useresRepository.save(updateUseres);
    }

    @Override
    public Map<String, Boolean> deleteUseres(Integer id) {
        Useres updateUseres = useresRepository.findById(id).get();
        useresRepository.delete(updateUseres);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }

    @Override
    public Useres create(Integer userTypeId, Useres useres) {
        useres.setUserTypeId(userTypeRepository.findById(userTypeId).get());
        return useresRepository.save(useres);
    }
    
}

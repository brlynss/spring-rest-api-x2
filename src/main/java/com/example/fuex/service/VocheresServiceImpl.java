/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Vocheres;
import com.example.fuex.repository.VocheresRepository;
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
public class VocheresServiceImpl implements VocheresService{
    
    @Autowired
    private VocheresRepository vocheresRepository;

    @Override
    public Vocheres addNewOrderes(Vocheres vocheres) {
        return vocheresRepository.save(vocheres);
    }

    @Override
    public List<Vocheres> getAllOrderes() {
        return vocheresRepository.findAll();
    }

    @Override
    public Vocheres getById(Integer id) {
        return vocheresRepository.findById(id).get();
    }

    @Override
    public Vocheres updateData(Integer id, Vocheres vocheres) {
        Vocheres updateVocheres = vocheresRepository.findById(id).get();
        updateVocheres.setCode(vocheres.getCode());
        updateVocheres.setDiscount(vocheres.getDiscount());
        updateVocheres.setExpired(vocheres.getExpired());
        updateVocheres.setImage(vocheres.getImage());
        updateVocheres.setUseCount(vocheres.getUseCount());
        return vocheresRepository.save(updateVocheres);
    }

    @Override
    public Map<String, Boolean> deleteOrderes(Integer id) {
        Vocheres updateVocheres = vocheresRepository.findById(id).get();
        vocheresRepository.delete(updateVocheres);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
        return response;
    }
    
}

 


   
    

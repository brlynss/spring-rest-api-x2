/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Useres;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface UseresService {
    
    Useres addNewUseres (Useres useres);
    
    List<Useres> getAllUseres();
    
    Useres create(Integer userTypeId, Useres useres);
    
    Useres getById(Integer id);
    
    Useres updateData(Integer id, Useres useres);
    
    Map<String, Boolean> deleteUseres(Integer id);
}

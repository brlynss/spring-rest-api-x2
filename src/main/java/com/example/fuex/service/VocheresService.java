/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.service;

import com.example.fuex.model.Vocheres;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public interface VocheresService {
    Vocheres addNewOrderes (Vocheres vocheres);
    
    List<Vocheres> getAllOrderes();
    
    Vocheres getById(Integer id);
    
    Vocheres updateData(Integer id, Vocheres vocheres);
    
    Map<String, Boolean> deleteOrderes(Integer id);
}

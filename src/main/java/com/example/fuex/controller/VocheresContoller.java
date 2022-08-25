/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.Vocheres;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.VocheresService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/vocheres")
public class VocheresContoller {
    
    @Autowired
    private VocheresService vocheresService;
    
    @PostMapping
    public Vocheres addNewOrderes(@RequestBody Vocheres vocheres){
        return vocheresService.addNewOrderes(vocheres);
    }
    
    @GetMapping
    public List<Vocheres> getAllOrderes(){
        return vocheresService.getAllOrderes();
    }

    @GetMapping("/{id}")
    public CommonResponse<Vocheres> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(vocheresService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public Vocheres updateData(@PathVariable("id") Integer id, @RequestBody Vocheres vocheres){
        return vocheresService.updateData(id, vocheres);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteOrderes(@PathVariable("id") Integer Id){
        return vocheresService.deleteOrderes(Id);
    }
}

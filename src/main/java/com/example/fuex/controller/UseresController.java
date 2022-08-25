/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.Useres;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.UseresService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/useres")
public class UseresController {
    
    @Autowired
    private UseresService useresService;
    
    @PostMapping
    public CommonResponse<Useres> create(@RequestParam("userTypeId") Integer userTypeId, @RequestBody Useres useres){
        return CommonResponseGenerator.successResponse(useresService.create(userTypeId, useres));
    }
    
    @GetMapping
    public List<Useres> getAllUseres(){
        return useresService.getAllUseres();
    }
    
    @GetMapping("/{id}")
    public CommonResponse<Useres> getById(@PathVariable (name = "id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(useresService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @PutMapping("/{id}")
    public CommonResponse<Useres> updateData(@PathVariable("id") Integer id, @RequestBody Useres useres){
        try {
             return CommonResponseGenerator.successResponse(useresService.updateData(id, useres));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteUseres(@PathVariable("id") Integer Id){
        return useresService.deleteUseres(Id);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.TemporaryOtp;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.TemporaryOtpService;
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
@RequestMapping("/temporary-otp")
public class TemporaryOtpController {
    
    @Autowired
    private TemporaryOtpService temporaryOtpService;
    
    @PostMapping
    public TemporaryOtp addNewTemporaryOtp(@RequestBody TemporaryOtp temporaryOtp){
        return temporaryOtpService.addNewTemporaryOtp(temporaryOtp);
    }
    
    @GetMapping
    public List<TemporaryOtp> getAllTemporaryOtp(){
        return temporaryOtpService.getAllTemporaryOtp();
    }

    @GetMapping("/{id}")
    public CommonResponse<TemporaryOtp> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(temporaryOtpService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public TemporaryOtp updateData(@PathVariable("id") Integer id, @RequestBody TemporaryOtp temporaryOtp){
        return temporaryOtpService.updateData(id, temporaryOtp);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteTemporaryOtp(@PathVariable("id") Integer Id){
        return temporaryOtpService.deleteTemporaryOtp(Id);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.ChangePasswordRequest;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.ChangePasswordService;
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
@RequestMapping("/change-password")
public class ChangePasswordController {
    
    @Autowired
    private ChangePasswordService changePasswordService;
    
    @PostMapping
    public ChangePasswordRequest addNewRequest(@RequestBody ChangePasswordRequest changePasswordRequest){
        return changePasswordService.addNewRequest(changePasswordRequest);
    }
    
    @GetMapping
    public List<ChangePasswordRequest> getAllRequest(){
        return changePasswordService.getAllRequest();
    }
    
    @GetMapping("/{id}")
    public CommonResponse<ChangePasswordRequest> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(changePasswordService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public CommonResponse<ChangePasswordRequest> updateData(@PathVariable("id") Integer id, @RequestBody ChangePasswordRequest changePasswordRequest){
        try {
             return CommonResponseGenerator.successResponse(changePasswordService.updateData(id, changePasswordRequest));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteRequest(@PathVariable("id") Integer Id){
        return changePasswordService.deleteRequest(Id);
    }
}

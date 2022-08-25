/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.controller;

import com.example.fuex.model.UserType;
import com.example.fuex.response.CommonResponse;
import com.example.fuex.response.CommonResponseGenerator;
import com.example.fuex.service.UserTypeService;
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
@RequestMapping("/user-type")
public class UserTypeController {
    
    @Autowired
    private UserTypeService userTypeService;
    
    @PostMapping
    public UserType addNewUserType(@RequestBody UserType userType){
        return userTypeService.addNewUserType(userType);
    }
    
    @GetMapping
    public List<UserType> getAllUserType(){
        return userTypeService.getAllUserType();
    }

    @GetMapping("/{id}")
    public CommonResponse<UserType> getById(@PathVariable ("id")Integer id){
        try {
             return CommonResponseGenerator.successResponse(userTypeService.getById(id));
        } catch(RuntimeException e){
            return CommonResponseGenerator.errorResponse(e.getMessage(), 500, "internal server eror");
        }
       
    }
    
    @PutMapping("/{id}")
    public UserType updateData(@PathVariable("id") Integer id, @RequestBody UserType userType){
        return userTypeService.updateData(id, userType);
    }
    
    @DeleteMapping("/{id}")
    private Map<String, Boolean> deleteUserType(@PathVariable("id") Integer Id){
        return userTypeService.deleteUserType(Id);
    }
    
}

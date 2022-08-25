/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "useres")
public class Useres {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column(name = "created_at")
    @CreationTimestamp
    private Date createdAt;
    @Column(name = "email")
    private String email;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "mobile_phone_number")
    private String mobilePhoneNumber;
    @Column(name = "password")
    private String password;
    @Column(name = "update_at")
    @UpdateTimestamp
    private Date updateAt;
    @Column(name = "user_type")
    private String userType;
    @Column(name = "username")
    private String userName;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "user_type_id")
    private UserType userTypeId;

    public Useres() {
    }

    public Useres(int userId, Date createdAt, String email, String fullName, String mobilePhoneNumber, String password, Date updateAt, String userType, String userName, UserType userTypeId) {
        this.userId = userId;
        this.createdAt = createdAt;
        this.email = email;
        this.fullName = fullName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.password = password;
        this.updateAt = updateAt;
        this.userType = userType;
        this.userName = userName;
        this.userTypeId = userTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserType getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(UserType userTypeId) {
        this.userTypeId = userTypeId;
    }

    
    
    
    
}

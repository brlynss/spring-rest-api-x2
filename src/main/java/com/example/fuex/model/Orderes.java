/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.fuex.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "orderes")
public class Orderes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "atas_nama")
    private String atasNama;
    @Column(name = "biaya_layanan")
    private String biayaLayanan;
    @Column(name = "create_data")
    @CreationTimestamp
    private Date createDate;
    @Column(name = "fuel_type")
    private String fuelType;
    @Column(name = "is_emergency")
    private Boolean isEmergency;
    @Column(name = "liter")
    private String liter;
    @Column(name = "merek")
    private String merek;
    @Column(name = "no_telpon")
    private String noTelpon;
    @Column(name = "number_plat")
    private String numberPlat;
    @Column(name = "order_status")
    private String orderStatus;
    @Column(name = "total_pembayaran")
    private int totalPembayaran;
    @Column(name = "users")
    private String users;
    @Column(name = "vehicle_type")
    private String vehicleType;
    @Column(name = "vocher")
    private String vocher;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "fuel_type_id")
    private FuelTypees fuelTypeId;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "order_status_id")
    private OrderStatuses orderStatusId;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "vehicle_type_id")
    private VehicleTypees vehicleTypeId;
    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "vocher_id")
    private Vocheres vocherId;

    public Orderes() {
    }

    public Orderes(int id, String alamat, String atasNama, String biayaLayanan, Date createDate, String fuelType, Boolean isEmergency, String liter, String merek, String noTelpon, String numberPlat, String orderStatus, int totalPembayaran, String users, String vehicleType, String vocher, FuelTypees fuelTypeId, OrderStatuses orderStatusId, VehicleTypees vehicleTypeId, Vocheres vocherId) {
        this.id = id;
        this.alamat = alamat;
        this.atasNama = atasNama;
        this.biayaLayanan = biayaLayanan;
        this.createDate = createDate;
        this.fuelType = fuelType;
        this.isEmergency = isEmergency;
        this.liter = liter;
        this.merek = merek;
        this.noTelpon = noTelpon;
        this.numberPlat = numberPlat;
        this.orderStatus = orderStatus;
        this.totalPembayaran = totalPembayaran;
        this.users = users;
        this.vehicleType = vehicleType;
        this.vocher = vocher;
        this.fuelTypeId = fuelTypeId;
        this.orderStatusId = orderStatusId;
        this.vehicleTypeId = vehicleTypeId;
        this.vocherId = vocherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAtasNama() {
        return atasNama;
    }

    public void setAtasNama(String atasNama) {
        this.atasNama = atasNama;
    }

    public String getBiayaLayanan() {
        return biayaLayanan;
    }

    public void setBiayaLayanan(String biayaLayanan) {
        this.biayaLayanan = biayaLayanan;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public Boolean getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(Boolean isEmergency) {
        this.isEmergency = isEmergency;
    }

    public String getLiter() {
        return liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public String getNumberPlat() {
        return numberPlat;
    }

    public void setNumberPlat(String numberPlat) {
        this.numberPlat = numberPlat;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(int totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVocher() {
        return vocher;
    }

    public void setVocher(String vocher) {
        this.vocher = vocher;
    }

    public FuelTypees getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(FuelTypees fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public OrderStatuses getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(OrderStatuses orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public VehicleTypees getVehicleTypeId() {
        return vehicleTypeId;
    }

    public void setVehicleTypeId(VehicleTypees vehicleTypeId) {
        this.vehicleTypeId = vehicleTypeId;
    }

    public Vocheres getVocherId() {
        return vocherId;
    }

    public void setVocherId(Vocheres vocherId) {
        this.vocherId = vocherId;
    }

    

    
    
    
}

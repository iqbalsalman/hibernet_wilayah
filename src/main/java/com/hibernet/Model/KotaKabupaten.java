/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernet.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author iqbal
 */
@Entity
@Table(name = "m_kota_kab", schema = "public")
public class KotaKabupaten extends BaseClass {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kota_kab", updatable = false, nullable = false)
    private Integer id_kab;
 
     
    @Column(name = "nm_kota_kab", length = 75)
    private String nama_kab;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_propinsi")
    private Provinsi provinsi;
    
    
    
    public Integer getId_kab() {
        return id_kab;
    }

    public void setId_kab(Integer id_kab) {
        this.id_kab = id_kab;
    }

    public String getNama_kab() {
        return nama_kab;
    }

    public void setNama_kab(String nama_kab) {
        this.nama_kab = nama_kab;
    }

    /**
     * @return the provinsi
     */
    public Provinsi getProvinsi() {
        return provinsi;
    }

    /**
     * @param provinsi the provinsi to set
     */
    public void setProvinsi(Provinsi provinsi) {
        this.provinsi = provinsi;
    }

    
    
    
    
}

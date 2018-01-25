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
@Table(name = "m_kecamatan", schema = "public")
public class Kecamatan extends BaseClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kecamatan", updatable = false, nullable = false)
    private Integer id_kec;
    
    
    
    @Column(name = "nm_kec", length = 75)
    private String nama_kecamatan;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_kota_kab")
    private KotaKabupaten kotakabupaten;
    

    public Integer getId_kec() {
        return id_kec;
    }

    public void setId_kec(Integer id_kec) {
        this.id_kec = id_kec;
    }

   

    public String getNama_kecamatan() {
        return nama_kecamatan;
    }

    public void setNama_kecamatan(String nama_kecamatan) {
        this.nama_kecamatan = nama_kecamatan;
    }

    /**
     * @return the kotakabupaten
     */
    public KotaKabupaten getKotakabupaten() {
        return kotakabupaten;
    }

    /**
     * @param kotakabupaten the kotakabupaten to set
     */
    public void setKotakabupaten(KotaKabupaten kotakabupaten) {
        this.kotakabupaten = kotakabupaten;
    }

    
    
    
    
}

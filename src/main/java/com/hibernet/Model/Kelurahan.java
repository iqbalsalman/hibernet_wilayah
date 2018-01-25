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
@Table(name = "m_kelurahan", schema = "public")
public class Kelurahan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_kelurahan", updatable = false, nullable = false)
    private long id_kel;

    

    @Column(name = "nm_kelurahan", length = 75)
    private String nama_kel;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_kec")
    private Kecamatan kecamatan;

    public long getId_kel() {
        return id_kel;
    }

    public void setId_kel(long id_kel) {
        this.id_kel = id_kel;
    }
    
    public String getNama_kel() {
        return nama_kel;
    }

    public void setNama_kel(String nama_kel) {
        this.nama_kel = nama_kel;
    }

    /**
     * @return the kecamatan
     */
    public Kecamatan getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kecamatan the kecamatan to set
     */
    public void setKecamatan(Kecamatan kecamatan) {
        this.kecamatan = kecamatan;
    }

}

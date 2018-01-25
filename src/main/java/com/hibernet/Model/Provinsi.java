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
@Table(name = "m_propinsi", schema = "public")
public class Provinsi extends BaseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_propinsi", updatable = false, nullable = false)
    private Integer id_prov;
    
    @Column(name = "id_negara", updatable = false, nullable = false )
    private Integer id_negara;
    
    @Column(name = "nm_propinsi", length = 75)
    private String nm_provinsi;
    
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_kab")
//    private KotaKabupaten kotakabupaten;
    

    public Integer getId_prov() {
        return id_prov;
    }

    public void setId_prov(Integer id_prov) {
        this.id_prov = id_prov;
    }

    public Integer getId_negara() {
        return id_negara;
    }

    public void setId_negara(Integer id_negara) {
        this.id_negara = id_negara;
    }

    public String getNm_provinsi() {
        return nm_provinsi;
    }

    public void setNm_provinsi(String nm_provinsi) {
        this.nm_provinsi = nm_provinsi;
    }


}

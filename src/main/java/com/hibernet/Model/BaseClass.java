/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernet.Model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author iqbal
 */
@MappedSuperclass
public class BaseClass {
    @Column(name = "id_entry", length = 30)
	private String idEntry;
	
	@Column(name = "tgl_entry")
	private Timestamp tglEntry;

	public String getIdEntry() {
		return idEntry;
	}

	public void setIdEntry(String idEntry) {
		this.idEntry = idEntry;
	}

	public Timestamp getTglEntry() {
		return tglEntry;
	}

	public void setTglEntry(Timestamp tglEntry) {
		this.tglEntry = tglEntry;
	}
	
    
}

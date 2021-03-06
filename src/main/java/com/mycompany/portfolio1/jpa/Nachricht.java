/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolio1.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Larissa
 */
@Entity
public class Nachricht implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Variablen initialisieren**************************************************
    private Long id;
    private Benutzer vonBenutzer;
    private Benutzer anBenutzer;
    private Anzeige zuArtikel;
    private String text;
    
    //GET/SET-Methoden**********************************************************
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    //**************************
    public Benutzer getVonBenutzer() {
        return vonBenutzer;
    }
    public void setVonBenutzer(Benutzer vonBenutzer) {
        this.vonBenutzer = vonBenutzer;
    }
    //**************************
    public Benutzer getAnBenutzer() {
        return anBenutzer;
    }
    public void getAnBenutzer(Benutzer anBenutzer) {
        this.anBenutzer = anBenutzer;
    }
    //**************************
    public Anzeige getZuArtikel() {
        return zuArtikel;
    }
    public void setZuArtikel(Anzeige zuArtikel) {
        this.zuArtikel = zuArtikel;
    }
    //**************************
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    //Fremdschlüssel***********************************************************
    @ManyToOne
    public Benutzer benutzer = new Benutzer();
    //*************************************************************************
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nachricht)) {
            return false;
        }
        Nachricht other = (Nachricht) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.portfolio1.jpa.Nachricht[ id=" + id + " ]";
    }
    
}

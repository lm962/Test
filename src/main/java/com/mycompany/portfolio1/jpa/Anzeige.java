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

/**
 *
 * @author MildL
 */
@Entity
public class Anzeige implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Variablen initialisieren**************************************************
    private Long id;
    private boolean art;
    private String titel;
    private String beschreibung;
    private Datum erstellungsdatum;
    private Datum onlineBis;
    private double preis;
    private String artDesPreis;
    private int plz;
    private String ort;
    
    //Konstruktor***************************************************************
    public Anzeige(Long id, boolean art, String titel, String beschreibung, Datum erstellungsdatum, Datum onlineBis, double preis, String artDesPreis,int plz, String ort) {
        this.id=id;
        this.art=art;
        this.titel=titel;
        this.beschreibung=beschreibung;
        this.erstellungsdatum=erstellungsdatum;
        this.onlineBis=onlineBis;
        this.preis=preis;
        this.artDesPreis=artDesPreis;
        this.plz=plz;
        this.ort=ort;
    }
    
    public Anzeige() {
    }
    //********************************************
    private Anzeige zuArtikel = new Anzeige();
    
    //GET/SET-Methoden**********************************************************
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
     //********************************
    public boolean getArt() {
        return art;
    }
    public void setArt(boolean art) {
        this.art = art;
    }
    //********************************
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
     //********************************
    public String getBeschreibung() {
        return beschreibung;
    }
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }
     //********************************
    public Datum getErstellungsdatum() {
        return erstellungsdatum;
    }
    public void setErstellungsdatum(Datum erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }
     //********************************
    public Datum getOnlineBis() {
        return onlineBis;
    }
    public void setOnlineBis(Datum onlineBis) {
        this.onlineBis = onlineBis;
    }
     //********************************
    public double getPreis() {
        return id;
    }
    public void setPreis(double preis) {
        this.preis = preis;
    }
     //********************************
    public String getArtDesPreis() {
        return artDesPreis;
    }
    public void setArtDesPreis(String artDesPreis) {
        this.artDesPreis = artDesPreis;
    }
     //********************************
    public int getPlz() {
        return plz;
    }
    public void setPlz(int plz) {
        this.plz = plz;
    }
    //********************************
    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }
    //********************************
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anzeige)) {
            return false;
        }
        Anzeige other = (Anzeige) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.portfolio1.jpa.Anzeige[ id=" + id + " ]";
    }
    
}

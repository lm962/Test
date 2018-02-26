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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Larissa
 */
@Entity
public class Benutzer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //Variablen initialisieren**************************************************
    private String benutzername;
    private String passwort;            //Achtung: hash!???
    private String vorname;
    private String nachname;
    private String straße;
    private int hausnummer;
    private int postleitzahl;
    private String ort;
    private String land;
    private String email;
    private int telefonnummer;
    
    //Konstruktor***************************************************************
    public Benutzer(String benutzername, String passwort, String vorname, String nachname, String straße, int hausnummer, int postleitzahl, String ort, String land, String email)  {
       this.benutzername = benutzername;
       this.passwort = passwort;
       this.vorname = vorname;
       this.nachname = nachname;
       this.straße = straße;
       this.hausnummer = hausnummer;
       this.postleitzahl = postleitzahl;
       this.ort = ort;
       this.land = land;
       this.email = email;
       this.telefonnummer = telefonnummer;
    }
    public Benutzer() {
        
    }
    //*******************************************
    private Benutzer vonBenutzer = new Benutzer();
    private Benutzer anBenutzer = new Benutzer();
    
    //GET/SET-Methoden**********************************************************
    public String getBenutzername() {
        return benutzername;
    }
    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }
    //*****************************
    public String getPasswort() {
        return passwort;
    }
    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }
    //*****************************
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    //*****************************
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    //*****************************
    public String getStraße() {
        return straße;
    }
    public void setStraße(String straße) {
        this.straße = straße;
    }
    //*****************************
    public int getHausnummer() {
        return hausnummer;
    }
    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
    //*****************************
    public int getPostleitzahl() {
        return postleitzahl;
    }
    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }
    //*****************************
    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }
    //*****************************
    public String getLand() {
        return land;
    }
    public void setLand(String land) {
        this.land = land;
    }
    //*****************************
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //*****************************
    public int getTelefonnummer() {
        return telefonnummer;
    }
    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
    //*****************************
    
    
    //Fremdschlüssel
    @ManyToMany
    public Anzeige anzeige= new Anzeige();

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benutzername != null ? benutzername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Benutzer)) {
            return false;
        }
        Benutzer other = (Benutzer) object;
        if ((this.benutzername == null && other.benutzername != null) || (this.benutzername != null && !this.benutzername.equals(other.benutzername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.portfolio1.jpa.Benutzer[ id=" + benutzername + " ]";
    }
    
}

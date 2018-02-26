/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolio1.jpa;

/**
 *
 * @author MildL
 */
public class Datum {
    //Variablen initialisieren**************************************************
    public int jahr;
    public int monat;
    public int tag;
    
    //Konstruktor***************************************************************
    public Datum (int jahr, int monat, int tag)  {
        this.jahr = jahr;
        this.monat = monat;
        this.tag = tag;
    }
    
    @Override
    public String toString(){
        return (tag + "." + monat + "." + jahr);
    }
}

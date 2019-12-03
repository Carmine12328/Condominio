/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.io.Serializable;

/**
 *
 * @author utente
 * @version 1.0
 * 
 */
public class Appartamenti implements Serializable{
    /**
     * Rappresenta il nome del proprietario dell'appartamento
     */
    private String propName;
    /**
     * Rappresente la superficie di ubn appartamento
     */
    private int superficie;
    /**
     * Rappresenta il piano dell'appartamento
     */
    private int piano;
    /**
     * Rappresenta in numero di persone dell'appartamento
     */
    private int nPers;
    
    private String cognome;

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }
    
    public String getPropName() {
        return propName;
    }

    public int getSuperfice() {
        return superficie;
    }

    public int getPiano() {
        return piano;
    }

    public int getnPers() {
        return nPers;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public void setnPers(int nPers) {
        this.nPers = nPers;
    }
    
    public void setSuperfice(int superficie) {
        this.superficie = superficie;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }
    /**
     * 
     * Il metodo visualizza permette di vedere in output tutte le caratteristiche di un appartamento
     * 
     */
    public void visualizza(){
        System.out.println("Il nome del proprietario è:"+" "+propName);
        System.out.println("Il piano è:"+" "+piano);
        System.out.println("La superfice dell' appartamento è:"+" "+superficie);
        System.out.println("Il numero di inquilini è:"+" "+nPers);
    }
    /**
     * 
     * @param piano Indica il piano dell'appartamento ( non è modficabile dall'utente)
     * @param nPers Indica il numero di persone presenti nell'appartamento
     * @param propName Indica il nome del proprietario dell'appartamento
     * @param superficie Indica la superficie dell'appartamento(non è modficabile dall'utente)
     * @param cognome Indica il cognome del proprietario dell'appartamento
     * 
     */    
    public Appartamenti(int piano, int nPers, String propName, int superficie,String cognome){
        this.piano = piano;
        this.nPers = nPers;
        this.superficie = superficie;
        this.propName = propName;
        this.cognome = cognome;
    }
    
}

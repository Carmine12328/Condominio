/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioneappartamenti;

import java.io.Serializable;
import javax.swing.JOptionPane;
 
/**
 *
 * @author Carmine Annunziata
 * 
 */
public class Condominio implements Serializable{
    /**
     * è un vettore di 20 elementi riferiti alla classe Appartamenti
     */
    
    private final Appartamenti condominio_app[];
    /**
     * Costruttore di default dell'array di Appartamenti
     */
    public Condominio() {
    int c = 0;
    this.condominio_app = new Appartamenti[21];
    int dim[];
    dim = new int[3];
    dim[0] = 100;
    dim[1] = 130;
    dim[2] = 90;
    int  k=0;
    
    for(int i = 0; i < 21; i++ ){
       condominio_app [i] = new Appartamenti(c,0,"nessuno",dim[k],"nessuno"); 
       k++;
       if(k>2){
       c++;
       k=0;
    }   
}
}  
 
    public Appartamenti getAppartamento(int i) {
    
        return condominio_app[i];
    }
    /**
     * Modifica i dati dell'appartamento
     * @param i Indica il numero dell' appartamento del condominio
     * @param nome Indica il nome del proprietario dell'appartamento
     * @param nPers Indica  il numero di persone presenti nell'appartamento
     * @param cognome Indica il cognome del proprietario dell'appartamento
     */
    public void cambioAppartamento(int i,String nome,int nPers,String cognome){
            condominio_app[i].setPropName(nome);
            condominio_app[i].setnPers(nPers);
            condominio_app[i].setCognome(cognome);
        }
    /**
     * Controlla che l'appartamento che si vuole occupare non sia già occupato
     * @param i Indica il numero dell' appartamento del condominio
     * @return true se nome assegnato all'appartamento è diverso da nessuno altrimenti return false
     */
    public boolean inserisciAppartamento(int i){ 
        String r =  condominio_app[i].getPropName();
        return !r.equals("nessuno");
    }
    /**
     * 
     * Vengono stampate in output tutte le caratteristiche di un appartamento del condominio
     * @param i Indica il numero dell' appartamento del condominio
     * 
     */
    public void visualizzaCondominio(int i){
          System.out.println("Il nome del proprietario dell'appartamento"+" "+i+" "+"è:"+" "+condominio_app[i].getPropName());
          System.out.println("Il numero di coinquilini dell'appartamento"+" "+i+" "+"è:"+" "+condominio_app[i].getnPers());
          System.out.println("La superficie dell'appartamento"+" "+i+" "+"è:"+" "+condominio_app[i].getSuperfice());
          System.out.println("Il piano dell'appartamento"+" "+i+" "+"è:"+" "+condominio_app[i].getPiano());
    }
    /**
     * 
     * Da la possibilità all'utente di riasegnare i parametri di default ad un appartamento
     * @param i Indica il numero dell' appartamento del condominio
     * 
     */
    public void rimuoviAppartamento(int i){
        condominio_app[i].setPropName("nessuno");
        condominio_app[i].setnPers(0);
        condominio_app[i].setCognome("nessuno");
    }
    /**
     * Viene stampato in output la quantatità di spese del condominio basate sul numero di coinquilini presenti al momento
     */
    public void speseCondominiali(){
        int nConq = 0,spese = 0;
        for(int i = 0; i < 21; i++){
        nConq += condominio_app[i].getnPers();
        }
        
        spese = nConq * 10;
        if(spese == 0){
           JOptionPane.showMessageDialog(null,"Non ci sono spese condominiali al momento");  
        }
        else{
           JOptionPane.showMessageDialog(null,"Le spese condominiali sono"+" "+spese+"$"); 
        }
        
    }
    /**
     * Crea un array con all'interno tutti i nomi dei propietari degli appartamenti
     * @param propName  Indica il nome del proprietario dell'appartamento
     */
    public void arrayName(String propName){
        boolean a = true;
        String []nomeProp = new String[20];
        for(int f = 0; f < 20; f++){
            nomeProp[f] = condominio_app[f].getPropName();
        }
         for(int f = 0; f < 20; f++){
            if(nomeProp[f].equals(propName)){
                condominio_app[f].visualizza();
                a = false;
            }
        }    
         if(a == true){
             System.out.println("Non ci sono proprietari con quel nome");
         }
    }
    /**
     * Controlla che il nome del propietario sia uguale o diverso da quello di default
     * @param a VNumero booleano utile ai fini del retrun del metodo
     * @return true nel caso in cui il nome è diverso da nessuno
     */
    public boolean controlloAppartamenti(boolean a){
        for(int i = 0; i < 20; i++){
            if(!condominio_app[i].getPropName().equals("nessuno")){
            return a = true;
        }
    }
        return a = false;
}
    /**
     * Stampa in output tutti gli appartamenti che non sono occupati
     */
    public void appartamentiLiberi(){
        for(int i = 0; i < 20; i++){
          if(condominio_app[i].getPropName().equals("nessuno")){
            System.out.println("L'appartamento n."+" "+i+" al piano"+" "+condominio_app[i].getPiano()+" "+"è libero");
        }
    }
    }
    /**
     * Ritorna il numero del primo appartamento libero nel condominio
     * @return i dove i indica il numero del primo appartamento libero, nel caso nessun appartamento sia libero ritorna -1
     */
    public int appartamentiLiberiGraph(){
        for(int i = 0; i < 21; i++){
          if(condominio_app[i].getPropName().equals("nessuno")){
            return i;
          }
        }
        return -1;
    }
    
    /**
     *Ritorna true nel caso in cui sia contenuta la stringa all'interno del nome o del cognome, ritorna false in caso contrario
     * @param name Rappresenta la stringa inserita dall'utente che deve essere riccercata nei nomi dei proprietari
     * @param pos Rappresenta il parametro utilizzato per indicare su quale appartamento deve essere fattto il controllo
     * @return true se la stringa inserita e' presente nel nome o nel cognome e se entrambi sono diversi da nessuno altrimenti false
     */
    public Boolean RicercaAppartamento(String name,int pos){
        return (condominio_app[pos].getPropName().toLowerCase().contains(name.toLowerCase()) && !"nessuno".equals(condominio_app[pos].getPropName())) || (condominio_app[pos].getCognome().toLowerCase().contains(name.toLowerCase()) && !"nessuno".equals(condominio_app[pos].getCognome()));
        
    }
    /**
     * Ritorna in output il nome del proprietario dell'appartamento occupato
     * @param i Rappresenta il parametro che indica di quale appartamento deve essere ritornato il nome
     * @return ritorna il nome del proprietario dell'appartamento
     */
    public String ritornanome(int i){
        String nome;
        nome = condominio_app[i].getPropName();
        return nome;
    }
    /**
     * Ritorna in output il piano dell'appartamento occupato
     * @param i Rappresenta il parametro che indica di quale appartamento deve essere ritornato il piano
     * @return ritorna il piano dell'appartamento occupato
     */
    public String ritornaPiano(int i){
        String piano;
        Integer piano1;
        piano1 = condominio_app[i].getPiano();
        piano = piano1.toString();
        
        return piano;
    }
    /**
     * Ritorna in output il numero di coinquilini dell'appartamento occupato
     * @param i Rappresenta il parametro che indica di quale appartamento deve essere ritornato il numero di coinquilini
     * @return ritorna il numero di coinquilini dell'appartamento occupato
     */
    public String ritornaNinq(int i){
     Integer nInq;
     String nInq1;
     nInq = condominio_app[i].getnPers();
     nInq1 = nInq.toString();
     return nInq1;
    }
    /**
     * Ritorna in output il cognome del proprietario dell'appartamento occupato
     * @param i Rappresenta il parametro che indica di quale appartamento deve essere ritornato il cognome
     * @return ritorna il cognome del proprietario dell'appartamento
     */
    public String ritornaCognome(int i){
        String cognome;
        cognome = condominio_app[i].getCognome();
        return cognome;
    }
}

    
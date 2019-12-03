/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestioneappartamenti;

import javax.swing.JOptionPane;


/**
 * 
 * @author utente Annunziata Carmine
 * 
 */
public class TestAppartamenti {

    /**
     * 
     * @param args args
     * 
     */
    
    public static void main(String[] args){
        // TODO code application logic here
        try{
            DbConnect connect = new DbConnect();
            FinestraGrafica graph = new FinestraGrafica("Gestione Condominio");
            graph.setVisible(true);
            connect.getData();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Errore di sistema");
            System.out.println(e);
        }
        /*int cont = 0;
        int nPers = 0;
        int piano = 0;
        int superficie = 0;
        String propName;
        //Appartamenti appa = new Appartamenti(piano,nPers,propName,superficie);
        PrintStream out = new PrintStream(System.out, true, "CP850"); 
        String nom_p2;
        int scl;
        int i = 0;
        boolean a = false ;
        
        
        Scanner tastiera = new Scanner (System.in);
        
        
        /*System.out.println("Inserire il nome del proprietario del secondo piano");
        nom_p2 = tastiera.nextLine();
        System.out.println("Inserire il numero di inquilini del terzo piano ");
        nPers = tastiera.nextInt();
        Appartamenti n1 = new Appartamenti(1,1,"Luigi",1);
        Appartamenti n2 = new Appartamenti(2,2,nom_p2,2);
        Appartamenti n3 = new Appartamenti(3,3,"Alfonso",nPers);
        n1.visualizza();
        n2.visualizza();
        n3.visualizza();
        do{
        do{
        System.out.println("1- Ricerca appartamenti liberi");    
        System.out.println("2- Nuovo appartamento");
        System.out.println("3- Rimuovi appartamento esistente");
        System.out.println("4- Modifica dati appartamento");
        System.out.println("5- Spese condominiali");
        System.out.println("6- Dati appartamenti condominio");
        System.out.println("7- Ricerca appartamento per nome proprietario completo");
        scl = tastiera.nextInt();
        }while(scl < 1 || scl > 7);
        
        switch(scl){
            case(1):{
                cond1.appartamentiLiberi();
                break;
            }
            case(2):{
                do{
                do{
                System.out.println("Quale appartamento si vuole occupare?");
                try {
                    i = tastiera.nextInt(); 
                }
                catch(Exception e){
                    System.out.println(e);
                    System.out.println("Errore di inserimento: Inserire un numero da 0 a 20");
                    System.exit(0);
                }
                 
                }while(i > 20);
                a = cond1.inserisciAppartamento(i);
                }while(a == true);
                System.out.println("Inserire il nome del proprietario");
                propName = tastiera.nextLine();
                propName = tastiera.nextLine();
                System.out.println("Inserire il numero di coinquilini");
                try{
                nPers = tastiera.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);
                    System.out.println("Errore di inserimento: Inserire un numero(l'inserimento di caratteri o caratteri speciali dara' errore)");
                    System.exit(0);
                }
                cond1.cambioAppartamento(i,propName,nPers);
                cond1.visualizzaCondominio(i);
                break;
            }
         
            
            case(3):{
                a = cond1.controlloAppartamenti(a);
                if(a == true){
                    System.out.println("Quale appartamento si vuole rimuovere?");
                    try{
                        i = tastiera.nextInt();
                    }
                    catch(Exception e){
                        System.out.println(e);
                        System.out.println("Errore di inserimento: Inserire un numero da 0 a 20");
                        System.exit(0);
                    }
                    cond1.rimuoviAppartamento(i); 
                break;
                }
                else{
                    System.out.println("Nessuno appartamento da rimuovere");
                    break;
                }
            }
            
            case(4):{
                a = cond1.controlloAppartamenti(a);
                if(a == true){
                do{
                System.out.println("Di quale appartamento si vuogliono modificare i dati");
                try{
                    i = tastiera.nextInt(); 
                }
                catch(Exception e){
                    System.out.println(e);
                    System.out.println("Errore di inserimento: Inserire un numero da 0 a 20");
                    System.exit(0);
                }
                a = cond1.inserisciAppartamento(i);
                }while(a != true);
                System.out.println("Inserire il nome del proprietario");
                propName = tastiera.nextLine();
                propName = tastiera.nextLine();
                System.out.println("Inserire il numero di coinquilini");
                try{
                    nPers = tastiera.nextInt();
                }
                catch(Exception e){
                    System.out.println(e);
                    System.out.println("Errore di inserimento: Inserire un numero(l'inserimento di caratteri o caratteri speciali dara' errore)");
                    System.exit(0);
                }
                cond1.cambioAppartamento(i,propName,nPers);
                break;
            }
                else{
                System.out.println("Nessun appartamento da modificare");
                break;
                }
        }
            
            case(5):{
                cond1.speseCondominiali();
                break;
            }
            
            case(6):{
                for(int j = 0; j < 20; j++){
                    cond1.visualizzaCondominio(j);
                }
                break;
            }
            case(7):{
                System.out.println("Quale nome si vuole ricercare?");
                propName = tastiera.nextLine();
                propName = tastiera.nextLine();
                cond1.arrayName(propName);
                break;
            }
            
            
            
}
        System.out.println("Si vogliono fare altre operazioni?(inserire 1 per continuare)");
        try{
        cont = tastiera.nextInt();
        }
        catch(Exception e){
           System.out.println("Errore di inserimento: Inserire un numero(l'inserimento di caratteri o caratteri speciali dara' errore)");
           System.exit(0); 
        }
        }while(cont == 1);
}*/
}
}

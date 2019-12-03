/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *La seguente pagina permette all'utente di reinserire i dati(a livello grafico) che sono gia' stati immessi in precedenza, questi verrano gia' mostrati a video nelle relative text-box
 * @author Carmine Annunziata
 * 
 */
public class GraficaModificaAppartamento  extends FinestraGrafica {
     Ascoltatore listener = new Ascoltatore();
        JLabel j1,j2,j3;
        JTextField jt1,jt2,jt3;
        JButton jb1,jb2,jb3,jb4,jb5;
        public GraficaModificaAppartamento(String titolo,int appartamento){
        super(titolo);
        Integer a = appartamento;
        String b;
        b = a.toString();
        setBounds(100, 100, 800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        add(p);
        p.setLayout(null);
        j1 = new JLabel("Nome");
        j1.setBounds(10, 10, 50, 30);
        p.add(j1);
        jt1 = new JTextField(cond1.ritornanome(appartamento));
        jt1.setBounds(10, 40, 150, 30);
        p.add(jt1);
        /*jb1 = new JButton("CONFERMA");
        jb1.setBounds(170, 40, 150, 30);
        p.add(jb1);*/
        
        j2 = new JLabel("Cognome");
        j2.setBounds(10, 70, 100, 30);
        p.add(j2);
        jt2 = new JTextField(cond1.ritornaCognome(appartamento));
        jt2.setBounds(10, 100, 150, 30);
        p.add(jt2);
        /*jb2 = new JButton("CONFERMA");
        jb2.setBounds(170, 100, 150, 30);
        p.add(jb2);*/
        
        j3 = new JLabel("Numero di inquilini");
        j3.setBounds(10, 130, 150, 30);
        p.add(j3);
        jt3 = new JTextField(cond1.ritornaNinq(appartamento));
        jt3.setBounds(10, 160, 150, 30);
        p.add(jt3);
       /* jb3 = new JButton("CONFERMA");
        jb3.setBounds(170, 160, 150, 30);
        p.add(jb3);*/
        
        jb4 = new JButton("Assegna appartamento");
        jb4.setBounds(10, 220, 200, 40);
        p.add(jb4);
        
        jb5 = new JButton(b);
        
        /*jb1.addActionListener(listener);
        jb2.addActionListener(listener);
        jb3.addActionListener(listener);*/
        jb4.addActionListener(listener);
}

    public class Ascoltatore implements ActionListener{
        String a,b,c,e,z,t;
        int d,f;
        Boolean g = true,h = true,l = true;
        @Override
        public void actionPerformed(ActionEvent ae) {
        t = jt2.getText();
        a = jt1.getText();
        Object  src = ae.getSource();
        if(src == jb1){
            h = true;
            a = jt1.getText();
            if(a.trim().length() == 0){
                JOptionPane.showMessageDialog(null,"Nessun nome inserito");
             } 
        }
        if(src == jb2){
            h = true;
            b = jt2.getText();
            if(b.trim().length() == 0){
                JOptionPane.showMessageDialog(null,"Nessun cognome inserito");
            }
        }
        if(src == jb3){
           h = true;
           try{
            c = jt3.getText();
            d = Integer.parseInt(c);
           }
           catch(NumberFormatException ex){
              JOptionPane.showMessageDialog(null,"Inserire un numero"); 
           }
        }
        if(src == jb4){
            try{
            h = true;
            a = jt1.getText();
            if(a.trim().length() == 0 || a.trim().toLowerCase() == "nessuno"){
                h = false;
            }
            }
            catch(NullPointerException y){
                h = false;
                JOptionPane.showMessageDialog(null,"Nessun nome inserito");
            }
            
            try{
            g = true;
            b = jt2.getText();
            if(b.trim().length() == 0 || b.trim().toLowerCase() == "nessuno"){
                g = false;
            }
            }
            catch(NullPointerException y){
                g = false;
                JOptionPane.showMessageDialog(null,"Nessun cognome inserito");
            }
            
            try{
            l = true;
            c = jt3.getText();
            d = Integer.parseInt(c);
            if(d <= 0 || d > 20){
                 l = false;
                }
            }
            catch(NumberFormatException ex){
                 l = false;
                 //JOptionPane.showMessageDialog(null,"Inserire un numero"); 
            } 
             
            if(h == true && g == true){
            e = jb5.getText();  
            f = Integer.parseInt(e);
            JOptionPane.showMessageDialog(null,"Dati modificati con successo");
            cond1.cambioAppartamento(f, a, d,b);
            cond1.visualizzaCondominio(f);
            setVisible(false);
            }
            else{
                if(h == false || g == false){
                    JOptionPane.showMessageDialog(null,"Ricorda che nome e cognome non possono essere uguali a nessuno");
                }
                else if(l == false){
                    JOptionPane.showMessageDialog(null,"Il numero degli inquilini deve essere compreso tra 1 e 20");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Impossibile Assegnare l'appartamento ricontrolla i dati inseriti"); 
                }  
            }
        }
       
    }
    
    }
    
}
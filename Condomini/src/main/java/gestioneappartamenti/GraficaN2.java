/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Carmine Annunziata
 */
public class GraficaN2 extends FinestraGrafica implements ActionListener{
    Ascoltatore listener = new Ascoltatore();
    protected JLabel j1,j2,j3,j4,j5,j6,j7,j8;
    protected JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
    /**
     * 
     * @param titolo Nome della pagina di grafica aperta durante la scelta dell'appartamento da occupare 
     */
    public GraficaN2(String titolo){
        super(titolo);
        setBounds(100, 100, 800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        add(p);
        p.setLayout(null);
        j1 = new JLabel("Quale appartamento si vuole occupare?");
        j1.setBounds(230, 0, 300, 30);
        p.add(j1);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        j2 = new JLabel("Piano 6");
        j2.setBounds(230, 30, 50, 30);
        p.add(j2);
        b1 = new JButton("20");
        b1.setBounds(280, 35, 50, 20);
        p.add(b1);
        if(cond1.inserisciAppartamento(20)== true){
            b1.setBackground(Color.red);
        }
        else{
            b1.setBackground(Color.green);
        }
        b2 = new JButton("19");
        b2.setBounds(330, 35, 50, 20);
        if(cond1.inserisciAppartamento(19)== true){
            b2.setBackground(Color.red);
        }
        else{
            b2.setBackground(Color.green);
        }
        p.add(b2);
        b3 = new JButton("18");
        b3.setBounds(380, 35, 50, 20);
        if(cond1.inserisciAppartamento(18)== true){
            b3.setBackground(Color.red);
        }
        else{
            b3.setBackground(Color.green);
        }
        p.add(b3);
        
        j3 = new JLabel("Piano 5");
        j3.setBounds(230, 55, 50, 30);
        p.add(j3);
        b4 = new JButton("17");
        b4.setBounds(280, 60, 50, 20);
        if(cond1.inserisciAppartamento(17)== true){
            b4.setBackground(Color.red);
        }
        else{
            b4.setBackground(Color.green);
        }
        p.add(b4);
        b5 = new JButton("16");
        b5.setBounds(330, 60, 50, 20);
        if(cond1.inserisciAppartamento(16)== true){
            b5.setBackground(Color.red);
        }
        else{
            b5.setBackground(Color.green);
        }
        p.add(b5);
        b6 = new JButton("15");
        if(cond1.inserisciAppartamento(15)== true){
            b6.setBackground(Color.red);
        }
        else{
            b6.setBackground(Color.green);
        }
        b6.setBounds(380, 60, 50, 20);
        p.add(b6);
        
        j4 = new JLabel("Piano 4");
        j4.setBounds(230, 80, 50, 30);
        p.add(j4);
        b7 = new JButton("14");
        b7.setBounds(280, 85, 50, 20);
        if(cond1.inserisciAppartamento(14)== true){
            b7.setBackground(Color.red);
        }
        else{
            b7.setBackground(Color.green);
        }
        p.add(b7);
        b8 = new JButton("13");
        b8.setBounds(330, 85, 50, 20);
        if(cond1.inserisciAppartamento(13)== true){
            b8.setBackground(Color.red);
        }
        else{
            b8.setBackground(Color.green);
        }
        p.add(b8);
        b9 = new JButton("12");
        b9.setBounds(380, 85, 50, 20);
        if(cond1.inserisciAppartamento(12)== true){
            b9.setBackground(Color.red);
        }
        else{
            b9.setBackground(Color.green);
        }
        p.add(b9);
        
        j5 = new JLabel("Piano 3");
        j5.setBounds(230, 105, 50, 30);
        p.add(j5);
        b10 = new JButton("11");
        b10.setBounds(280, 110, 50, 20);
        if(cond1.inserisciAppartamento(11)== true){
            b10.setBackground(Color.red);
        }
        else{
            b10.setBackground(Color.green);
        }
        p.add(b10);
        b11 = new JButton("10");
        b11.setBounds(330, 110, 50, 20);
        if(cond1.inserisciAppartamento(10)== true){
            b11.setBackground(Color.red);
        }
        else{
            b11.setBackground(Color.green);
        }
        p.add(b11);
        b12 = new JButton("9");
        b12.setBounds(380, 110, 50, 20);
        if(cond1.inserisciAppartamento(9)== true){
            b12.setBackground(Color.red);
        }
        else{
            b12.setBackground(Color.green);
        }
        p.add(b12);
        
        j6 = new JLabel("Piano 2");
        j6.setBounds(230, 130, 50, 30);
        p.add(j6);
        b13 = new JButton("8");
        b13.setBounds(280, 135, 50, 20);
        if(cond1.inserisciAppartamento(8)== true){
            b13.setBackground(Color.red);
        }
        else{
            b13.setBackground(Color.green);
        }
        p.add(b13);
        b14 = new JButton("7");
        b14.setBounds(330, 135, 50, 20);
        if(cond1.inserisciAppartamento(7)== true){
            b14.setBackground(Color.red);
        }
        else{
            b14.setBackground(Color.green);
        }
        p.add(b14);
        b15 = new JButton("6");
        b15.setBounds(380, 135, 50, 20);
        if(cond1.inserisciAppartamento(6)== true){
            b15.setBackground(Color.red);
        }
        else{
            b15.setBackground(Color.green);
        }
        p.add(b15);
        
        j7 = new JLabel("Piano 1");
        j7.setBounds(230, 155, 50, 30);
        p.add(j7);
        b16 = new JButton("5");
        b16.setBounds(280, 160, 50, 20);
        if(cond1.inserisciAppartamento(5)== true){
            b16.setBackground(Color.red);
        }
        else{
            b16.setBackground(Color.green);
        }
        p.add(b16);
        b17 = new JButton("4");
        b17.setBounds(330, 160, 50, 20);
        if(cond1.inserisciAppartamento(4)== true){
            b17.setBackground(Color.red);
        }
        else{
            b17.setBackground(Color.green);
        }
        p.add(b17);
        b18 = new JButton("3");
        b18.setBounds(380, 160, 50, 20);
        if(cond1.inserisciAppartamento(3)== true){
            b18.setBackground(Color.red);
        }
        else{
            b18.setBackground(Color.green);
        }
        p.add(b18);
        
        j8 = new JLabel("Piano terra");
        j8.setBounds(215, 180, 80, 30);
        p.add(j8);
        b19 = new JButton("2");
        b19.setBounds(280, 185, 50, 20);
        if(cond1.inserisciAppartamento(2)== true){
            b19.setBackground(Color.red);
        }
        else{
            b19.setBackground(Color.green);
        }
        p.add(b19);
        b20 = new JButton("1");
        b20.setBounds(330, 185, 50, 20);
        if(cond1.inserisciAppartamento(1)== true){
            b20.setBackground(Color.red);
        }
        else{
            b20.setBackground(Color.green);
        }
        p.add(b20);
        b21 = new JButton("0");
        b21.setBounds(380, 185, 50, 20);
        if(cond1.inserisciAppartamento(0)== true){
            b21.setBackground(Color.red);
        }
        else{
            b21.setBackground(Color.green);
        }
        p.add(b21);
        
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);
        b10.addActionListener(listener);
        b11.addActionListener(listener);
        b12.addActionListener(listener);
        b13.addActionListener(listener);
        b14.addActionListener(listener);
        b15.addActionListener(listener);
        b16.addActionListener(listener);
        b17.addActionListener(listener);
        b18.addActionListener(listener);
        b19.addActionListener(listener);
        b20.addActionListener(listener);
        b21.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class Ascoltatore implements ActionListener{
        Boolean a = true;
        @Override
        public void actionPerformed(ActionEvent ae) {
            Object  src = ae.getSource();
            if(src == b1){
              a = cond1.inserisciAppartamento(20);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",20);
                 p.setVisible(true);   
              }
            }
            if(src == b2){
              
              a = cond1.inserisciAppartamento(19);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",19);
                 p.setVisible(true);   
              }
            }
            if(src == b3){
              
              a = cond1.inserisciAppartamento(18);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",18);
                 p.setVisible(true);   
              }
            }
            if(src == b4){
              
              a = cond1.inserisciAppartamento(17);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",17);
                 p.setVisible(true);   
              }
            }
            if(src == b5){
              
              a = cond1.inserisciAppartamento(16);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",16);
                 p.setVisible(true);   
              }
            }
            if(src == b6){
              
              a = cond1.inserisciAppartamento(15);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",15);
                 p.setVisible(true);   
              }
            }
            if(src == b7){
              
              a = cond1.inserisciAppartamento(14);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",14);
                 p.setVisible(true);   
              }
            }
            if(src == b8){
              
              a = cond1.inserisciAppartamento(13);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",13);
                 p.setVisible(true);   
              }
            }
            if(src == b9){
              
              a = cond1.inserisciAppartamento(12);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",12);
                 p.setVisible(true);   
              }
            }
            if(src == b10){
              
              a = cond1.inserisciAppartamento(11);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",11);
                 p.setVisible(true);   
              }
            }
            if(src == b11){
              
              a = cond1.inserisciAppartamento(10);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",10);
                 p.setVisible(true);   
              }
            }
            if(src == b12){
              
              a = cond1.inserisciAppartamento(9);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",9);
                 p.setVisible(true);   
              }
            }
            if(src == b13){
              
              a = cond1.inserisciAppartamento(8);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",8);
                 p.setVisible(true);   
              }
            }
            if(src == b14){
              
              a = cond1.inserisciAppartamento(7);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",7);
                 p.setVisible(true);   
              }
            }
            if(src == b15){
              
              a = cond1.inserisciAppartamento(6);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",6);
                 p.setVisible(true);   
              }
            }
            if(src == b16){
              
              a = cond1.inserisciAppartamento(5);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",5);
                 p.setVisible(true);   
              }
            }
            if(src == b17){
              
              a = cond1.inserisciAppartamento(4);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",4);
                 p.setVisible(true);   
              }
            }
            if(src == b18){
              
              a = cond1.inserisciAppartamento(3);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",3);
                 p.setVisible(true);   
              }
            }
            if(src == b19){
              
              a = cond1.inserisciAppartamento(2);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",2);
                 p.setVisible(true);   
              }
            }
            if(src == b20){
              
              a = cond1.inserisciAppartamento(1);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",1);
                 p.setVisible(true);   
              }
            }
            if(src == b21){
              
              a = cond1.inserisciAppartamento(0);
              if(a == true){
                  JOptionPane.showMessageDialog(null,"Appartamento già occupato");
              }
              else{
                 setVisible(false);
                 GraficaNuovoAppartamento p = new GraficaNuovoAppartamento("Appartamento",0);
                 p.setVisible(true);   
              }
            }
            
        }  
    }
    
    
    
    
    
    
    
    
}


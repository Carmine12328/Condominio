/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author utente
 */
public class ModificaDati extends FinestraGrafica {
    protected JLabel j1,j2,j3,j4,j5,j6,j7,j8;
    protected JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21;
    public ModificaDati(String titolo) {
        super(titolo);
        Ascoltatore listene = new Ascoltatore();
        setBounds(100, 100, 800, 500);
        JPanel p = new JPanel();
        add(p);
        p.setLayout(null);
        j1 = new JLabel("Quale appartamento si vuole modificare?");
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
        
        b1.addActionListener(listene);
        b2.addActionListener(listene);
        b3.addActionListener(listene);
        b4.addActionListener(listene);
        b5.addActionListener(listene);
        b6.addActionListener(listene);
        b7.addActionListener(listene);
        b8.addActionListener(listene);
        b9.addActionListener(listene);
        b10.addActionListener(listene);
        b11.addActionListener(listene);
        b12.addActionListener(listene);
        b13.addActionListener(listene);
        b14.addActionListener(listene);
        b15.addActionListener(listene);
        b16.addActionListener(listene);
        b17.addActionListener(listene);
        b18.addActionListener(listene);
        b19.addActionListener(listene);
        b20.addActionListener(listene);
        b21.addActionListener(listene);
        
    }  
    public class Ascoltatore implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
           
           Object  src = ae.getSource();
           if(src == b1){
              if(cond1.inserisciAppartamento(20) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",20);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b2){
              if(cond1.inserisciAppartamento(19) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",19);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b3){  
            if(cond1.inserisciAppartamento(18) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",18);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b4){
            if(cond1.inserisciAppartamento(17) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",17);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b5){
            if(cond1.inserisciAppartamento(16) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",16);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b6){
            if(cond1.inserisciAppartamento(15) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",15);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b7){
            if(cond1.inserisciAppartamento(14) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",14);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b8){
            if(cond1.inserisciAppartamento(13) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",13);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b9){
            if(cond1.inserisciAppartamento(12) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",12);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b10){
              if(cond1.inserisciAppartamento(11) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",11);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            
            if(src == b11){
            if(cond1.inserisciAppartamento(10) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",10);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b12){
            if(cond1.inserisciAppartamento(9) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",9);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b13){
            if(cond1.inserisciAppartamento(8) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",8);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b14){
            if(cond1.inserisciAppartamento(7) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",7);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b15){
            if(cond1.inserisciAppartamento(6) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",6);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b16){
            if(cond1.inserisciAppartamento(5) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",5);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b17){
            if(cond1.inserisciAppartamento(4) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",4);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b18){
            if(cond1.inserisciAppartamento(3) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",3);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b19){
            if(cond1.inserisciAppartamento(2) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",2);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b20){
            if(cond1.inserisciAppartamento(1) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",1);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            if(src == b21){
            if(cond1.inserisciAppartamento(0) == false){
                    JOptionPane.showMessageDialog(null,"Non c'è nessun appartamento da modificare qui");    
              }
              else{
              GraficaModificaAppartamento p2 = new GraficaModificaAppartamento("Modifica appartamento",0);
              p2.setVisible(true);
              setVisible(false);
              }
            }
            
        }  
    }
        
}
        
        
    
    
    
    

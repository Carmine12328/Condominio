/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.awt.Color;
import static java.awt.Color.green;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class RicercaAppartamento extends FinestraGrafica{
    JTextField jt1;
    JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22;
    Ascoltatore listener = new Ascoltatore();
    public RicercaAppartamento(String titolo) {
        super(titolo);
        setBounds(100, 100, 800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        add(p);
        p.setLayout(null);
        
        j9 = new JLabel("Nome");
        j9.setBounds(10, 10, 50, 30);
        p.add(j9);
        jt1 = new JTextField();
        jt1.setBounds(10, 40, 150, 30);
        p.add(jt1);
        b22 = new JButton("Invio");
        b22.setBounds(170, 40, 80, 30);
        p.add(b22);
        
        j2 = new JLabel("Piano 6");
        j2.setBounds(270, 100, 50, 30);  
        p.add(j2);
        b1 = new JButton("20");
        b1.setBounds(320, 105, 50, 20);
        p.add(b1);
        b2 = new JButton("19");
        b2.setBounds(370, 105, 50, 20);
        p.add(b2);
        b3 = new JButton("18");
        b3.setBounds(420, 105, 50, 20);
        p.add(b3);
        
        j3 = new JLabel("Piano 5");
        j3.setBounds(270, 120, 50, 30);
        p.add(j3);
        b4 = new JButton("17");
        b4.setBounds(320, 125, 50, 20);
        p.add(b4);
        b5 = new JButton("16");
        b5.setBounds(370, 125, 50, 20);
        p.add(b5);
        b6 = new JButton("15");
        b6.setBounds(420, 125, 50, 20);
        p.add(b6);
        
        j4 = new JLabel("Piano 4");
        j4.setBounds(270, 140, 50, 30);
        p.add(j4);
        b7 = new JButton("14");
        b7.setBounds(320, 145, 50, 20);
        p.add(b7);
        b8 = new JButton("13");
        b8.setBounds(370, 145, 50, 20);
        p.add(b8);
        b9 = new JButton("12");
        b9.setBounds(420, 145, 50, 20);
        p.add(b9);
        
        j5 = new JLabel("Piano 3");
        j5.setBounds(270, 160, 50, 30);
        p.add(j5);
        b10 = new JButton("11");
        b10.setBounds(320, 165, 50, 20);
        p.add(b10);
        b11 = new JButton("10");
        b11.setBounds(370, 165, 50, 20);
        p.add(b11);
        b12 = new JButton("9");
        b12.setBounds(420, 165, 50, 20);
        p.add(b12);
        
        j6 = new JLabel("Piano 2");
        j6.setBounds(270, 180, 50, 30);
        p.add(j6);
        b13 = new JButton("8");
        b13.setBounds(320, 185, 50, 20);
        p.add(b13);
        b14 = new JButton("7");
        b14.setBounds(370, 185, 50, 20);
        p.add(b14);
        b15 = new JButton("6");
        b15.setBounds(420, 185, 50, 20);
        p.add(b15);
        
        j7 = new JLabel("Piano 1");
        j7.setBounds(270, 200, 50, 30);
        p.add(j7);
        b16 = new JButton("5");
        b16.setBounds(320, 205, 50, 20);
        p.add(b16);
        b17 = new JButton("4");
        b17.setBounds(370, 205, 50, 20);
        p.add(b17);
        b18 = new JButton("3");
        b18.setBounds(420, 205, 50, 20);
        p.add(b18);
        
                j8 = new JLabel("Piano terra");
        j8.setBounds(255, 220, 80, 30);
        p.add(j8);
        b19 = new JButton("2");
        b19.setBounds(320, 225, 50, 20);
        p.add(b19);
        b20 = new JButton("1");
        b20.setBounds(370, 225, 50, 20);
        p.add(b20);
        b21 = new JButton("0");
        b21.setBounds(420, 225, 50, 20);
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
        b22.addActionListener(listener);
        
        
        
        
    }
    
     public class Ascoltatore implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            int n = 0;
            Boolean a = true;
            String b = null,c,d;
            Object  src = ae.getSource();
            if(src == b1){
                if(b1.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b1.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(20)+" "+cond1.ritornaCognome(20));
                }
            }
            if(src == b2){
                if(b2.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b2.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(19)+" "+cond1.ritornaCognome(19));
                }
            }
            if(src == b3){
                if(b3.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b3.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(18)+" "+cond1.ritornaCognome(18));
                }
            }
            if(src == b4){
                if(b4.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b4.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(17)+" "+cond1.ritornaCognome(17));
                }
            }
            if(src == b5){
                if(b5.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b5.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(16)+" "+cond1.ritornaCognome(16));
                }
            }
            if(src == b6){
                if(b6.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b6.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(15)+" "+cond1.ritornaCognome(15));
                }
            }
            if(src == b7){
                if(b7.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b7.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(14)+" "+cond1.ritornaCognome(14));
                }
            }
            if(src == b8){
                if(b8.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b8.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(13)+" "+cond1.ritornaCognome(13));
                }
            }
            if(src == b9){
                if(b9.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b9.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(12)+" "+cond1.ritornaCognome(12));
                }
            }
            if(src == b10){
                if(b10.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b10.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(11)+" "+cond1.ritornaCognome(11));
                }
            }
            if(src == b11){
                if(b11.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b11.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(10)+" "+cond1.ritornaCognome(10));
                }
            }
            if(src == b12){
                if(b12.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b12.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(9)+" "+cond1.ritornaCognome(9));
                }
            }
            if(src == b13){
                if(b13.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b13.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(8)+" "+cond1.ritornaCognome(8));
                }
            }
            if(src == b14){
                if(b14.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b14.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(7)+" "+cond1.ritornaCognome(7));
                }
            }
            if(src == b15){
                if(b15.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b15.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(6)+" "+cond1.ritornaCognome(6));
                }
            }
            if(src == b16){
                if(b16.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b16.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(5)+" "+cond1.ritornaCognome(5));
                }
            }
            if(src == b17){
                if(b17.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b17.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(4)+" "+cond1.ritornaCognome(4));
                }
            }
            if(src == b18){
                if(b18.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b18.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(3)+" "+cond1.ritornaCognome(3));
                }
            }
            if(src == b19){
                if(b19.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b19.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(2)+" "+cond1.ritornaCognome(2));
                }
            }
            if(src == b20){
                if(b20.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b20.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(1)+" "+cond1.ritornaCognome(1));
                }
            }
            
            if(src == b21){
                if(b21.getBackground() == green){
                   JOptionPane.showMessageDialog(null,"L'appartamento"+" "+b21.getText()+" "+"e' occupato da"+" "+cond1.ritornanome(0)+" "+cond1.ritornaCognome(0));
                }
            }
            
            if(src == b22){
                          b1.setBackground(Color.gray);
                          b2.setBackground(Color.gray);
                          b3.setBackground(Color.gray);
                          b4.setBackground(Color.gray);
                          b5.setBackground(Color.gray);
                          b6.setBackground(Color.gray);
                          b7.setBackground(Color.gray);
                          b8.setBackground(Color.gray);
                          b9.setBackground(Color.gray);
                          b10.setBackground(Color.gray);
                          b11.setBackground(Color.gray);
                          b12.setBackground(Color.gray);
                          b13.setBackground(Color.gray);
                          b14.setBackground(Color.gray);
                          b15.setBackground(Color.gray);
                          b16.setBackground(Color.gray);
                          b17.setBackground(Color.gray);
                          b18.setBackground(Color.gray);
                          b19.setBackground(Color.gray);
                          b20.setBackground(Color.gray);
                          b21.setBackground(Color.gray);
                if(jt1.getText().trim().length() == 0){
                    JOptionPane.showMessageDialog(null,"Nessun nome inserito");
                    a = false;
                }
                } 
                if(a == true){
                    for(int i = 0; i < 21;i++){ 
                       if(cond1.RicercaAppartamento(jt1.getText(),i) == true){
                           if(i == 20){
                               b1.setBackground(Color.green);
                           }
                           if(i == 19){
                               b2.setBackground(Color.green);
                           }
                           if(i == 18){
                               b3.setBackground(Color.green);
                           }
                           if(i == 17){
                               b4.setBackground(Color.green);
                           }
                           if(i == 16){
                               b5.setBackground(Color.green);
                           }
                           if(i == 15){
                               b6.setBackground(Color.green);
                           }
                           if(i == 14){
                               b7.setBackground(Color.green);
                           }
                           if(i == 13){
                               b8.setBackground(Color.green);
                           }
                           if(i == 12){
                               b9.setBackground(Color.green);
                           }
                           if(i == 11){
                               b10.setBackground(Color.green);
                           }
                           if(i == 10){
                               b11.setBackground(Color.green);
                           }
                           if(i == 9){
                               b12.setBackground(Color.green);
                           }
                           if(i == 8){
                               b13.setBackground(Color.green);
                           }
                           if(i == 7){
                               b14.setBackground(Color.green);
                           }
                           if(i == 6){
                               b15.setBackground(Color.green);
                           }
                           if(i == 5){
                               b16.setBackground(Color.green);
                           }
                           if(i == 4){
                               b17.setBackground(Color.green);
                           }
                           if(i == 3){
                               b18.setBackground(Color.green);
                           }
                           if(i == 2){
                               b19.setBackground(Color.green);
                           }
                           if(i == 1){
                               b20.setBackground(Color.green);
                           }
                           if(i == 0){
                               b21.setBackground(Color.green);
                           }
                       
                    
                }
                
            }
        }
        }

     }
     
    }
        

 



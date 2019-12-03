/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Carmine Annunziata
 */
public class Tabella extends FinestraGrafica{
    String []dati = {"Appartamento n.","Nome","Cognome","Piano","Numero di inquilini"};
        Object[][] informazioni = {{0,cond1.ritornanome(0),cond1.ritornaCognome(0),cond1.ritornaPiano(0),cond1.ritornaNinq(0)},{1,cond1.ritornanome(1),cond1.ritornaCognome(1),cond1.ritornaPiano(1),cond1.ritornaNinq(1)},{2,cond1.ritornanome(2),cond1.ritornaCognome(2),cond1.ritornaPiano(2),cond1.ritornaNinq(2)},{3,cond1.ritornanome(3),cond1.ritornaCognome(3),cond1.ritornaPiano(3),cond1.ritornaNinq(3)},{4,cond1.ritornanome(4),cond1.ritornaCognome(4),cond1.ritornaPiano(4),cond1.ritornaNinq(4)},{5,cond1.ritornanome(5),cond1.ritornaCognome(5),cond1.ritornaPiano(5),cond1.ritornaNinq(5)},{6,cond1.ritornanome(6),cond1.ritornaCognome(6),cond1.ritornaPiano(6),cond1.ritornaNinq(6)},{7,cond1.ritornanome(7),cond1.ritornaCognome(7),cond1.ritornaPiano(7),cond1.ritornaNinq(7)},{8,cond1.ritornanome(8),cond1.ritornaCognome(8),cond1.ritornaPiano(8),cond1.ritornaNinq(8)},{9,cond1.ritornanome(9),cond1.ritornaCognome(9),cond1.ritornaPiano(9),cond1.ritornaNinq(9)},{10,cond1.ritornanome(10),cond1.ritornaCognome(10),cond1.ritornaPiano(10),cond1.ritornaNinq(10)},{11,cond1.ritornanome(11),cond1.ritornaCognome(11),cond1.ritornaPiano(11),cond1.ritornaNinq(11)},{12,cond1.ritornanome(12),cond1.ritornaCognome(12),cond1.ritornaPiano(12),cond1.ritornaNinq(12)},{13,cond1.ritornanome(13),cond1.ritornaCognome(13),cond1.ritornaPiano(13),cond1.ritornaNinq(13)},{14,cond1.ritornanome(14),cond1.ritornaCognome(14),cond1.ritornaPiano(14),cond1.ritornaNinq(14)},{15,cond1.ritornanome(15),cond1.ritornaCognome(15),cond1.ritornaPiano(15),cond1.ritornaNinq(15)},{16,cond1.ritornanome(16),cond1.ritornaCognome(16),cond1.ritornaPiano(16),cond1.ritornaNinq(16)},{17,cond1.ritornanome(17),cond1.ritornaCognome(17),cond1.ritornaPiano(17),cond1.ritornaNinq(17)},{18,cond1.ritornanome(18),cond1.ritornaCognome(18),cond1.ritornaPiano(18),cond1.ritornaNinq(18)},{19,cond1.ritornanome(19),cond1.ritornaCognome(19),cond1.ritornaPiano(19),cond1.ritornaNinq(19)},{20,cond1.ritornanome(20),cond1.ritornaCognome(20),cond1.ritornaPiano(20),cond1.ritornaNinq(20)}};
        TableModel mode1;
        JTable table;
        JScrollPane jsr;
    public Tabella(String titolo) {
        super(titolo);
        mode1 = new DefaultTableModel(informazioni,dati);
        table = new JTable(mode1);
        jsr = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        setSize(650,400);
        add(jsr,BorderLayout.CENTER);
        setLocationRelativeTo(null);
        
        
        
    }
    
}

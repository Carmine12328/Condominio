/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioneappartamenti;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author Carmine Annunziata
 */

public class FinestraGrafica extends JFrame implements Serializable,ActionListener{
    static Condominio cond1 = new Condominio();
    private JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9;
    private JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11;
    public String filename= "Condominio.pdf";
    public String file = "Condominio.html";
   
    public FinestraGrafica(String titolo){
        super(titolo);
        setBounds(100, 100, 800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        add(p);
        p.setLayout(null);
        
        jlb1 = new JLabel("1- Ricerca appartamenti liberi");
        jlb1.setBounds(10, 0, 300, 30);
        p.add(jlb1);
        jb1 = new JButton("N.1");
        jb1.setBounds(200, 5, 60, 20);
        p.add(jb1);
        
        jlb2 = new JLabel("2- Nuovo Appartamento");
        jlb2.setBounds(10, 30, 300, 30);
        p.add(jlb2);
        jb2 = new JButton("N.2");
        jb2.setBounds(200, 35, 60, 20);
        p.add(jb2); 
        
        jlb3 = new JLabel("3- Rimuovi Appartamento");
        jlb3.setBounds(10, 60, 300, 30);
        p.add(jlb3);
        jb3 = new JButton("N.3");
        jb3.setBounds(200, 65, 60, 20);
        p.add(jb3);
        
        jlb4 = new JLabel("4- Modfica Appartamento");
        jlb4.setBounds(10, 90, 300, 30);
        p.add(jlb4);
        jb4 = new JButton("N.4");
        jb4.setBounds(200, 95, 60, 20);
        p.add(jb4);

        jlb5 = new JLabel("5- Spese Condominiali");
        jlb5.setBounds(10, 120, 300, 30);
        p.add(jlb5);
        jb5 = new JButton("N.5");
        jb5.setBounds(200, 125, 60, 20);
        p.add(jb5);
        
        jlb6 = new JLabel("6- Informazioni Condominio");
        jlb6.setBounds(10, 150, 300, 30);
        p.add(jlb6);
        jb6 = new JButton("N.6");
        jb6.setBounds(200, 155, 60, 20);
        p.add(jb6);
        
        jlb7 = new JLabel("7- Ricerca per nome proprietario");
        jlb7.setBounds(10, 180, 300, 30);
        p.add(jlb7);
        jb7 = new JButton("N.7");
        jb7.setBounds(200, 185, 60, 20);
        p.add(jb7);
        
        jlb8 = new JLabel("8- Stampa condominio in file pdf");
        jlb8.setBounds(10, 210, 300, 30);
        p.add(jlb8);
        
        jb10 = new JButton("N.8");
        jb10.setBounds(200, 215, 60, 20);
        p.add(jb10);
        
        jb8 = new JButton("Salva");
        jb8.setBounds(500, 85, 100, 20);
        p.add(jb8);
        
        jb9 = new JButton("Carica");
        jb9.setBounds(500, 105, 100, 20);
        p.add(jb9);
        
        jlb9 = new JLabel("9- Stampa condominio in file html");
        jlb9.setBounds(10,240,300,30);
        p.add(jlb9);
        
        jb11 = new JButton("N.9");
        jb11.setBounds(200, 245, 60, 20);
        p.add(jb11);
        
        
        
        jb1.addActionListener(this); 
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);
        jb6.addActionListener(this);
        jb7.addActionListener(this);
        jb8.addActionListener(this);
        jb9.addActionListener(this);
        jb10.addActionListener(this);
        jb11.addActionListener(this);
        
        

    }
    @Override
        public void actionPerformed(ActionEvent ae) {
            int a;
            Object  src = ae.getSource();
            if(src == jb1){
                a = cond1.appartamentiLiberiGraph();
                if(a >= 0){
                  JOptionPane.showMessageDialog(null,"L'appartamento"+" "+a+" "+"e` libero");  
                }
                else{
                    JOptionPane.showMessageDialog(null,"Nessun appartamento libero"); 
                }
                 
            }
            if(src ==jb2){
                GraficaN2 p2 = new GraficaN2("Scelta nuovo appartamento");
                p2.setVisible(true);
            }
            
            if(src == jb3){
                RimuoviAppartamenti p = new RimuoviAppartamenti("Libera Appartamenti");
                p.setVisible(true);
            }
            
            if(src == jb4){
                ModificaDati p = new ModificaDati("Modifica dati");
                p.setVisible(true);
            }
            
            if(src == jb5){
                 cond1.speseCondominiali();
            }
            
            if(src == jb6){
               Tabella p = new Tabella("Informazioni condominio");
               p.setVisible(true);
            }
            
            if(src == jb7){
                RicercaAppartamento p = new RicercaAppartamento("Ricerca Appartamento");
                p.setVisible(true);
            }
            if(src == jb8){
                FileOutputStream out = null;
                try {
                    
                    
                   
                    out = new FileOutputStream("Salvataggio.dat");
                    ObjectOutputStream s = new ObjectOutputStream(out);
                    s.writeObject(cond1);
                    JOptionPane.showMessageDialog(null,"Salvataggio avvenuto con successo");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        out.close();
                    } catch (IOException ex) {
                        Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
           if(src == jb9){
               FileInputStream in = null;
                try {
                    in = new FileInputStream("Salvataggio.dat");
                    ObjectInputStream s = new ObjectInputStream(in);
                    cond1 = (Condominio) s.readObject();
                    JOptionPane.showMessageDialog(null,"Il salvataggio è stato ricaricato con successo");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
           if(src == jb10){
                try {
                    Document document = new Document(PageSize.A4.rotate(), 10, 10, 10, 10);
                    PdfWriter.getInstance(document, new FileOutputStream(filename));
                    document.open();
                    document.newPage();
                    document.add(new Paragraph("")); 
                    PdfPTable tabella = new PdfPTable(5);
                    tabella.addCell("Appartamento n.");
                    tabella.addCell("Nome");
                    tabella.addCell("Cognome");
                    tabella.addCell("Piano");
                    tabella.addCell("Numero di inquilini");
                    for(Integer i = 0; i < 21; i++){
                        tabella.addCell(i.toString());
                        tabella.addCell(cond1.ritornanome(i));
                        tabella.addCell(cond1.ritornaCognome(i));
                        tabella.addCell(cond1.ritornaPiano(i));
                        tabella.addCell(cond1.ritornaNinq(i));
                    }
                    tabella.setTotalWidth(30F);
                    document.add(tabella);
                    document.close();
                    if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File(filename);
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                        // no application registered for PDFs
                        JOptionPane.showMessageDialog(null,"Il file pdf e' gia aperto o utilizzato da un altro programma");
                    }
                }
                    
                } catch (FileNotFoundException | DocumentException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null,"Il file pdf e' gia aperto o utilizzato da un altro programma");
                }
                }
           if(src == jb11){
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                    bw.write("<html><head><title>Informazioni Condominio</title></head><body><p><table>\n" +
                    "	<tr><td>Appartamento n.</td><td>Nome</td><td>Cognome</td><td>Piano</td><td>Numero inquilini</td></tr>\n" +
                    "	<tr><td>0</td><td>"+cond1.ritornanome(0)+"</td><td>"+cond1.ritornaCognome(0)+"</td><td>"+cond1.ritornaPiano(0)+"</td><td>"+cond1.ritornaNinq(0)+"</td></tr>\n" +
                    "	<tr><td>1</td><td>"+cond1.ritornanome(1)+"</td><td>"+cond1.ritornaCognome(1)+"</td><td>"+cond1.ritornaPiano(1)+"</td><td>"+cond1.ritornaNinq(1)+"</td></tr>\n" +
                    "	<tr><td>2</td><td>"+cond1.ritornanome(2)+"</td><td>"+cond1.ritornaCognome(2)+"</td><td>"+cond1.ritornaPiano(2)+"</td><td>"+cond1.ritornaNinq(2)+"</td></tr>\n" +
                    "	<tr><td>3</td><td>"+cond1.ritornanome(3)+"</td><td>"+cond1.ritornaCognome(3)+"</td><td>"+cond1.ritornaPiano(3)+"</td><td>"+cond1.ritornaNinq(3)+"</td></tr>\n" +
                    "	<tr><td>4</td><td>"+cond1.ritornanome(4)+"</td><td>"+cond1.ritornaCognome(4)+"</td><td>"+cond1.ritornaPiano(4)+"</td><td>"+cond1.ritornaNinq(4)+"</td></tr>\n" +
                    "	<tr><td>5</td><td>"+cond1.ritornanome(5)+"</td><td>"+cond1.ritornaCognome(5)+"</td><td>"+cond1.ritornaPiano(5)+"</td><td>"+cond1.ritornaNinq(5)+"</td></tr>\n" +        
                    "	<tr><td>6</td><td>"+cond1.ritornanome(6)+"</td><td>"+cond1.ritornaCognome(6)+"</td><td>"+cond1.ritornaPiano(6)+"</td><td>"+cond1.ritornaNinq(6)+"</td></tr>\n" +
                    "	<tr><td>7</td><td>"+cond1.ritornanome(7)+"</td><td>"+cond1.ritornaCognome(7)+"</td><td>"+cond1.ritornaPiano(7)+"</td><td>"+cond1.ritornaNinq(7)+"</td></tr>\n" +
                    "	<tr><td>8</td><td>"+cond1.ritornanome(8)+"</td><td>"+cond1.ritornaCognome(8)+"</td><td>"+cond1.ritornaPiano(8)+"</td><td>"+cond1.ritornaNinq(8)+"</td></tr>\n" +        
                    "	<tr><td>9</td><td>"+cond1.ritornanome(9)+"</td><td>"+cond1.ritornaCognome(9)+"</td><td>"+cond1.ritornaPiano(9)+"</td><td>"+cond1.ritornaNinq(9)+"</td></tr>\n" +        
                    "	<tr><td>10</td><td>"+cond1.ritornanome(10)+"</td><td>"+cond1.ritornaCognome(10)+"</td><td>"+cond1.ritornaPiano(10)+"</td><td>"+cond1.ritornaNinq(10)+"</td></tr>\n" +        
                    "	<tr><td>11</td><td>"+cond1.ritornanome(11)+"</td><td>"+cond1.ritornaCognome(11)+"</td><td>"+cond1.ritornaPiano(11)+"</td><td>"+cond1.ritornaNinq(11)+"</td></tr>\n" +        
                    "	<tr><td>12</td><td>"+cond1.ritornanome(12)+"</td><td>"+cond1.ritornaCognome(12)+"</td><td>"+cond1.ritornaPiano(12)+"</td><td>"+cond1.ritornaNinq(12)+"</td></tr>\n" +        
                    "	<tr><td>13</td><td>"+cond1.ritornanome(13)+"</td><td>"+cond1.ritornaCognome(13)+"</td><td>"+cond1.ritornaPiano(13)+"</td><td>"+cond1.ritornaNinq(13)+"</td></tr>\n" +        
                    "	<tr><td>14</td><td>"+cond1.ritornanome(14)+"</td><td>"+cond1.ritornaCognome(14)+"</td><td>"+cond1.ritornaPiano(14)+"</td><td>"+cond1.ritornaNinq(14)+"</td></tr>\n" +        
                    "	<tr><td>15</td><td>"+cond1.ritornanome(15)+"</td><td>"+cond1.ritornaCognome(15)+"</td><td>"+cond1.ritornaPiano(15)+"</td><td>"+cond1.ritornaNinq(15)+"</td></tr>\n" +        
                    "	<tr><td>16</td><td>"+cond1.ritornanome(16)+"</td><td>"+cond1.ritornaCognome(16)+"</td><td>"+cond1.ritornaPiano(16)+"</td><td>"+cond1.ritornaNinq(16)+"</td></tr>\n" +        
                    "	<tr><td>17</td><td>"+cond1.ritornanome(17)+"</td><td>"+cond1.ritornaCognome(17)+"</td><td>"+cond1.ritornaPiano(17)+"</td><td>"+cond1.ritornaNinq(17)+"</td></tr>\n" +        
                    "	<tr><td>18</td><td>"+cond1.ritornanome(18)+"</td><td>"+cond1.ritornaCognome(18)+"</td><td>"+cond1.ritornaPiano(18)+"</td><td>"+cond1.ritornaNinq(18)+"</td></tr>\n" +        
                    "	<tr><td>19</td><td>"+cond1.ritornanome(19)+"</td><td>"+cond1.ritornaCognome(19)+"</td><td>"+cond1.ritornaPiano(19)+"</td><td>"+cond1.ritornaNinq(19)+"</td></tr>\n" +      
                    "	<tr><td>20</td><td>"+cond1.ritornanome(20)+"</td><td>"+cond1.ritornaCognome(20)+"</td><td>"+cond1.ritornaPiano(20)+"</td><td>"+cond1.ritornaNinq(20)+"</td></tr>\n" +
                    "</table></p></body></html><style>\n" +
                    "table  {\n" +
                    "	border-collapse:collapse\n" +
                    "}\n" +
                    "td, th {\n" +
                    "	border:1px solid #ddd;\n" +
                    "	padding:8px;\n" +
                    "}\n" +
                    "</style>");
                    bw.close();
                    
                    FTPClient ftp = new FTPClient();
                    ftp.connect("ftp.annunziatacarmineitts.altervista.org");
                    ftp.login("annunziatacarmineitts", "TWedaZWPHFS8");
                    ftp.setFileType(FTP.LOCAL_FILE_TYPE);
                    ftp.changeWorkingDirectory("");
                    int reply = ftp.getReplyCode();
                    if (FTPReply.isPositiveCompletion(reply)) {
                        FileInputStream in = new FileInputStream(new File(file));
                        ftp.storeFile(file, in);
                    
                    }
                    Desktop.getDesktop().browse(new URI("http://annunziatacarmineitts.altervista.org/Condominio.html"));
                    /*if (Desktop.isDesktopSupported()) {
                    try {
                        File myFile = new File(file);
                        Desktop.getDesktop().open(myFile);
                    } catch (IOException ex) {
                        // no application registered for PDFs
                    }
                }*/
                } catch (IOException | URISyntaxException ex) {
                    Logger.getLogger(FinestraGrafica.class.getName()).log(Level.SEVERE, null, ex);
                }
           }
        }
        
}

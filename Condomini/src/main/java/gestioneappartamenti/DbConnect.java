package gestioneappartamenti;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class DbConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/condominio","root","");
            st = con.createStatement();
            
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error "+ex);
            
        }
    }
    
    public void getData(){
        try {
            String query = "select * from info_condominio";
            rs = st.executeQuery(query);
            System.out.println("\nRecord from Database:");
            while(rs.next()){
                Integer numeroAppartamento = rs.getInt("numero_appartamento");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                Integer piano = rs.getInt("piano");
                Integer numeroInquilini = rs.getInt("numero_inquilini");
                System.out.println("Numero appartamento: "+numeroAppartamento+" "+"Nome: "+nome+" "+"Cognome: "+cognome+" "+"Piano: "+piano+" "+"Numero inquilini: "+numeroInquilini);
            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
        
    public void alterData(int i,String nome,int nPers,String cognome){
        try {
            String query = "update info_condominio set nome=?, cognome=?, numero_inquilini=? where numero_appartamento=?";
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, nome);
            preparedStmt.setString (2, cognome);
            preparedStmt.setInt(3, nPers);
            preparedStmt.setInt (4, i);
            
            preparedStmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



// INSERT INTO DATABASE: https://alvinalexander.com/java/java-mysql-insert-example-preparedstatement
// GET DATA FROM DATABASE: https://www.youtube.com/watch?v=BCqW5XwtJxY
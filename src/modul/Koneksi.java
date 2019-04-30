/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import view.LoginUser;
import view.TampilanPesawat;

/**
 *
 * @author N46VZ
 */
public class Koneksi {
    
    public void StartKoneksi(TampilanPesawat pesawat) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            pesawat.con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/impal","root","");
            System.out.println("Koneksi ke MySQL Server berhasil!");
        }catch(ClassNotFoundException eclass){
            System.out.println("Driver tidak ada!");
        }catch(SQLException esql){
            System.out.println(esql.getMessage());
        }
    }
    
    public void startKoneksiLoginUser(LoginUser loginUser) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            loginUser.con =(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost/impal","root","");
            System.out.println("Koneksi ke MySQL Server berhasil!");
        }catch(ClassNotFoundException eclass){
            System.out.println("Driver tidak ada!");
        }catch(SQLException esql){
            System.out.println(esql.getMessage());
        }
    }
    
}

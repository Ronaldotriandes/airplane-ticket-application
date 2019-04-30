/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import view.LoginUser;
import view.PesawatUser;
import view.RegistrasiUser;

/**
 *
 * @author N46VZ
 */
public class ControlUser {
    
    public void loginUser(LoginUser loginUser) {
        try {
            String sql = "SELECT * FROM user WHERE id = '" + loginUser.getUuserr().getText() + "' AND ps = '" + loginUser.getPuserr().getText() + "'";
            Statement st = DriverManager.getConnection("jdbc:mysql://localhost/impal","root","").createStatement();
            ResultSet rsLogin = st.executeQuery(sql);
 
            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                // new FrmMenuUtama().setVisible(true); //<-- BILA MAU DIARAHKAN KE Frame Menu Utama
                PesawatUser a=new PesawatUser();                  
                a.setVisible(true);
                loginUser.dispose();
                loginUser.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password salah!");
                loginUser.getPuserr().setText("");
                loginUser.getPuserr().requestFocus();
            }
        } catch (SQLException e) {
        }
    }
    
    public void SimpanData(RegistrasiUser registrasiUser) {
        try {
            String sql = "Insert into user set id = \"" + registrasiUser.getIdUser().getText() + "\","
                    + "ps = \"" + registrasiUser.getPsUser().getText() + "\","
                    + "nama = \"" + registrasiUser.getNamaUser().getText() + "\","
                    + "alamat = \"" + registrasiUser.getAlamatUser().getText() + "\","
                    + "nohp = \"" + registrasiUser.getNohpUser().getText() + "\","
                    + "noide = \"" + registrasiUser.getNoideUser().getText() + "\"";
            Statement stmt = registrasiUser.con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("berhasil!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}

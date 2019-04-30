/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import view.LoginAdmin;
import view.TampilanPesawat;

/**
 *
 * @author N46VZ
 */
public class ControlAdmin {
    
    public void loginAdmin(LoginAdmin admin){
        String username = admin.getUadmin().getText();
        String password = admin.getPadmin().getText();
        
        if (username.equals("admin") && password.equals("admin")){
            TampilanPesawat m = new TampilanPesawat();
            m.setVisible(true);
            admin.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
        }
    }
    
}

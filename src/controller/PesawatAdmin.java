/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Statement;
import javax.swing.JOptionPane;
import view.TampilanPesawat;

/**
 *
 * @author N46VZ
 */
public class PesawatAdmin {
    
    public void simpanData(TampilanPesawat pesawat) {
        try {
            String sql = "Insert into pesawat set kp = \"" + pesawat.getKPenerbangan().getText() + "\","
                    + "nmas = \"" + (String)pesawat.getNmaskapai().getSelectedItem() + "\","
                    + "asal = \"" + pesawat.getAsal().getText() + "\","
                    + "tujuan = \"" + pesawat.getTujuan().getText() + "\","
                    + "tanggal = \"" + pesawat.getTanggal().getText() + "\","
                    + "bulan = \"" + (String)pesawat.getBulan().getSelectedItem() + "\","
                    + "Tahun = \"" + pesawat.getTahun().getText() + "\","
                    + "harga = \"" + pesawat.getHarga().getText() + "\"";
            Statement stmt = pesawat.con.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Yeaaah data pesawat ditambahkan!");
            System.out.println("berhasil!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.PesawatUser;

/**
 *
 * @author N46VZ
 */
public class PesawatUserC {
    
    public void simpanData(PesawatUser pu) {
        try {
            String sql = "Insert into pesanan set kp = \"" + pu.kodee+"\","
                    + "nmas = \"" + pu.nmass+ "\"," 
                    + "asal = \"" + pu.asall+ "\","
                    + "tujuan = \"" + pu.tujuann + "\","
                    + "tanggal = \"" + pu.tanggall + "\","
                    + "bulan = \"" + pu.bulann + "\","
                    + "Tahun = \"" +pu.tahunn + "\","
                    + "harga = \"" + pu.hargaa+ "\"";
            Statement stmt = pu.con.createStatement();
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Terima kasih telah memesan, selanjutnya silahkan bayar!");
            System.out.println("berhasil!");
            JOptionPane.showMessageDialog(null,"Silahkan bayar ke rek A/n MUNIR 21312412412!");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void tampilDataKeTabel(PesawatUser pu) {
        ResultSet rs = null;
        try{
            Statement stmt = pu.con.createStatement();
            rs = stmt.executeQuery("select * from pesawat");
            
            ResultSetMetaData meta = rs.getMetaData();
            int col = meta.getColumnCount();
            int baris = 0;
            while (rs.next()){
                baris = rs.getRow();
            }
            pu.dataTable = new String[baris][col];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()){
                pu.dataTable[x][0] = rs.getString("Kp");
                pu.dataTable[x][1] = rs.getString("nmas");
                pu.dataTable[x][2] = rs.getString("asal");
                pu.dataTable[x][3] = rs.getString("tujuan");
                pu.dataTable[x][4] = rs.getString("tanggal");
                pu.dataTable[x][5] = rs.getString("bulan");
                pu.dataTable[x][6] = rs.getString("tahun");
                pu.dataTable[x][7] = rs.getString("harga");
                int hargaaa = Integer.parseInt(pu.dataTable[x][7]);
                 int tanggall= Integer.parseInt(pu.dataTable[x][4]);
                int tahunn = Integer.parseInt(pu.dataTable[x][6]);
                x++;
            }
            pu.getTabel().setModel(new DefaultTableModel(pu.dataTable,pu.header));
        }catch(Exception e){
            System.err.println("ada yang salah:"+e);
        }
    }
    
    public void tampilDataKeTabelPencarian(PesawatUser pu) {
        ResultSet rs = null;
        try{
            Statement stmt = pu.con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM pesawat WHERE asal = '" 
                    + pu.getAlamatasal().getText() + "' AND tujuan = '" 
                    + pu.getAlamattujuan().getText() + "' AND tanggal = '" 
                    + pu.getTanggaluser().getText() + "' AND bulan = '" 
                    + (String)pu.getBulanuser().getSelectedItem() 
                    + "' AND tahun = '" 
                    + pu.getTahunuser().getText() + "'");  
         
            ResultSetMetaData meta = rs.getMetaData();
            int col = meta.getColumnCount();
            int c = col;
            int baris = 0;
            while (rs.next()){
                baris = rs.getRow();
            }
            
            pu.dataTable = new String[baris][col];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()){
                pu.dataTable[x][0] = rs.getString("Kp");
                pu.dataTable[x][1] = rs.getString("nmas");
                pu.dataTable[x][2] = rs.getString("asal");
                pu.dataTable[x][3] = rs.getString("tujuan");
                pu.dataTable[x][4] = rs.getString("tanggal");
                pu.dataTable[x][5] = rs.getString("bulan");
                pu.dataTable[x][6] = rs.getString("tahun");
                pu.dataTable[x][7] = rs.getString("harga");
                int hargaaa = Integer.parseInt(pu.dataTable[x][7]);
                int tanggalll= Integer.parseInt(pu.dataTable[x][4]);
                int tahunnn = Integer.parseInt(pu.dataTable[x][6]);
                x++;
            }
            pu.getTabel().setModel(new DefaultTableModel(pu.dataTable,pu.header));
            if(pu.getTabel() == null){
                JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
          }
        }catch(Exception e){
            System.err.println("ada yang salah:"+e);
        }
    }
    
}

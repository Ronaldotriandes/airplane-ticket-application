/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modul.Koneksi;
import controller.PesawatAdmin;

/**
 *
 * @author Ajo Samuik
 */
public class TampilanPesawat extends javax.swing.JFrame {

    /**
     * Creates new form TampilanPesawat
     */
 public Connection con;
    public TampilanPesawat() {
        initComponents();
        koneksiDatabase();
        simpanData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        checkbox1 = new java.awt.Checkbox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        KPenerbangan = new javax.swing.JTextField();
        Nmaskapai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Asal = new javax.swing.JTextField();
        Tujuan = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        tambahpesawat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Bulan = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Tahun = new javax.swing.JTextField();
        keluaradmin = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tiket Pesawat");

        jLabel2.setText("Kode Penerbangan");

        KPenerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KPenerbanganActionPerformed(evt);
            }
        });

        Nmaskapai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Maskapai--", "Lion Air", "Garuda Air", "Citilink", "Sriwijaya Air" }));
        Nmaskapai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NmaskapaiActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Maskapai");

        jLabel4.setText("Asal");

        jLabel5.setText("Tujuan");

        jLabel6.setText("Harga");

        tambahpesawat.setText("Tambah");
        tambahpesawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahpesawatActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setText("Tanggal");

        Tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalActionPerformed(evt);
            }
        });

        jLabel8.setText("Bulan");

        Bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Bulan--", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember", " " }));
        Bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulanActionPerformed(evt);
            }
        });

        jLabel9.setText("Tahun");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        keluaradmin.setText("Logout");
        keluaradmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluaradminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tambahpesawat)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Asal, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(Tujuan)
                                    .addComponent(Harga)
                                    .addComponent(Nmaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(KPenerbangan)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(keluaradmin)
                        .addGap(257, 257, 257)))
                .addGap(64, 65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(KPenerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nmaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Asal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Tujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(tambahpesawat)
                .addGap(29, 29, 29)
                .addComponent(keluaradmin)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(427, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KPenerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KPenerbanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KPenerbanganActionPerformed

    private void NmaskapaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NmaskapaiActionPerformed
        // TODO add your handling code here:
        if(Nmaskapai.getSelectedItem().equals("Lion Air")){
            Harga.setText("");
        }else if(Nmaskapai.getSelectedItem().equals("Garuda Air")){
            Harga.setText("");
        }else if(Nmaskapai.getSelectedItem().equals("Express Air")){
            Harga.setText("");
        }else if(Nmaskapai.getSelectedItem().equals("Citilink")){
            Harga.setText("");
        }else if(Nmaskapai.getSelectedItem().equals("Sriwijaya Air")){
            Harga.setText("");
        }  
    }//GEN-LAST:event_NmaskapaiActionPerformed

    private void tambahpesawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahpesawatActionPerformed
        // TODO add your handling code here:
        simpanData();
    }//GEN-LAST:event_tambahpesawatActionPerformed

    private void BulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulanActionPerformed
        // TODO add your handling code here:
         if(Bulan.getSelectedItem().equals("Januari")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Februari")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Maret")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("April")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Mei")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Juni")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Juli")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Agustus")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("September")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Oktober")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("November")){
            Harga.setText("");
        }else if(Bulan.getSelectedItem().equals("Desember")){
            Harga.setText("");
        }                  
    }//GEN-LAST:event_BulanActionPerformed

    private void TanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanggalActionPerformed

    private void keluaradminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluaradminActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluaradminActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void koneksiDatabase(){
        Koneksi k = new Koneksi();
        k.StartKoneksi(this);
    }
    public void simpanData(){
        PesawatAdmin admin = new PesawatAdmin();
        admin.simpanData(this);
    }

    public JTextField getAsal() {
        return Asal;
    }

    public JComboBox<String> getBulan() {
        return Bulan;
    }

    public JTextField getHarga() {
        return Harga;
    }

    public JTextField getKPenerbangan() {
        return KPenerbangan;
    }

    public JComboBox<String> getNmaskapai() {
        return Nmaskapai;
    }

    public JTextField getTahun() {
        return Tahun;
    }

    public JTextField getTanggal() {
        return Tanggal;
    }

    public JTextField getTujuan() {
        return Tujuan;
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TampilanPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilanPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilanPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilanPesawat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilanPesawat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Asal;
    private javax.swing.JComboBox<String> Bulan;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField KPenerbangan;
    private javax.swing.JComboBox<String> Nmaskapai;
    private javax.swing.JTextField Tahun;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JTextField Tujuan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton keluaradmin;
    private javax.swing.JButton tambahpesawat;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

/**
 *
 * @author Ajo Samuik
 */
public class Pesawat {
    private String kp,nmas,asal,tujuan,bulan,tahun;
    private int harga,tanggal;

    public Pesawat(String kp, String nmas, String asal, String tujuan, String bulan, String tahun, int harga, int tanggal) {
        this.kp = kp;
        this.nmas = nmas;
        this.asal = asal;
        this.tujuan = tujuan;
        this.bulan = bulan;
        this.tahun = tahun;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    Pesawat(String a01, String a, String a1, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getKp() {
        return kp;
    }

    public void setKp(String kp) {
        this.kp = kp;
    }

    public String getNmas() {
        return nmas;
    }

    public void setNmas(String nmas) {
        this.nmas = nmas;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }
    
}

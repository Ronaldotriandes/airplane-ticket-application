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
public class User {
    private String nama,id,ps,alamat,nohp,noide;

    public User(String nama, String id, String ps, String alamat, String nohp, String noide) {
        this.nama = nama;
        this.id = id;
        this.ps = ps;
        this.alamat = alamat;
        this.nohp = nohp;
        this.noide = noide;
    }

    User(String irul, String budi, String adi, String siman) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getNoide() {
        return noide;
    }

    public void setNoide(String noide) {
        this.noide = noide;
    }
    
}

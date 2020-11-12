/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Dean
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTransport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTransport() {
        return uangTransport;
    }

    public void setUangTransport(int uangTransport) {
        this.uangTransport = uangTransport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        return getUangTunjangan() + getUangTransport() + getGajiPokok();
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("Nama Karyawan\t: " + getNama());
        System.out.println("Alamat\t\t: " + getAlamat());
        System.out.println("Uang Transport\t: Rp. " + getUangTransport());
        System.out.println("Uang Tunjangan\t: Rp. " + getUangTunjangan());
        System.out.println("Gaji Pokok\t: Rp. " + getGajiPokok());
        System.out.println("TOTAL GAJI\t: Rp. " + getTotalGaji());
        
    }
}

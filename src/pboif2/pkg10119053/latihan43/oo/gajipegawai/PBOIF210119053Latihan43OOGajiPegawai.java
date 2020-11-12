/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan43.oo.gajipegawai;

import data.GajiPegawai;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program gaji pegawai
 */
public class PBOIF210119053Latihan43OOGajiPegawai {

    public static void main(String[] args) {
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Dean Ghifari Faturrahman");
        pegawai.setAlamat("Jalan Semar dlm 4 NO 72/66");
        pegawai.setUangTransport(250000);
        pegawai.setUangTunjangan(300000);
        pegawai.setGajiPokok(4500000);
        pegawai.setTotalGaji(pegawai.totalGaji(0, 0, 0));        
        pegawai.tampilData(null, null, 0, 0, 0, 0);
    }
    
}

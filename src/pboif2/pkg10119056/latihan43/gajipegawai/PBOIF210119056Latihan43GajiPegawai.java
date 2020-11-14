/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan43.gajipegawai;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Gaji Pegawai
 */

 

public class PBOIF210119056Latihan43GajiPegawai {
    public static void main(String[] args) {
        GajiPegawai gajiPegawai=new GajiPegawai();
        gajiPegawai.setNama("Rizki Adam Kurniawan");
        gajiPegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajiPegawai.setUangTransport(250000);
        gajiPegawai.setUangTunjgangan(300000);
        gajiPegawai.setGajiPokok(4500000);
        
        gajiPegawai.tampilData(gajiPegawai.getNama(),
                               gajiPegawai.getAlamat(),
                               gajiPegawai.getUangTunjangan(), 
                               gajiPegawai.getUangTransport(), 
                               gajiPegawai.getGajiPokok(),
                               gajiPegawai.totalGaji(gajiPegawai.getUangTunjangan(),
                                                     gajiPegawai.getUangTransport(),
                                                     gajiPegawai.getGajiPokok()));
    }
    
}
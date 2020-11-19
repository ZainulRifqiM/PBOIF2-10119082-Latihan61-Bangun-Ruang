/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan61.bangun.ruang;

/**
 *
 * @author Zainul Rifqi
 */
public class PBOIF210119082Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     * NAMA     : Zainul Rifqi Muwaffaq
     * KELAS    : IF2
     * NIM      : 10119082
     * Deskripsi: Bangun Ruang
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        b.tampilHasil();
        Tabung t = new Tabung(10,21);
        t.tampilHasil();
        Kerucut k = new Kerucut(14,9);
        k.tampilHasil();
    }
    
}

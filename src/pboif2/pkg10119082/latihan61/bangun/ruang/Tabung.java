/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan61.bangun.ruang;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Bangun Ruang
 */
public class Tabung extends BangunRuang{
    private int tinggi;

    public Tabung(int r,int tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    public double hitungAlas() {
        return 3.14 * (getR() * getR());
    }

    @Override
    public double hitungVolume() {
        return hitungAlas() * getTinggi();
    }

    @Override
    public void tampilHasil() {
        System.out.println("Volume Tabung : " + hitungVolume() + " cm3");
    }
    
}

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
public class Kerucut extends BangunRuang{
    private int tinggi;

    public Kerucut(int r,int tinggi) {
        super(r);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return (3.14 * (getR() * getR()) * getTinggi()) / 3;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Volume Kerucut : " + hitungVolume() + " cm3");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class Persegi extends Bangun2d implements Runnable {

    public double sisi;
    public double luas;
    public double keliling;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    @Override
    public double hitungLuas() {
        luas = this.sisi * this.sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisi * 4;
        return keliling;
    }

    public String getNama() {
        return "Persegi";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
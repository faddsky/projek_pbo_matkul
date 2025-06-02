/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class Segitiga extends Bangun2d implements Runnable {
    public double sisiSatu;
    public double sisiDua;
    public double sisiAlas;
    public double tinggi;
    public double luas;
    public double keliling;
    
    public Segitiga(double sisiSatu, double sisiDua, double sisiAlas, double tinggi) {
        this.sisiSatu = sisiSatu;
        this.sisiDua = sisiDua;
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    
    @Override
    public double hitungLuas() {
        luas = this.sisiAlas * this.tinggi / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisiSatu + this.sisiDua + this.sisiAlas;
        return keliling;
    }

    public String getNama() {
        return "Segitiga";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
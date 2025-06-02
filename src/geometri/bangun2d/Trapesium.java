/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class Trapesium extends Bangun2d implements Runnable {
    public double sisiAtas;
    public double sisiAlas;
    public double sisiMiringSatu;
    public double sisiMiringDua;
    public double tinggi;
    public double luas;
    public double keliling;
    
    public Trapesium(double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.sisiAtas = sisiAtas;
        this.sisiMiringSatu = sisiMiringSatu;
        this.sisiMiringDua = sisiMiringDua;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    
    @Override
    public double hitungLuas() {
        luas = (this.sisiAlas + this.sisiAtas) * this.tinggi / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisiAlas + this.sisiMiringDua + this.sisiMiringSatu + this.sisiAtas;
        return keliling;
    }

    public String getNama() {
        return "Trapesium";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
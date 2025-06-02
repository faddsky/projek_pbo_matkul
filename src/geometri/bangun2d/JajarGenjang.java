/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class JajarGenjang extends Bangun2d implements Runnable {
    public double sisiDatar;
    public double sisiMiring;
    public double tinggi;
    public double luas;
    public double keliling;
    
    public JajarGenjang(double sisiDatar, double sisiMiring, double tinggi) {
        this.sisiDatar = sisiDatar;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    
    @Override
    public double hitungLuas() {
        luas = this.sisiDatar * this.tinggi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisiDatar * 2 + this.sisiMiring * 2;
        return keliling;
    }

    public String getNama() {
        return "JajarGenjang";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class PersegiPanjang extends Bangun2d implements Runnable {
    public double sisiPendek;
    public double sisiPanjang;
    public double luas;
    public double keliling;
    
    public PersegiPanjang(double sisiPendek, double sisiPanjang) {
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    
    @Override
    public double hitungLuas() {
        luas = this.sisiPendek * this.sisiPanjang;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisiPendek * 2 + this.sisiPanjang * 2;
        return keliling;
    }

    public String getNama() {
        return "Persegi Panjang";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
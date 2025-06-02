/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class Lingkaran extends Bangun2d implements Runnable{
    public static final double PI = 3.14;
    public double jariJari;
    public double luas;
    public double keliling;
    
    public Lingkaran(double jariJari) {
        jariJari = jariJari;
        
    }

    @Override
    public double hitungLuas() {
        luas = Lingkaran.PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = Lingkaran.PI * jariJari * 2;
        return keliling;
    }
    
    public double hitungLuas(double jariJaribaru) {
        luas = Lingkaran.PI * jariJaribaru * jariJari;
        return luas;
    }

    public double hitungKeliling(double jariJaribaru) {
        keliling = Lingkaran.PI * jariJaribaru * 2;
        return keliling;
    }

    public String getNama() {
        return "Lingkaran";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
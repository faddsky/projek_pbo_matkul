/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class JuringLingkaran extends Lingkaran implements Runnable {
    public double sudut; 
    public double luas;
    public double keliling;
    public double panjangBusur;
    
    public JuringLingkaran(double sudut, double jariJari) {
        super(jariJari);
        this.sudut = sudut;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
        this.panjangBusur = hitungPanjangBusur();
    }

    @Override
    public double hitungLuas() {
        luas = Math.PI * this.jariJari * this.jariJari * (this.sudut / 360.0);
        return luas;
    }

    // Hitung panjang busur juring
    public double hitungPanjangBusur() {
        panjangBusur = 2 * Math.PI * this.jariJari * (this.sudut / 360.0);
        return panjangBusur;
    }

    @Override
    public double hitungKeliling() {
        keliling = hitungPanjangBusur() + 2 * this.jariJari;
        return keliling;
    }
    
    @Override
    public String getNama() {
        return "Juring Lingkaran";
    }
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
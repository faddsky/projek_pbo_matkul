/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class TemberengLingkaran extends Lingkaran implements Runnable  {
    public double sudutTheta;
    public double luas;
    public double keliling;
    
    public TemberengLingkaran(double jariJari, double sudutTheta) {
        super(jariJari);
        this.sudutTheta = sudutTheta;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }
    
    @Override
    public double hitungLuas() {
        double thetaRadian = Math.toRadians(this.sudutTheta);

        double luasJuring = (this.sudutTheta / 360.0) * Lingkaran.PI * this.jariJari * this.jariJari;

        double luasSegitiga = 0.5 * this.jariJari * this.jariJari * Math.sin(thetaRadian);

        // Luas tembereng = luas juring - luas segitiga
        luas = luasJuring - luasSegitiga;
        return luas;
    }
    
    @Override
    public double hitungKeliling() {
        double halfThetaRadian = Math.toRadians(this.sudutTheta / 2);

        double panjangBusur = (this.sudutTheta / 360.0) * 2 * Lingkaran.PI * this.jariJari;

        double taliBusur = 2 * this.jariJari * Math.sin(halfThetaRadian);

        keliling = panjangBusur + taliBusur;
        return keliling;
    }
    
    @Override
    public String getNama() {
        return "Tembereng Lingkaran";
    }
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
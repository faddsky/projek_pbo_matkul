/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class BelahKetupat extends Bangun2d implements Runnable {
    public double sisi;
    public double diagonalSatu;
    public double diagonalDua;
    public double luas;
    public double keliling;
    
    public BelahKetupat(double sisi, double diagonalSatu, double diagonalDua) {
        this.sisi = sisi;
        this.diagonalDua = diagonalDua;
        this.diagonalSatu = diagonalSatu;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = this.diagonalSatu * this.diagonalDua / 2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = this.sisi * 4;
        return keliling;
    }

    public String getNama() {
        return "Belah Ketupat";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
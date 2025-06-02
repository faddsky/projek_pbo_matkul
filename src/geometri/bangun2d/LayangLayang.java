/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun2d;

/**
 *
 * @author Rendi wahyu
 */
public class LayangLayang extends Bangun2d implements Runnable {
    public double diagonalSatu;
    public double diagonalDua;
    public double sisiPendek;
    public double sisiPanjang;
    public double luas;
    public double keliling;
    
    public LayangLayang(double diagonalSatu, double diagonalDua, double sisiPendek, double sisiPanjang) {
        this.diagonalSatu = diagonalSatu;
        this.diagonalDua = diagonalDua;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
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
        keliling = this.sisiPendek * 2 + this.sisiPanjang * 2;
        return keliling;
    }

    public String getNama() {
        return "Layang-layang";
    }
    
@Override
    public void run() {
        System.out.println("Bangun: " + getNama());
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling/Volume: " + hitungKeliling());
    }
}
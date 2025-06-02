/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

/**
 *
 * @author Rendi wahyu
 */
public class CincinBola extends Bola {
    public double h1;   // jarak bidang potong bawah dari pusat bola
    public double h2;   // jarak bidang potong atas dari pusat bola
    public double volume;
    public double luasPermukaan;

    public CincinBola(double h1, double h2, double jariJari) {
        super(jariJari);
        this.h1 = h1;
        this.h2 = h2;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }
    
    public double hitungLuasPermukaan() {
        double h = hitungTinggi();
        luasPermukaan = 2 * Math.PI * this.jariJari * h;
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double a = hitungJariJariAlasBawah();
        double b = hitungJariJariAlasAtas();
        double h = hitungTinggi();
        volume = (Math.PI * h * h / 6) * (3 * a + 3 * b + h);
        return volume;
    }
    
    @Override
    public String getNama() {
        return "Cincin Bola";
    }

    public double hitungJariJariAlasBawah() {
        return Math.sqrt(this.jariJari * this.jariJari - h1 * h1);
    }

    public double hitungJariJariAlasAtas() {
        return Math.sqrt(this.jariJari * this.jariJari - h2 * h2);
    }

    public double hitungTinggi() {
        return Math.abs(h1 - h2);
    }
}

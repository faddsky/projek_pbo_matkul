/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.Lingkaran;

/**
 *
 * @author Rendi wahyu
 */
public class KerucutTerpancung extends Lingkaran {
    public double jariJariKecil;
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public double sisiMiring;

    public KerucutTerpancung(double tinggi, double jariJariKecil, double jariJariBesar) {
        super(jariJariBesar);
        this.jariJariKecil = jariJariKecil;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
        this.sisiMiring = hitungSisiMiring();
    }
    
    public double hitungVolume() {
        volume = (1.0 / 3) * Lingkaran.PI * tinggi * (this.jariJari * this.jariJari + this.jariJari * this.jariJariKecil + this.jariJariKecil * this.jariJariKecil);
        return volume;
    }
    
    public double hitungSisiMiring() {
        sisiMiring = Math.sqrt(Math.pow(this.jariJari - this.jariJariKecil, 2) + Math.pow(tinggi, 2));
        return sisiMiring;
    }
    
    public double hitungLuasPermukaan() {
        double s = hitungSisiMiring();
        double luasSelimut = Math.PI * (this.jariJari + this.jariJariKecil) * s;
        double luasAlasBesar = Math.PI * this.jariJari * this.jariJari;
        double luasAlasKecil = Math.PI * this.jariJariKecil * this.jariJariKecil;
        luasPermukaan = luasSelimut + luasAlasBesar + luasAlasKecil;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        return "Kerucut Terpancung";
    }
}

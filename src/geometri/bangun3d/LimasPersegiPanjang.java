/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.PersegiPanjang;

/**
 *
 * @author Rendi wahyu
 */
public class LimasPersegiPanjang extends PersegiPanjang {
    public double tinggiLimas;
    public double tinggiSegitigaSisiPendek;
    public double tinggiSegitigaSisiPanjang;
    public double volume;
    public double luasPermukaan;

    public LimasPersegiPanjang(double tinggiLimas, double sisiPendek, double sisiPanjang,
                               double tinggiSegitigaSisiPendek, double tinggiSegitigaSisiPanjang) {
        super(sisiPendek, sisiPanjang);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiPendek = tinggiSegitigaSisiPendek;
        this.tinggiSegitigaSisiPanjang = tinggiSegitigaSisiPanjang;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisiPendek = 2 * (0.5 * sisiPendek * tinggiSegitigaSisiPendek);
        double luasSisiPanjang = 2 * (0.5 * sisiPanjang * tinggiSegitigaSisiPanjang);
        luasPermukaan = luasAlas + luasSisiPendek + luasSisiPanjang;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Persegi Panjang";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.Persegi;

/**
 *
 * @author Rendi wahyu
 */
public class LimasPersegi extends Persegi {
    public double tinggiLimas;
    public double tinggiSegitiga;
    public double volume;
    public double luasPermukaan;

    public LimasPersegi(double tinggiLimas, double sisi, double tinggiSegitiga) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitiga = tinggiSegitiga;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisi = 4 * (0.5 * sisi * tinggiSegitiga);
        luasPermukaan = luasAlas + luasSisi;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Persegi";
    }
}

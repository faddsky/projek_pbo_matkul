/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.Segitiga;

/**
 *
 * @author Rendi wahyu
 */
public class LimasSegitiga extends Segitiga {
    public double tinggiLimas;
    public double tinggiSegitigaSisiSatu;
    public double tinggiSegitigaSisiDua;
    public double tinggiSegitigaSisiAlas;
    public double volume;
    public double luasPermukaan;

    public LimasSegitiga(double tinggiLimas, double sisiSatu, double sisiDua, double sisiAlas, double tinggi,
                         double tinggiSegitigaSisiSatu, double tinggiSegitigaSisiDua, double tinggiSegitigaSisiAlas) {
        super(sisiSatu, sisiDua, sisiAlas, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiSatu = tinggiSegitigaSisiSatu;
        this.tinggiSegitigaSisiDua = tinggiSegitigaSisiDua;
        this.tinggiSegitigaSisiAlas = tinggiSegitigaSisiAlas;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisiSatu = 0.5 * sisiSatu * tinggiSegitigaSisiSatu;
        double luasSisiDua = 0.5 * sisiDua * tinggiSegitigaSisiDua;
        double luasSisiAlas = 0.5 * sisiAlas * tinggiSegitigaSisiAlas;
        luasPermukaan = luasAlas + luasSisiSatu + luasSisiDua + luasSisiAlas;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Segitiga";
    }
}

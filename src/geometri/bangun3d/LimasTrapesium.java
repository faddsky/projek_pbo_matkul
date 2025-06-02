/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.Trapesium;

/**
 *
 * @author Rendi wahyu
 */
public class LimasTrapesium extends Trapesium {
    public double tinggiLimas;
    public double tinggiSegitigaSisiAtas;
    public double tinggiSegitigaSisiAlas;
    public double tinggiSegitigaSisiMiringSatu;
    public double tinggiSegitigaSisiMiringDua;
    public double volume;
    public double luasPermukaan;

    public LimasTrapesium(double tinggiLimas, double sisiAtas, double sisiAlas,
                          double sisiMiringSatu, double sisiMiringDua, double tinggi,
                          double tinggiSegitigaSisiAtas, double tinggiSegitigaSisiAlas,
                          double tinggiSegitigaSisiMiringSatu, double tinggiSegitigaSisiMiringDua) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiAtas = tinggiSegitigaSisiAtas;
        this.tinggiSegitigaSisiAlas = tinggiSegitigaSisiAlas;
        this.tinggiSegitigaSisiMiringSatu = tinggiSegitigaSisiMiringSatu;
        this.tinggiSegitigaSisiMiringDua = tinggiSegitigaSisiMiringDua;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisiAtas = 0.5 * sisiAtas * tinggiSegitigaSisiAtas;
        double luasSisiAlas = 0.5 * sisiAlas * tinggiSegitigaSisiAlas;
        double luasSisiMiringSatu = 0.5 * sisiMiringSatu * tinggiSegitigaSisiMiringSatu;
        double luasSisiMiringDua = 0.5 * sisiMiringDua * tinggiSegitigaSisiMiringDua;
        luasPermukaan = luasAlas + luasSisiAtas + luasSisiAlas + luasSisiMiringSatu + luasSisiMiringDua;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Trapesium";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.JajarGenjang;

/**
 *
 * @author Rendi wahyu
 */
public class LimasJajarGenjang extends JajarGenjang {
    public double tinggiLimas;
    public double tinggiSegitigaSisiDatar;
    public double tinggiSegitigaSisiMiring;
    public double volume;
    public double luasPermukaan;

    public LimasJajarGenjang(double tinggiLimas, double sisiDatar, double sisiMiring, double tinggi,
                             double tinggiSegitigaSisiDatar, double tinggiSegitigaSisiMiring) {
        super(sisiDatar, sisiMiring, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisiDatar = tinggiSegitigaSisiDatar;
        this.tinggiSegitigaSisiMiring = tinggiSegitigaSisiMiring;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisiDatar = 2 * (0.5 * sisiDatar * tinggiSegitigaSisiDatar);
        double luasSisiMiring = 2 * (0.5 * sisiMiring * tinggiSegitigaSisiMiring);
        luasPermukaan = luasAlas + luasSisiDatar + luasSisiMiring;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Jajar Genjang";
    }
}

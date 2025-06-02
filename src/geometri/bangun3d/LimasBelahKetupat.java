/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

import geometri.bangun2d.BelahKetupat;

/**
 *
 * @author Rendi wahyu
 */
public class LimasBelahKetupat extends BelahKetupat {
    public double tinggiLimas;
    public double tinggiSegitigaSisi;
    public double volume;
    public double luasPermukaan;

    public LimasBelahKetupat(double tinggiLimas, double sisi, double diagonalSatu, double diagonalDua, double tinggiSegitigaSisi) {
        super(sisi, diagonalSatu, diagonalDua);
        this.tinggiLimas = tinggiLimas;
        this.tinggiSegitigaSisi = tinggiSegitigaSisi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * this.tinggiLimas / 3;
        return volume;
    }


    public double hitungLuasPermukaan() {
        double luasAlas = super.hitungLuas();
        double luasSisiSamping = 4 * (0.5 * this.sisi * this.tinggiSegitigaSisi);
        luasPermukaan = luasAlas + luasSisiSamping;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Limas Belah Ketupat";
    }
}

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
public class PrismaPersegiPanjang extends PersegiPanjang {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaPersegiPanjang(double tinggiPrisma, double sisiPendek, double sisiPanjang) {
        super(sisiPendek, sisiPanjang);
        this.tinggiPrisma = tinggiPrisma;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.hitungLuas() * this.tinggiPrisma;
        return volume;
    }


    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.hitungLuas() + super.hitungKeliling() * this.tinggiPrisma;
        return luasPermukaan;
    }

    @Override
    public String getNama() {
        return "Prisma Persegi Panjang";
    }
}

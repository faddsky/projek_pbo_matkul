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
public class PrismaTrapesium extends Trapesium {
    public double tinggiPrisma;
    public double volume;
    public double luasPermukaan;

    public PrismaTrapesium(double tinggiPrisma, double sisiAtas, double sisiAlas, double sisiMiringSatu, double sisiMiringDua, double tinggi) {
        super(sisiAtas, sisiAlas, sisiMiringSatu, sisiMiringDua, tinggi);
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
        return "Prisma Trapesium";
    }
}

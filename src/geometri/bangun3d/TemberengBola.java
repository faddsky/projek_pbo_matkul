/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometri.bangun3d;

/**
 *
 * @author Rendi wahyu
 */
public class TemberengBola extends Bola {
    public double tinggi;
    public double volume;
    public double luasPermukaan;
    public double luasPermukaanMelengkung;
    public double luasBidangPotong;
    
    public TemberengBola(double tinggi, double jariJari) {
        super(jariJari);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
        this.luasPermukaanMelengkung = hitungLuasPermukaanMelengkung();
        this.luasBidangPotong = hitungLuasBidangPotong();
    }
    
    public double hitungLuasPermukaanMelengkung() {
        luasPermukaanMelengkung = 2 * Math.PI * this.jariJari * this.tinggi;
        return luasPermukaanMelengkung;
    }

    public double hitungLuasBidangPotong() {
        double a = Math.sqrt(2 * this.jariJari * this.tinggi - this.tinggi * this.tinggi);
        luasBidangPotong = Math.PI * a * a;
        return luasBidangPotong;
    }
    
    @Override
    public double hitungVolume() {
        volume = (Math.PI * this.tinggi * this.tinggi / 3) * (3 * this.jariJari - this.tinggi);
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = hitungLuasPermukaanMelengkung() + hitungLuasBidangPotong();
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        return "Tembereng Bola";
    }
}

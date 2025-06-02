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
public class Bola extends Lingkaran {
    public double volume;
    public double luasPermukaan;
    public Bola(double jariJari) {
        super(jariJari);
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }
    
    public double hitungVolume() {
        volume = Math.pow(this.jariJari, 3) * Lingkaran.PI * 4 / 3;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan = Math.pow(this.jariJari, 2) * Lingkaran.PI * 4;
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        return "Bola";
    }
}

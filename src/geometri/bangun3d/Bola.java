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
        volume =  4 / 3 * jariJari * super.luas;
        return volume;
    }
    
    public double hitungLuasPermukaan() {
        luasPermukaan =  4 * super.luas;
        return luasPermukaan;
    }
    
    public double hitungVolume(double jariJaribaru) {
        volume =  4 / 3 * PI *jariJaribaru * super.luas;
        return volume;
    }
    
    @Override
    public String getNama() {
        return "Bola";
    }
}

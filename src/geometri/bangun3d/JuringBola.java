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
public class JuringBola extends Bola {
    public double alpha;
    public double volume;
    public double luasPermukaan;
    
    public JuringBola(double alphaDerajat, double jariJari) {
        super(jariJari);
        
        this.alpha = Math.toRadians(alphaDerajat);
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }
    
    @Override
     public double hitungVolume() {
        volume = (2 * Math.PI * Math.pow(this.jariJari, 3) / 3) * (1 - Math.cos(alpha));
        return volume;
    }
     
    public double hitungLuasPermukaan() {
        luasPermukaan = hitungLuasPermukaanMelengkung() + hitungLuasBidangSegitigaKerucut();
        return luasPermukaan;
    }
    
    @Override
    public String getNama() {
        return "Juring Bola";
    }

    public double hitungLuasPermukaanMelengkung() {
        return 2 * Lingkaran.PI * this.jariJari * this.jariJari * (1 - Math.cos(alpha));
    }

    public double hitungLuasBidangSegitigaKerucut() {
        return 2 * this.jariJari * this.jariJari * alpha;
    }
}

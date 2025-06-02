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
public class Kerucut extends Lingkaran{
    public double tinggiKerucut;
    public double volume;
    
    public Kerucut(double tinggiKerucut, double jariJari) {
        super(jariJari);
        this.tinggiKerucut = tinggiKerucut;
        this.volume = hitungVolume();
    }
    
    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiKerucut;
        return volume;
    }
    
    @Override
    public String getNama() {
        return "Kerucut";
    }
    
}

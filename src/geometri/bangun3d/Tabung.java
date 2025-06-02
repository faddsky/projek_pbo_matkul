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
public class Tabung extends Lingkaran{
    public double tinggiTabung;
    public double volume;
    
    public Tabung(double tinggiTabung, double jariJari) {
        super(jariJari);
        this.tinggiTabung = tinggiTabung;
        this.volume = hitungVolume();
    }
    
    public double hitungVolume() {
        volume = this.hitungLuas() * this.tinggiTabung;
        return volume;
    }
    
    @Override
    public String getNama() {
        return "Tabung";
    }
    
}

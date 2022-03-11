/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo2;

/**
 *
 * @author asus
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;
    
    public Tabung(double jariJari, double tinggi){
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return super.luas()*tinggi;
    }

    @Override
    public double lp(){
        return 2*3.14*super.getJarijari()*(super.getJarijari()+tinggi);
    }
}
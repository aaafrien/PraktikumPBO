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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return super.luas()*tinggi;
    }
    
    @Override
    public double lp(){
        return 2*(super.luas() + super.getPanjang()*tinggi+ super.getLebar()*tinggi);
    }
}
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
public class PersegiPanjang implements MenghitungBidang{
    double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double luas(double a, double b){
        return panjang*lebar;
    }
    
    @Override
    public double luas(){
        return panjang*lebar;
    }
    
    @Override
    public double keliling(){
        return 2*(panjang+lebar);
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
}
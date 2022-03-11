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
public class Lingkaran implements MenghitungBidang{
    double jariJari;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
        
    public double luas(double a){
        return 3.14*jariJari*jariJari;
    } 
   
    @Override
    public double luas(){
        return 3.14*jariJari*jariJari;
    }

    @Override
    public double keliling(){
        return 2*3.14*jariJari;
    }   
    
    public double getJarijari(){
        return jariJari;
    }
}
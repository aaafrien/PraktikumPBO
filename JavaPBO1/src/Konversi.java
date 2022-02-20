/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */

public class Konversi {
    private int suhu;
    private double reamur, farenheit, kelvin;
    
    void konversiFarenheit(){
        farenheit = ((9*suhu)/5)+32;
    }
    
    void konversiReamur(){
        reamur = (4*suhu)/5;
    }
    
    void konversiKelvin(){
        kelvin = suhu+273.15;
    }
    
    String cekKondisi(){
    String kondisi = "Normal";
    
    if(suhu<0){
        kondisi = "Beku";
    } else if(suhu>100){
        kondisi = "Mendidih";
    }
    
    return kondisi;
    }
    
    public Konversi(int suhu) {
        this.suhu = suhu;
    }
 
    void lihatData(){
        konversiFarenheit();
        konversiReamur();
        konversiKelvin();
        System.out.println("\nSuhu Dalam Celcius\t: " + this.suhu + "°C");
        System.out.println("Dalam Farenheit\t: " + farenheit + "°F");
        System.out.println("Dalam Reamur\t\t: " + reamur + "°R");
        System.out.println("Dalam Kelvin\t\t: " + kelvin + "°K");
        System.out.println("Kondisi Air " + cekKondisi() + ".");
    }
}
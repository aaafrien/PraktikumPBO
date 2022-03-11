/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih = 0, ulang = 1;
        double panjang, lebar, tinggi, jariJari;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("+-------------------------------------+");
        System.out.println("| Program Menghitung Balok dan Tabung |");
        System.out.println("+-------------------------------------+");
        do{
            System.out.println("==============");
            System.out.println("| Menu Utama |");
            System.out.println("==============");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");
            
            try{
                pilih = input.nextInt();
            } catch(Exception e){
                System.out.println("Kesalahan input!");
            }
        
            switch(pilih){
                case 1 :
                    try{
                        System.out.print("Input Panjang : ");
                        panjang = input.nextDouble();
                        System.out.print("Input Lebar : ");
                        lebar = input.nextDouble();
                        System.out.print("Input Tinggi : ");
                        tinggi = input.nextDouble();

                        MenghitungBidang persegiPanjang = new PersegiPanjang(panjang, lebar);
                        MenghitungRuang balok = new Balok(panjang, lebar, tinggi);

                        System.out.println("Luas Persegi Panjang = " + persegiPanjang.luas());
                        System.out.println("Keliling Persegi Panjang = " + persegiPanjang.keliling());
                        System.out.println("Volume Balok = " + balok.volume());
                        System.out.println("Luas Permukaan Balok = " + balok.lp());
                    } catch(Exception e){
                        System.out.println("Kesalahan input!");
                        System.exit(0);
                    }
                    break;
                case 2 :
                    try{
                        System.out.print("Input Tinggi : ");
                        tinggi = input.nextDouble();
                        System.out.print("Input Jari-jari : ");
                        jariJari = input.nextDouble();

                        MenghitungBidang lingkaran = new Lingkaran(jariJari);
                        MenghitungRuang tabung = new Tabung(jariJari, tinggi);

                        System.out.println("Luas Lingkaran = " + lingkaran.luas());
                        System.out.println("Keliling Lingkaran = " + lingkaran.keliling());
                        System.out.println("Volume Tabung = " + tabung.volume());
                        System.out.println("Luas Permukaan Tabung = " + tabung.lp());
                    } catch(Exception e){
                        System.out.println("Kesalahan input!");
                        System.exit(0);
                    }
                    break;
                case 0 :
                    System.exit(0);
                default :
                    System.out.println("Kesalahan input!");
                    break;
            }
            System.out.print("\nUlangi? (Ya : 1 || Tidak : 0) ");
            try{
                ulang = input.nextInt();
            } catch(Exception e){
                System.out.println("Kesalahan input!");
            }
        } while(ulang==1);
    }
}

//123200093 - Afrien Khoirunnisa S
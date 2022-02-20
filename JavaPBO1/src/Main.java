import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        int suhu, pilih;
        
        Scanner inputSuhu = new Scanner(System.in);
        Scanner inputPilih = new Scanner(System.in);

        System.out.println("+===========================+");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("+===========================+");
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu Dalam Celcius\t: ");
        suhu = inputSuhu.nextInt();    
        
        do{
            Konversi lihat = new Konversi(suhu);
            System.out.println("\nOpsi");
            System.out.println("----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih\t: ");
            pilih = inputPilih.nextInt();
            if(pilih==1){
                lihat.lihatData();
            } else if(pilih==2){
                System.out.println("\nInput Data");
                System.out.println("----------");
                System.out.print("Suhu Dalam Celcius\t: ");
                suhu = inputSuhu.nextInt();
            } else if(pilih==3){
                System.out.println("");
            } else{
                System.out.println("\nOpsi tidak ada. Mohon masukkan opsi dengan benar!");
            }
        } while(pilih!=3);
    }
}
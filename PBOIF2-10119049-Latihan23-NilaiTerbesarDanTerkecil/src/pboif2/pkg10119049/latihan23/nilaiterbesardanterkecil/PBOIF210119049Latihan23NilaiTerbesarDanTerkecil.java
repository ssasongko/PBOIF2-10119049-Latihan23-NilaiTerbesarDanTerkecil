/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk mencari nilai terbesar dan terkecil
 */
public class PBOIF210119049Latihan23NilaiTerbesarDanTerkecil {
    public static Scanner scan = new Scanner(System.in);
    public static int jumlahNilai = 0;
    public static String namaPetugas;
    public static int[] arrNilai = new int[255];
    
    public static void setData(){
        
        int i = 0;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scan.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        jumlahNilai = scan.nextInt();
        
        while(i < jumlahNilai){
           System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
           arrNilai[i] = scan.nextInt(); 
           i++;
        }
    }
    
    public static int getNilaiTerkecil(int jumlahNilai){
        int nilaiTerkecil = arrNilai[0];
               
        for(int i = 1; i < jumlahNilai; i++){
            if(nilaiTerkecil > arrNilai[i]){
                nilaiTerkecil = arrNilai[i];
            }
        }
        
        return nilaiTerkecil;
    }
    
    public static int getNilaiTerbesar(int jumlahNilai){
        int nilaiTerbesar = arrNilai[1];
        
        for(int i = 1; i < jumlahNilai; i++){
            if(nilaiTerbesar < arrNilai[i]){
                nilaiTerbesar = arrNilai[i];
            }
        }
        
        return nilaiTerbesar;
    }
    
    public static void getTampilNilai(int jumlahNilai){
        int i = 0;
        System.out.println("=====Hasil Nilai Mahasiswa====");
        while(i < jumlahNilai){
            System.out.println("Nilai Mahasiswa ke-" + (i+1)  + " : " + arrNilai[i]);
            i++;
        }
        
        System.out.printf("%nNilai Terkecil adalah %d",getNilaiTerkecil(jumlahNilai));
        System.out.printf("%nNilai Terbesar adalah %d",getNilaiTerbesar(jumlahNilai));
        System.out.printf("%n%nPetugas : %s%n",namaPetugas);
    }
    
    public static void main(String[] args) {
        
        setData();
        getTampilNilai(jumlahNilai);
    }
    
}

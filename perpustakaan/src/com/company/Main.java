package com.company;
import java.util.Scanner;

class pembeli{
    String nama, noHandphone, jenisKelamin;

    pembeli(String nama, String noHandphone, String jenisKelamin){
        this.nama = nama;
        this.noHandphone = noHandphone;
        this.jenisKelamin = jenisKelamin;
    }
    void dataPembeli() {
        System.out.println("Data Pembeli");
        System.out.println("Nama            : " + this.nama);
        System.out.println("No HP           : " + this.noHandphone);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
    }
}

class buku{
    String namaBuku, noSeri, namaPengarang, namaPenerbit;
    buku(String namaBuku, String noSeri, String namaPengarang, String namaPenerbit){
        this.namaBuku = namaBuku;
        this. noSeri = noSeri;
        this.namaPengarang = namaPengarang;
        this.namaPenerbit = namaPenerbit;
    }
    void databuku(){
        System.out.println("Data Buku");
        System.out.println("Nama Buku       : " + this.namaBuku);
        System.out.println("No Seri         : " + this.noSeri);
        System.out.println("Nama Pengarang  : " + this.namaPengarang);
        System.out.println("Nama Penerbit   : " + this.namaPenerbit);
    }
}

public class Main {

    public static void main(String[] args) {

        int pilihan, x = 0, noUrut = 0;
        char alternatif;
        String nama, noHandphone, jenisKelamin;
        String namaBuku, noSeri, namaPengarang, namaPenerbit;
        Scanner masukkan = new Scanner(System.in);
        pembeli[] dataPembeli = new pembeli[1024];
        buku[] dataBuku = new buku[1024];

        do{
            System.out.println("=====Perpustakaan Bahagia=====");
            System.out.println("1. Input Data Pembelian");
            System.out.println("2. Cetak Data Pembelian");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan pilihan: ");
            pilihan = masukkan.nextInt();
            if (pilihan == 1) {
                x++;
                System.out.println("=====Data Pembeli=====");
                System.out.print("Nama            : ");
                nama = masukkan.next();
                System.out.print("No HP           : ");
                noHandphone = masukkan.next();
                System.out.print("Jenis Kelamin   : ");
                jenisKelamin = masukkan.next();
                dataPembeli[x] = new pembeli(nama, noHandphone, jenisKelamin);

                System.out.println("======Data Buku======");
                System.out.print("Nama Buku       : ");
                namaBuku = masukkan.next();
                System.out.print("No Seri         : ");
                noSeri = masukkan.next();
                System.out.print("Nama Pengarang  : ");
                namaPengarang =  masukkan.next();
                System.out.print("Nama Penerbit   : ");
                namaPenerbit = masukkan.next();
                dataBuku[x] = new buku(namaBuku, noSeri, namaPengarang, namaPenerbit);

            }else if (pilihan == 2) {
                if (x < 1) {
                    System.out.println("Tidak Ada Data Pembelian");
                } else {
                    while (noUrut < x) {
                        noUrut++;
                        System.out.println("Nomor Urut Ke-" + noUrut);
                        dataPembeli[noUrut].dataPembeli();
                        dataBuku[noUrut].databuku();
                    }
                }
            }else {
                return;
            }
            System.out.print("Ingin melakukan pembelian lagi? (y/n) ");
            alternatif = masukkan.next().charAt(0);
        } while (alternatif == 'y' || alternatif == 'Y');
        System.out.print("Terimakasih");
    }
}
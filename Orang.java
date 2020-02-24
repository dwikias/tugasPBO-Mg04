/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author dwiki
 */
public class Orang {
    private String nama;
    private String alamat;
    private String kota;
    private int umur;
    private char jenis_kelamin;

    void setnama(String nama) { 
        this.nama = nama;
    }
    void setalamat(String alamat) {
        this.alamat =  alamat;
    }
    void setkota(String kota) {
        this.kota =  kota;
    }
    void setumur(int umur) {
        this.umur = umur;
    }
    void setjenis_kelamin(char jenis_kelamin) {
        if (jenis_kelamin == 'L'|| jenis_kelamin=='l'){
            this.jenis_kelamin='L';
        }else if(jenis_kelamin == 'P'|| jenis_kelamin=='p'){
            this.jenis_kelamin='P';
        }else {
            System.out.println("Input salah");
        }
    }
    String getnama() {
        return this.nama;
    }
    String getalamat() {
        return this.alamat;
    }
    String getkota() {
        return this.kota;
    }
    int getumur() {
        return this.umur;
    }
    char getjenis_kelamin() {
        return this.jenis_kelamin;
    }
    @Override
    public String toString() {
        /*
            Mengembalikan informasi identitas orang
         */
        return  "\nNama   \t\t: "+ this.nama+
                "\nAlamat \t\t: "+ this.alamat+
                "\nKota   \t\t: "+ this.kota+
                "\nUmur   \t\t: "+ this.umur+
                "\nJenis Kelamin \t: "+ this.jenis_kelamin;
        
    }
}
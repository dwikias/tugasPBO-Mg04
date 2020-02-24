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
public class MahasiswaReport{
    private static final int A = 4;
    private static final int B = 3;
    private static final int C = 2;
    private static final int D = 1;
    private static final int E = 0;
    private String mk1;
    private String mk2;
    private int sks1;
    private int sks2;
    private String nilai1;
    private String nilai2;

    MahasiswaReport(String mk1, String mk2, int sks1, int sks2, String nilai1, String nilai2) {
        this.mk1 = "PBO 1";
        this.mk2 = "PBO 2";
        this.sks1 = sks1;
        this.sks2 = sks2;
        this.nilai1 = "A";
        this.nilai2 = "A";
    }
    MahasiswaReport(MahasiswaReport sp) {
        
    }
    public String getmk1() {
        return  this.mk1;
    }
    public void setmk1(String mk1) {
        this.mk1 = mk1;
    }
    public String getmk2() {
        return this.mk2;
    }
    public void setmk2(String mk2) {
        this.mk2 = mk2;
    }
    public int getsks1() {
        return this.sks1;
    }
    public void setsks1(int sks1) {
        this.sks1 = sks1;
    }
    public int getsks2() {
        return this.sks2;
    }
    public void setsks2(int sks2) {
        this.sks2 = sks2;
    }
    public String getnilai1() {
        return  this.nilai1;
    }
    public void setnilai1(String nilai1) {
        this.nilai1 = nilai1;
    }
    public String getnilai2() {
        return this.nilai2;
    }
    public void setnilai2(String nilai2) {
        this.nilai2 = nilai2;
    }
    public float HitungNR()
    {
        /*
            Nilai NR adalah : ( Nilai mutu MK1 + Nilai mutu MK2 ) / (sks MK1 + sks MK2)
         */
        
        return (ConvertNilaiMutu(nilai1)*sks1+ConvertNilaiMutu(nilai2)*sks2)/(sks1+sks2);
    }
    public int ConvertNilaiMutu(String HurufMutu){
        int mutu = 0;
        /*
            Huruf mutu A : nilai mutu 4
            Huruf mutu B : nilai mutu 3
            Huruf mutu C : nilai mutu 2
            Huruf mutu D : nilai mutu 1
            Huruf mutu E : nilai mutu 0
         */
      
        switch(HurufMutu){
            case "A":
                mutu = (int)A;
                break;
            case "B":
                mutu = (int)B;
                break;
            case "C":
                mutu = (int)C;
                break;
            case "D":
                mutu = (int)D;
                break;
            case "E":
                mutu = (int)E;
                break;
        }
        return mutu;
    }
    
    public String toString() {
        /*
            Mengembalikan informasi laporan nilai mahasiswa
         */
        return "\n Information from student raport\n"+
            "=================================\n"+
        "\nMK1       \t: "+this.mk1+
        "\nSKS1      \t: "+this.sks1+
        "\nNILAI 1   \t: "+this.ConvertNilaiMutu(nilai1)+
        "\nMK2       \t: "+this.mk2+
        "\nSKS2      \t: "+this.sks2+
        "\nNILAI 1   \t: "+this.ConvertNilaiMutu(nilai2)+
        "\nNR        \t: "+HitungNR();
    }
}

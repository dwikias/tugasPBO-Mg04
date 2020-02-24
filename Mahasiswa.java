/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;
public class Mahasiswa extends Orang{
    private String NIP;
    private String kelas;
    private int semester;
    private MahasiswaReport report;

    public Mahasiswa(String nama, String alamat, String kota, int umur, char jenis_kelamin, String NIP, String kelas, int semester, MahasiswaReport Report){
           setnama(nama);
           setalamat(alamat);
           setkota(kota);
           setumur(umur);
           setjenis_kelamin(jenis_kelamin);
           this.NIP = NIP;
           this.kelas = kelas;
           this.semester = semester;
           this.report = Report;
    }
    public void setId(String id) {
        this.NIP = id;
    }
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }
    public void setSemester(int semester) { 
        this.semester = semester; 
    }
    public void setReport(MahasiswaReport report) {
         this.report = report;
    }
    public String getNIP() {
        return this.NIP;
    }
    public String getkelas()
    {
        return this.kelas;
    }
    public int getSemester()
    {
        return this.semester;
    }
    public MahasiswaReport getReport()
    {
        return report;
    }
    @Override
    public String toString()
    {
        /*
            Mengembalikan informasi mahasiswa
         */
        return "\n\n\tInformasi Mahasiswa \n"+
                "==============================\n"+
                super.toString()+
                "\nNIP          \t: "+this.NIP+
                "\nKelas        \t: "+this.kelas+
                "\n"+this.report.toString();
                
    }
}


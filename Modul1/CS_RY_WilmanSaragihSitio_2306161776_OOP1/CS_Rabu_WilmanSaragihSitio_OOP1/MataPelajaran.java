package CS_Rabu_WilmanSaragihSitio_OOP1;


/**
 * Write a description of class MataPelajaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MataPelajaran implements Showing {
    public String namaMataPelajaran;
    public Guru guru;
    public Penilaian UTS, UAS;
    public float nilaiUTS, nilaiUAS;
    
    public MataPelajaran(String namaMataPelajaran, Guru guru) {
        this.namaMataPelajaran = namaMataPelajaran;
        this.guru = guru;
    }
    
    public void addNilai(Penilaian UTS, float nilaiUTS, Penilaian UAS, float nilaiUAS) {
        this.UTS = UTS;
        this.nilaiUTS = nilaiUTS;
        this.UAS = UAS;
        this.nilaiUAS = nilaiUAS;
    }
    
    public void showDetail() {
        System.out.print("Mata Pelajaran: " + namaMataPelajaran + "\nNama Guru: " + guru.name + "\nNilai UTS: " + nilaiUTS + "\nNilai UAS: " + nilaiUAS);
    }
}
package CS_Rabu_WilmanSaragihSitio_OOP1;


/**
 * Write a description of class Siswa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Siswa implements Showing {
    public String nama, status;
    public int id;
    public float totalNilai;
    public MataPelajaran mataPelajaran;
    
    public Siswa(String nama, int id, MataPelajaran mataPelajaran) {
        this.nama = nama;
        this.id = id;
        this.mataPelajaran = mataPelajaran;
    }
    
    public void totalNilai() {
        float nilaiTotal = ((40 * mataPelajaran.nilaiUTS)/100) + ((60 * mataPelajaran.nilaiUAS)/100);
        
        if (nilaiTotal >= 75) {
            this.status = "LULUS";
        } else {
            this.status = "TIDAK LULUS";
        }
        this.totalNilai = nilaiTotal;
    }
    
    public void showDetail() {
        System.out.println(String.format("Nama Siswa: %s \nID: %d \nMata Pelajaran: %s \nTotal Nilai: %.2f \nStatus: %s", nama, id, mataPelajaran.namaMataPelajaran, totalNilai, status));
    }
}

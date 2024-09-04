package CS_Rabu_WilmanSaragihSitio_OOP1;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        Guru guruIPA = new Guru("Mr. Budi", 20);
        MataPelajaran IPA = new MataPelajaran("IPA", guruIPA);
        
        IPA.addNilai(Penilaian.UTS, 30, Penilaian.UAS, 70);
        Siswa ana = new Siswa("Ana", 33, IPA);
        
        IPA.showDetail();
        System.out.println();
        ana.showDetail();
    }
}
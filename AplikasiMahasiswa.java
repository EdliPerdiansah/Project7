import java.util.ArrayList;
import java.util.ArrayDeque;

class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;

    public Mahasiswa(T1 nim, T2 name, T3 clas) {
        this.nim = nim;
        this.name = name;
        this.clas = clas;
    }

    public T1 getNim() { return nim; }
    public T2 getName() { return name; }
    public T3 getClas() { return clas; }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + name + ", Kelas: " + clas;
    }
}

public class AplikasiMahasiswa {
    public static void main(String[] args) {
        ArrayList<Mahasiswa<String, String, String>> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add(new Mahasiswa<>("1102020", "Aksa", "TI23C"));
        daftarMahasiswa.add(new Mahasiswa<>("1102030", "Tunjung", "TI23C"));
        daftarMahasiswa.add(new Mahasiswa<>("1102033", "Edd", "TI23C"));

        System.out.println("Daftar Mahasiswa (ArrayList):");
        for (Mahasiswa<String, String, String> mhs : daftarMahasiswa) {
            System.out.println("- " + mhs);
        }

        ArrayDeque<String> antrean = new ArrayDeque<>();
        antrean.add("Aksa");
        antrean.add("Tunjung");
        antrean.addLast("Edd");

        System.out.println("\nAntrean Mahasiswa (ArrayDeque):");
        for (String nama : antrean) {
            System.out.println("- " + nama);
        }

        System.out.println("\nMahasiswa dipanggil: " + antrean.poll());
        System.out.println("Sisa antrean: " + antrean);
    }
}

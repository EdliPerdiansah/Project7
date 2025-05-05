public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println("NIM: " + m.getNim());
        System.out.println("Nama: " + m.getName());
        System.out.println("Kelas: " + m.getClas());
    }
}

class Mahasiswa<T1, T2, T3> {
    private T1 nim;
    private T2 name;
    private T3 clas;

    public void setNim(T1 nim) {
        this.nim = nim;
    }

    public T1 getNim() {
        return nim;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T2 getName() {
        return name;
    }

    public void setClas(T3 clas) {
        this.clas = clas;
    }

    public T3 getClas() {
        return clas;
    }
}

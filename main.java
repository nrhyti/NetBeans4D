package akademis;

public class main {
    public static void main(String[] args) {
        
        // Membuat objek Mahasiswa
        mahasiswa mhs = new mahasiswa("2410010025", "Norhayati", 3.77, 4);
        
        // Membuat objek MataKuliah
        MataKuliah mk = new MataKuliah("TIBJB4D", "PBO");
        
        // Menampilkan data
        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilData();
        
        System.out.println("\n=== Mata Kuliah ===");
        mk.tampilMatkul();
    }
}

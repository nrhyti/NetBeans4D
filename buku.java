class buku {
    String judul;
    int halaman;

    // Constructor 1 (tanpa parameter)
    buku() {
        judul = "Tidak diketahui";
        halaman = 0;
    }

    // Constructor 2 (dengan parameter)
    buku(String j, int h) {
        judul = j;
        halaman = h;
    }

    // Method tanpa nilai balik
    void tampilData() {
        System.out.println("Judul Buku: " + judul);
        System.out.println("Jumlah Halaman: " + halaman);
    }

    // Method dengan nilai balik
    String getJudul() {
        return judul;
    }
}
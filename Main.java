public class Main {
    public static void main(String[] args) {

        buku b1 = new buku();
        buku b2 = new buku("Laskar Pelangi", 300);

        b1.tampilData();
        System.out.println();

        b2.tampilData();

        System.out.println("Judul buku kedua: " + b2.getJudul());
    }
}
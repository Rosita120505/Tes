
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("— kalkulator penghitung–");
        System.out.println("1. Hitung Luas Bidang");
        System.out.println("2. Hitung Volum");
        System.out.println("0. Exit");

        System.out.println("Masukkan pilihan anda : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                luas();
                break;
            case 2:
                volum();
                break;
            case 0:
                System.out.println("Exit, terima kasih");
                break;
            default:
                System.out.println("Pilihan tidak valid ");
                break;
        }
        input.close();
    }

    public static void luas() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Kalkulator Penghitung Luas ===");
        System.out.println("Pilih bidang yang akan dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke Menu Utama");

        System.out.println("Pilih :");
        int luas = input.nextInt();

        switch (luas) {
            case 1:
                System.out.println("Masukan panjang sisi");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;
                System.out.println("Luas Persegi adalah : " + luasPersegi);
                break;
            case 2:
                System.out.println("Masukan Jari jari ");
                double jariJari = input.nextDouble();
                double luasLingkaran = 3.14 * jariJari * jariJari;
                System.out.println("Luas lingkaran adalah : " + luasLingkaran);
                break;
            case 3:
                System.out.println("Masukan Alas : ");
                double alas = input.nextDouble();
                System.out.println("Masukan Tinggi : ");
                double tinggi = input.nextDouble();

                double luasSegitiga = 0.5 * alas * tinggi;

                System.out.println("Luas segitiga adalah : " + luasSegitiga);
                break;
            case 4:
                System.out.println("Masukan panjang : ");
                double panjang = input.nextDouble();
                System.out.println("Masukan lebar : ");
                double lebar = input.nextDouble();

                double luasPersegiP = panjang * lebar;
                System.out.println("Luas persegi panjang adalah : " + luasPersegiP);
                break;
            case 0:
                System.out.println("Terima kasih");
                break;
            default:
                System.out.println("Maaf pilihan tidak valid");
                break;
        }
        input.close();
    }

    public static void volum() {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kalkulator Penghitung Volume ===");
        System.out.println("Pilih bidang yang akan dihitung: ");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("0. Kembali ke Menu Utama");

        System.out.println("Pilih : ");
        int vol = input.nextInt();

        switch (vol) {
            case 1:
                System.out.println("Masukan sisi");
                double sisi = input.nextDouble();
                double volPersegi = sisi * sisi * sisi;
                System.out.println("Volume kubus adalah : " + volPersegi);
                break;
            case 2:
                System.out.println("Masukan panjang : ");
                double panjangB = input.nextDouble();
                System.out.println("Masukan lebar : ");
                double lebarB = input.nextDouble();
                System.out.println("Masukan tinggi : ");
                double tinggiB = input.nextDouble();

                double volBalok = panjangB * tinggiB * lebarB;
                System.out.println("Volume lingkaran : " + volBalok);
                break;
            case 3:
                System.out.println("Masukan jari jari : ");
                double jariJariV = input.nextDouble();
                System.out.println("Masukan tinggi : ");
                double tinggiL = input.nextDouble();

                double volLingkaran = 3.14 * tinggiL * jariJariV;
                System.out.println("Volume lingkaran : " + volLingkaran);
                break;
        }
        input.close();
    }
}

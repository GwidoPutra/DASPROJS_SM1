import java.util.ArrayList;
import java.util.Scanner;

class Pasien {
    private String nama;
    private int umur;
    private String diagnosis;

    public Pasien(String nama, int umur, String diagnosis) {
        this.nama = nama;
        this.umur = umur;
        this.diagnosis = diagnosis;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + ", Diagnosis: " + diagnosis;
    }
}

public class testmedis2 {
    private static ArrayList<Pasien> daftarPasien = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Keluar");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahPasien();
                    break;
                case 2:
                    hapusPasien();
                    break;
                case 3:
                    cariPasien();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahPasien() {
        System.out.print("Masukkan nama pasien: ");
        String nama = scanner.next();
        System.out.print("Masukkan umur pasien: ");
        int umur = scanner.nextInt();
        System.out.print("Masukkan diagnosis pasien: ");
        String diagnosis = scanner.next();

        Pasien pasien = new Pasien(nama, umur, diagnosis);
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    private static void hapusPasien() {
        System.out.print("Masukkan nama pasien yang akan dihapus: ");
        String nama = scanner.next();
        Pasien pasienDihapus = null;

        for (Pasien pasien : daftarPasien) {
            if (pasien.getNama().equals(nama)) {
                pasienDihapus = pasien;
                break;
            }
        }

        if (pasienDihapus != null) {
            daftarPasien.remove(pasienDihapus);
            System.out.println("Pasien berhasil dihapus.");
        } else {
            System.out.println("Pasien tidak ditemukan.");
        }
    }

    private static void cariPasien() {
        System.out.print("Masukkan nama pasien yang akan dicari: ");
        String nama = scanner.next();

        for (Pasien pasien : daftarPasien) {
            if (pasien.getNama().equals(nama)) {
                System.out.println("Informasi Pasien:");
                System.out.println(pasien);
                return;
            }
        }

        System.out.println("Pasien tidak ditemukan.");
    }
}

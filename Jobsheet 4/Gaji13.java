import java.util.Scanner;
public class Gaji13 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, gaji, potGaji, TotGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Anda");
        JmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan gaji per hari anda");
        gaji=input.nextInt();
        System.out.println("Masukkan potongan gaji perhari anda");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah " +TotGaji);
    }
        
    }
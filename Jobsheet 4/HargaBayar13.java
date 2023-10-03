import java.util.Scanner;
public class HargaBayar13 {
    public static void main(String[] args) {
    Scanner input =new Scanner (System.in);

        String merkBuku;
        int jmlHal, harga, jumlah;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan merk buku yang akan dibeli");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHal=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon barang yang tertera ");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        
        System.out.println("Merk Buku " +merkBuku);
        System.out.println("Jumlah Halaman " +jmlHal);
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus anda bayar adalah " +bayar);
        
    }

}

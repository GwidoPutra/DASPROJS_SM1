import java.util.Scanner;
public class ArrayRataNilai13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] nilaiMhs = new int[10];
        int totalLulus = 0, tdLulus = 0;
        double total0 = 0, total1 = 0, rata2Lulus, rata2TdLulus;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] > 70) {
                total0 += nilaiMhs[i];
            }
        }
        for (int i = 0; i < jmlMhs; i++) {
            if (nilaiMhs[i] <= 70) {
                total1 += nilaiMhs[i];
                tdLulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus++;
            }
        }

        rata2Lulus = total0/totalLulus;
        rata2TdLulus = total1/tdLulus;
        System.out.println("Rata-rata nilai lulus = " +rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " +rata2TdLulus);
        System.out.println("Banyaknya mahasiswa yang lulus = " +totalLulus);

    }
}
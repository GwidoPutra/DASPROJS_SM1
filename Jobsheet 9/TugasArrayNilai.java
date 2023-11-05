import java.util.Scanner;

public class TugasArrayNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int el = sc.nextInt();

        int[] nilai = new int[el];

        for (int i = 0; i < el; i++) {
            System.out.print("Masukkan nilai elemen ke-" + i + ": ");
            nilai[i] = sc.nextInt();
        }

        int ti = nilai[0];
        int re = nilai[0];
        int total = nilai[0];

        for (int i = 1; i < el; i++) {
            if (nilai[i] > ti) {
                ti = nilai[i];
            }
            if (nilai[i] < re) {
                re = nilai[i];
            }
            total += nilai[i];
        }

        double rataRata = (double) total / el;

        System.out.println("Nilai tertinggi: " + ti);
        System.out.println("Nilai terendah: " + re);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}

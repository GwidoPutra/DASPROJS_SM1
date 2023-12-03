import java.util.Scanner;
public class Kubus13 {

    static int hitungVolume (int ss) {
        return ss*ss*ss;
    }

    static int hitungLP (int ss) {
        return 6*ss*ss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan sisi : ");
        int sisi = sc.nextInt();

        System.out.println("\nVolume kubus : "+hitungVolume(sisi));
        System.out.println("Luas permukaan kubus : "+hitungLP(sisi));
        
    }
}
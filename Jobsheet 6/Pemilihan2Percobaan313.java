import java.util.Scanner;
public class Pemilihan2Percobaan313 {
    public static void main(String[] args) {

        Scanner input13 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan kategori :");
        kategori = input13.nextLine();
        System.out.println("Masukkan besarnya penghasilan :");
        penghasilan = input13.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")){
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan bersih : " + gajiBersih);
        } else 
            System.out.println("Masukan kategori Salah");

    }
    
}
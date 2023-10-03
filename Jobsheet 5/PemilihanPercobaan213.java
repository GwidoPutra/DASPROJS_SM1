import java.util.Scanner;
public class PemilihanPercobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner (System.in);

        System.out.print("Nilai uas   :");
        float uas = input13.nextFloat();
        System.out.print("Nilai uts   :");
        float uts = input13.nextFloat();
        System.out.print("Nilai kuis   :");
        float kuis = input13.nextFloat();
        System.out.print("Nilai tugas   :");
        float tugas = input13.nextFloat();
        
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        ///String message = total < 65 ? "Remidi" : "Tidak remidi";
        ///System.out.println("Nilai akhir = " + total + " sehingga" + message);


        // String message = total < 65 ? "Remidi" : "Tidak remidi";
        // System.out.println("Nilai akhir = " + total + " sehingga" + message);

        // String predikat;
        // if (total <= 100 && total > 73) {
        //     System.out.println("nilai huruf : A");
        //     System.out.println("nilai setara : 4");
        //     System.out.println("kualifikasi : Sangat baik");
        // } else if (total <= 80 && total > 73) {
        //     System.out.println("nilai huruf : B+");
        //     System.out.println("nilai setara : 3,5");
        //     System.out.println("kualifikasi : Baik");
        // } else if (total <= 73 && total > 65) {
        //     System.out.println("nilai huruf : B");
        //     System.out.println("nilai setara : 3");
        // } else if (total <= 65 && total > 60) {
        //     System.out.println("nilai huruf : C+");

        String predikat;
        if (total <= 100 && total > 80){
            predikat = "A";
        } else if (total <= 80 && total > 73) {
            predikat = "B+";
        } else if (total <= 73 && total > 65) {
            predikat = "B";
        } else if (total <= 65 && total > 60) {
            predikat = "C+";
        } else if (total <= 60 && total > 50) {
            predikat = "C";
        } else if (total <= 50 && total > 39) {
            predikat = "D";
        } else {
            predikat = "E";
        }


        System.out.println("Nilai total yang didapat :" + total + "Sehingga mendapat predikat" + predikat);


    }
    
}

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

        String predikat;
        String setara;
        String kualifikasi;
        if (total <= 100 && total > 80){
            predikat = "A";
            setara = "4";
            kualifikasi = "Sangat baik";
        } else if (total <= 80 && total > 73) {
            predikat = "B+";
            setara = "3.5";
            kualifikasi = "lebih dari baik";
        } else if (total <= 73 && total > 65) {
            predikat = "B";
            setara = "3";
            kualifikasi = "Baik";
        } else if (total <= 65 && total > 60) {
            predikat = "C+";
            setara = "2.5";
            kualifikasi = "Lebih dari cukup";
        } else if (total <= 60 && total > 50) {
            predikat = "C";
            setara = "2";
            kualifikasi = "Cukup";
        } else if (total <= 50 && total > 39) {
            predikat = "D";
            setara = "1";
            kualifikasi = "Kurang";
        } else {
            predikat = "E";
            setara = "0";
            kualifikasi = "Gagal";
        }


        System.out.println("Nilai total yang didapat :" + total );
        System.out.println("Nilai huruf :" + predikat);
        System.out.println("Nilai setara :" + setara);
        System.out.println("Kualifikasi :" + kualifikasi);


    }
    
}

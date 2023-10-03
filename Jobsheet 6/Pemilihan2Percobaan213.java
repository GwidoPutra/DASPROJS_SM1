import java.util.Scanner;

public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1 = ");
        float sudut1 = input13.nextFloat();
        System.out.print("Masukkan sudut 2 = ");
        float sudut2 = input13.nextFloat();
        System.out.print("Masukkan sudut 3 = ");
        float sudut3 = input13.nextFloat();
        float totalsudut;
        totalsudut=sudut1+sudut2+sudut3;
        
        if (totalsudut==180) {
                if ((sudut1==90)||(sudut2==90)||(sudut3==90 && (sudut1==sudut2)||(sudut1==sudut3)||(sudut2==sudut3) ))
                System.out.println("Segitiga siku - siku sama kaki");
            else if ((sudut1==90)||(sudut2==90)||(sudut3==90))
                System.out.println("Segitiga tersebut adalah siku - siku");
                else if((sudut1==60)||(sudut2==60)||(sudut3==60))
                    System.out.println("Segitiga tersebut adalah segitiga sama sisi");
                else if ((sudut1==sudut2)||(sudut1==sudut3)||(sudut2==sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
                else if ((sudut1>90)||(sudut2>90)||(sudut3>90))
                System.out.println("Segitiga tersebut adalah segitiga tumpul");
                else 
                System.out.println("Segitiga Sembarang");
               
        }else
            System.out.println("Bukan segitiga");
        
        

    }
}
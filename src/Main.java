import java.util.Scanner;
public class Main {
    public static void main(String []args){
        int artikYil = 0, yil, yild, yilYuz, yilDortYuz;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz");
        yil = inp.nextInt();
        //mod alma işlemleri
        yild = yil%4;
        yilYuz = yil%100;
        yilDortYuz = yil%400;

        //Artıklık ölçme
        if (yild == 0){
            artikYil = 1;
        }
        if (yilYuz == 0){
            artikYil = 0;
            if (yilDortYuz == 0){
                artikYil = 1;
            }
        }

        //Sitem çıktısı
        if (artikYil == 1){
            System.out.println(yil + " Bir artık yıldır");
        } else {
            System.out.println( yil + " Bir artık yıl değildir.");
        }
    }
}

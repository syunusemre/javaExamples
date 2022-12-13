import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int a,b;
        int total =1;


        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı : ");
        a = inp.nextInt();

        System.out.print("Üslü : ");
        b = inp.nextInt();

        for (int i = 1; i <= b ; i++){
            total *= a;


        }
        System.out.println("Üslü Sayı: " +total);


    }
}
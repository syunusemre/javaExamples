import java.util.Scanner;

public class daireAlanHesaplama {
    public static void main(String[] args){

        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire Yari Capi Giriniz: ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);
    }


}




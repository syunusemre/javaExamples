import java.util.Scanner;

public class harmonikSayi{

    public static void main(String[] args) {
        int num;
        double result=0;    // result 0.0 girilseydi for içindeki double int olarak kalabilirdi(for altındaki resultında double girilmesi gerekiyor( 1.0/i gibi))

        Scanner inp=new Scanner(System.in);
        System.out.print("N sayisini giriniz:");
        num= inp.nextInt();

        for (double i=1;i<=num;i++){    // doublelı değer girdiğimiz için double/int değerler, double değeri sağlar.
            result+=(1/i);

        }
        System.out.println("Harmanik Seri: "+result);
    }
}
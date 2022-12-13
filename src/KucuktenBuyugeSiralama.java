import java.util.Scanner;

public class KucuktenBuyugeSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz : ");
        a = inp.nextInt();

        System.out.print("2.Sayiyi giriniz : ");
        b = inp.nextInt();

        System.out.print("3.Sayiyi giriniz : ");
        c = inp.nextInt();

        // küçükten büyüye doğru sıralama

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.print( "a < b <c  ");
            }else {
                System.out.print("a < c < b  ");}}
        else if ((b<a) && (b<c)){
            if (a<c){
                System.out.print("b < a < c  ");
            } else {
                System.out.print("b < c < a  ");}}
        else {
            if (b<a){
                System.out.print("c < b <a  ");
            }else {
                System.out.print("c < a < b  ");}}
    }
}
/*import java.util.Scanner; // kucukten buyuge sıralayan program
public class kucukBuyuk {
    public static void main(String[] args) {
        int a,b,c;
        Scanner girdi= new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz>>");
        a=girdi.nextInt();
        System.out.println("Ikinci sayiyi giriniz>>");
        b=girdi.nextInt();
        System.out.println("Ucuncu sayiyi giriniz>>");
        c= girdi.nextInt();
        if(a<b && a<c){
            if (b<c)
            {
                System.out.println( a +" < " + b +" < "+ c );
            }
            else {
                System.out.println(a+ "<" +c+ "<"+b);
            }
        }
        else if (b<a && b<c){
            if(a<c){
                System.out.println(b+ "<" +a+"<" +c);
            }
            else {
                System.out.println(b+"<"+c+"<"+a);
            }
        }
        else if(c<b && c<a){
            if(b<a){
                System.out.println(c+"<"+b+"<"+a);
            }
            else{
                System.out.println(c+"<"+a+"<"+b);
            }
        }
    }
}*/

/*import java.util.Scanner;
public class kucukBuyuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("a sayısnı giriniz: ");
        a = input.nextInt();
        System.out.println("b sayısnı giriniz: ");
        b = input.nextInt();
        System.out.println("c sayısnı giriniz: ");
        c = input.nextInt();
        if((a<b)&&(a<c)){
            System.out.println("a en küçük sayıdır");
        }else if((a>b)&&(a>c)){
            System.out.println("a en büyük sayıdır");
        }else{
            System.out.println("a ortanca sayıdır");
        }
        if((b<a)&&(b<c)){
            System.out.println("b en küçük sayıdır");
        }else if((b>a)&&(b>c)){
            System.out.println("b en büyük sayıdır");
        }else{
            System.out.println("b ortanca sayıdır");
        }
        if((c<b)&&(c<a)){
            System.out.println("c en küçük sayıdır");
        }else if((c>b)&&(c>a)){
            System.out.println("c en büyük sayıdır");
        }else{
            System.out.println("c ortanca sayıdır");
        }
    }
}*/


/*import java.util.Scanner;
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
public class kucukBuyuk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.print("1.Değeri giriniz: ");
        x = scanner.nextInt();
        System.out.print("2.Değeri giriniz: ");
        y = scanner.nextInt();
        System.out.print("3.Değeri giriniz: ");
        z = scanner.nextInt();
        if(x<y && x<z && y>z)
            System.out.println("Küçükten düyüğe sıralanması="+""+x+"-"+z+"-"+y);
        else if(y<x && y<z && x>z) {
            System.out.println("Küçükten düyüğe sıralanması="+"" + y + "-" + z + "-" + x);
        }
        else if(z<y && z<x && y>x)
            System.out.println("Küçükten düyüğe sıralanması="+""+z+">"+x+">"+y);
        else if(z>y && z>x && y>x)
            System.out.println("Küçükten düyüğe sıralanması="+""+x+">"+y+">"+z);
        else
            System.out.println("Yanlış sayı veya farklı karakter girdiniz.");
    }
}*/
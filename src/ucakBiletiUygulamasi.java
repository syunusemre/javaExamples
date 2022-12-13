import java.util.Scanner;

public class ucakBiletiUygulamasi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int mesafe, yas, tip;
        double yasİndirimOranı;


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen mesafeyi giriniz(km) : ");
        mesafe = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipinizi giriniz : ");
        System.out.println("1 => Tek Yön\n2 => Gidis-Donus");
        tip = input.nextInt();

        if ((mesafe > 0) && (yas > 0) && (tip == 1 || tip == 2)) {

            if (yas < 12) {
                yasİndirimOranı = 0.50;

            } else if (yas > 12 && yas < 24) {
                yasİndirimOranı = 0.10;

            } else if (yas > 65) {
                yasİndirimOranı = 0.30;

            } else {
                yasİndirimOranı = 0;
            }


            double	normalTutar = mesafe * 0.10 ;
            double	yasİndirimi = normalTutar * yasİndirimOranı ;
            double	indirimliTutar = normalTutar - yasİndirimi ;
            double	toplamTutar;

            if (tip==2) {

                double	gidisDonusİndirimi = indirimliTutar * 0.20 ;
                toplamTutar = (indirimliTutar - gidisDonusİndirimi) * 2 ;

            }else {

                toplamTutar = indirimliTutar;

            }

            System.out.println("Toplam Tutar : " + toplamTutar + " TL");



        } else {

            System.out.println(" Hatalı Veri Girdiniz.. ! ");

        }

    }

}
/*import java.util.Scanner;
public class ucak {
    public static void main(String[] args) {
        int yas, km, yolculuk;
        double normalTutar, mesafe;
        double yasİndirimOrani;
        double yasindirimi;
        double indirimliTutar;
        double toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.print("Yasinizi giriniz :");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (\"1\" => Tek Yön , \"2\" => Gidiş Dönüş ):");
        yolculuk = input.nextInt();
        normalTutar = km * 0.10;
        yasİndirimOrani = 1;
        yasindirimi = normalTutar * yasİndirimOrani;
        indirimliTutar = normalTutar - yasindirimi;
        switch (yolculuk) {
            case 1:
                if (yas < 12) {
                    yasİndirimOrani = normalTutar * 0.50;
                }
                if (yas <= 12 && 24 > yas) {
                    yasİndirimOrani = normalTutar * 0.10;
                }
                if (yas > 65) {
                    yasİndirimOrani = normalTutar * 0.30;
                } else {
                    yasİndirimOrani = 0;
                    toplamTutar = normalTutar * yasİndirimOrani;
                    System.out.println("Toplam Tutar : " + toplamTutar + " TL");
                }
        }
        switch (yolculuk) {
            case 2:
                if (yas > 65) {
                    double gidisDonusİndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusİndirimi) * 2;
                } else {
                    toplamTutar = normalTutar;
                }
                System.out.println("Toplam Tutar : " + toplamTutar + " TL");
        }
    }
}*/



/*import java.util.Scanner;
public class ucak {
    public static void main(String[] args) {
        double km, age, tekYon, gidisDonus, kmBasinaUcret = 0.10, howFly,totalPrice, priceWithoutDiscount,ageDiscount=0,roundTripDiscount=0;
        Scanner input = new Scanner(System.in);
        System.out.print("How many km you fly? \nAnswer : ");
        km = input.nextDouble();
        System.out.print("How old are you ?\nAnswer :");
        age = input.nextDouble();
        System.out.println("Choose how you fly.");
        System.out.print("One way ticket:1 \nRound trip : 2\nAnswer : ");
        howFly = input.nextDouble();
        priceWithoutDiscount = km * kmBasinaUcret;
        boolean isPrime = true;
        if (howFly < 3 && howFly > 0&& age>0) {
            if(age<12){
                ageDiscount=(priceWithoutDiscount/2);
                System.out.println("\nAge discount : "+ageDiscount);
            }else if (age>=12&&age<=24)
            { ageDiscount=((priceWithoutDiscount*10)/100)        ;
                System.out.println("\nAge discount : "+ ageDiscount);
            } else if (age>65) {ageDiscount= (priceWithoutDiscount*30)/100;
                System.out.println("\nAge discount : "+ ageDiscount);
            }if (howFly==2){roundTripDiscount=(priceWithoutDiscount*20)/100;
                System.out.println("Round trip discount : "+ roundTripDiscount);
            }
            System.out.println("Price without dicount : " + priceWithoutDiscount);
            totalPrice=(priceWithoutDiscount-ageDiscount-roundTripDiscount);
            System.out.println("Total price : "+ totalPrice);
        } else {
            System.out.println("You entered faulty input. ");
        }
    }
}*/
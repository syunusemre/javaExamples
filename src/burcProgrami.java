import java.util.Scanner;

public class burcProgrami {
    public static void main(String[] args) {

        int day, mounth;


        Scanner input = new Scanner(System.in);

        System.out.print("Dogdugunuz ay : ");
        mounth = input.nextInt();

        System.out.print("Dogdugunuz gun: ");
        day = input.nextInt();

        if (mounth == 1){
            if (day >= 1 && 31>=day){
                if (day <= 22){
                    System.out.println("oglak burcusunuz");
                }else{
                    System.out.println("kova burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 2){
            if (day >= 1 && 28>=day){
                if (day <= 19){
                    System.out.println("kova burcusunuz");
                }else{
                    System.out.println("balık burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 3){
            if (day >= 1 && 31>=day){
                if (day <= 20){
                    System.out.println("balık burcusunuz");
                }else{
                    System.out.println("koç burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 4){
            if (day >= 1 && 30>=day){
                if (day <= 20){
                    System.out.println("koç burcusunuz");
                }else{
                    System.out.println("boga burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 5){
            if (day >= 1 && 31>=day){
                if (day <= 21){
                    System.out.println("boga burcusunuz");
                }else{
                    System.out.println("ıkızler burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 6){
            if (day >= 1 && 30>=day){
                if (day <= 22){
                    System.out.println("ıkızler burcusunuz");
                }else{
                    System.out.println("yengec burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 7){
            if (day >= 1 && 31>=day){
                if (day <= 22){
                    System.out.println("yengec burcusunuz");
                }else{
                    System.out.println("aslan burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 8){
            if (day >= 1 && 31>=day){
                if (day <= 22){
                    System.out.println("aslan burcusunuz");
                }else{
                    System.out.println("basak burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 9){
            if (day >= 1 && 30>=day){
                if (day <= 22){
                    System.out.println("basak burcusunuz");
                }else{
                    System.out.println("terazı burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 10){
            if (day >= 1 && 31>=day){
                if (day <= 22){
                    System.out.println("terazı burcusunuz");
                }else{
                    System.out.println("akrep burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 11){
            if (day >= 1 && 30>=day){
                if (day <= 22){
                    System.out.println("akrep burcusunuz");
                }else{
                    System.out.println("yay burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }
        if (mounth == 12){
            if (day >= 1 && 31>=day){
                if (day <= 21){
                    System.out.println("yay burcusunuz");
                }else{
                    System.out.println("oglak burcusunuz");
                }
            }else {
                System.out.println("Hatalı gırıs");
            }
        }


    }
}
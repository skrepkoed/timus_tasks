package localisation_1785;

import java.util.Scanner;

public class Localisation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=Integer.parseInt(input.nextLine());
        if (number<5) {
            System.out.println("few");
        }else if(number<10){
            System.out.println("several");
        }else if(number<20){
            System.out.println("pack");
        }else if(number<50){
            System.out.println("lots");
        }else if(number<100){
            System.out.println("horde");
        }else if(number<250){
            System.out.println("throng");
        }else if(number<500){
            System.out.println("swarm");
        }else if(number<1000){
            System.out.println("zounds");
        }else if(number>=100){
            System.out.println("legion");
        }
        input.close();
    }
}

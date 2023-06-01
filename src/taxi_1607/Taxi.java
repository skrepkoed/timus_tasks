package taxi_1607;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=input.nextLine().split(" ");
        int startA=Integer.parseInt(str[0]);
        int plus=Integer.parseInt(str[1]);
        int startB=Integer.parseInt(str[2]);
        int minus=Integer.parseInt(str[3]);
        if(startA<startB){
            while(startA<=startB){
                startA+=plus;
                startB-=minus;
                if (startA>startB+minus) {
                    startA=startB+minus;
                }
            }
        }
        System.out.println(startA);
        input.close();
    }
}

package a_plus_b_2035;

import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] items=input.nextLine().split(" ");
        long less_a=Integer.parseInt(items[0]);
        long less_b=Integer.parseInt(items[1]);
        long c=Integer.parseInt(items[2]);
        input.close();
        long a;
        long b;
        long eval=(less_a+less_b)/2;
        if (2*eval-1>=c) {
            a=eval;
            b=c-eval;
            System.out.println(b+" "+a);
        }else{ 
            System.out.println("Impossible");
        }

    }
}

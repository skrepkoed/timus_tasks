package fourty_legs_1876;

import java.util.Scanner;

public class FourtyLegs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] array=input.nextLine().split(" ");
        int a=Integer.parseInt(array[0]);
        int b=Integer.parseInt(array[1]);
        int result1=120+2*(b-40);
        int result2=78+40+2*(a-40)+1;
        int result=Math.max(result1, result2);
        input.close();
        System.out.println(result);
    }
}

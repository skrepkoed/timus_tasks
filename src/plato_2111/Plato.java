package plato_2111;

import java.util.Arrays;
import java.util.Scanner;

public class Plato {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int length=Integer.parseInt(input.nextLine());
        int[] cargo=new int[length];
        int counter=0;
        long sum=0;
        String items[]=input.nextLine().split(" ");
        while (counter<length) {
            int item=Integer.parseInt(items[counter]);
            cargo[counter]=item;
            sum+=item;
            cargo[counter]=item;
            counter+=1;
        }
        Arrays.sort(cargo);
        long taxes=0;
        for (int i : cargo) {
            taxes+=i*sum;
            taxes+=i*(sum-i);
            sum-=i;
        }
        input.close();
        System.out.println(taxes);
    }
}

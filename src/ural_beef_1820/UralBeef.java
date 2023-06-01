package ural_beef_1820;

import java.util.Scanner;

public class UralBeef {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=input.nextLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int k=Integer.parseInt(str[1]);
        int result=0;
        if(n>k){
            n*=2;
            result=n/k;
            if (n%k!=0) {
                result+=1;
            }
        }else{
            result=2;
        }
        input.close();
        System.out.println(result);
    }
}

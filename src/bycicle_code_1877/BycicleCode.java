package bycicle_code_1877;

import java.util.Scanner;

public class BycicleCode {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        int code1=codeToint(inputScanner.nextLine());
        int code2=codeToint(inputScanner.nextLine());
        if(code1%2==0||code2%2==1){
            System.out.println("yes"); 
        }else{
            System.out.println("no");
        }
        inputScanner.close();

    }

    public static int codeToint(String string) {
        String[] array=string.split("");
        int thousands=1000;
        int result=0;
        for (String string2 : array) {
            result+=Integer.parseInt(string2)*thousands;
            thousands/=10;
        }
        return result;
    }
}

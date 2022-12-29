package sms_spam_1567;

import java.util.HashMap;
import java.util.Scanner;

public class SmsSpam {
    final static HashMap<String,Integer>signs=new HashMap<String,Integer>();
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=input.nextLine().split("");
        
        signs.put(".",1);
        signs.put(",",2);
        signs.put("!",3);
        signs.put(" ",1);
        int total_cost=0;
        for (String string : str) {
            total_cost+=cost(string);
        }
        System.out.println(total_cost);
        input.close();
    }
    public static int cost(String letter) {
        int result=0;
        if ((int)letter.charAt(0)==32||(int)letter.charAt(0)==46||(int)letter.charAt(0)==33||(int)letter.charAt(0)==44) {
            result+=signs.get(letter);
        }else{
            if (letter.charAt(0)%3==1) {
                result+=1;
            }else if(letter.charAt(0)%3==2){
                result+=2;
            }else if(letter.charAt(0)%3==0){
                result+=3;
            }
        }
        return result;
    }
}

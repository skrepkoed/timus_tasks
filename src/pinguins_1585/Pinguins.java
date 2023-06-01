package pinguins_1585;

import java.util.Scanner;

public class Pinguins {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=Integer.parseInt(input.nextLine());
        int ep=0;
        int mp=0;
        int lp=0;
        for(int i=0;i<number;i++){
        String str=input.nextLine();
            switch (str) {
            case "Emperor Penguin":
                ep+=1;
            break;
            case "Macaroni Penguin":
                mp+=1;
            break;
            case "Little Penguin":
                lp+=1;
            break;
        }
    }
    if (ep>mp&&ep>lp) {
        System.out.println("Emperor Penguin");
    }else if(mp>ep&&mp>lp){
        System.out.println("Macaroni Penguin");
    }else{
        System.out.println("Little Penguin");
    }
    input.close();
    }
}

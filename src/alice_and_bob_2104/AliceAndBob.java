package alice_and_bob_2104;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int length= Integer.parseInt(input.nextLine());
        ArrayList<String> sideA=new ArrayList<String>(Arrays.asList(input.nextLine().split("")));
        ArrayList<String> sideB=new ArrayList<String>(Arrays.asList(input.nextLine().split("")));
        String answer="";
        int counter=0;
         while (length%2==0) {
            if (counter%2==0) {
                answer=aliceTurn(sideA, sideB, length, answer);
            }else{
                answer=bobTurn(sideA, sideB, length, answer);
            }
            counter+=1;
            length=length/2;
        }
        input.close();
        if (answer.equals("")) {
            answer="Draw";
        }
        System.out.println(answer);
    }

    public static String aliceTurn(ArrayList<String> sideA,ArrayList<String> sideB, int length, String answer) {
        int[]occurr=occurencies(sideA, sideB);
        if (length%2==0) {
            if (occurr[0]>=occurr[2]) {
                out(sideA, sideB);
            }else{
                in(sideA, sideB);
            }
            int[]occur=occurencies(sideA, sideB);
            if (occur[1]==0&&occur[3]==0) {
                return "Alice";
            }
            if (occur[0]==0&&occur[2]==0) {
                return "Bob";
            }
        }else{
            return "Draw";
        }
        return "";
    }
    public static String bobTurn(ArrayList<String> sideA,ArrayList<String> sideB, int length, String answer) {
        int[]occurr=occurencies(sideA, sideB);
        if (length%2==0) {
            if (occurr[1]>=occurr[3]) {
                out(sideA, sideB);
            }else{
                in(sideA, sideB);
            }
            int[]occur=occurencies(sideA, sideB);
            if (occur[1]==0&&occur[3]==0) {
                return "Alice";
            }
            if (occur[0]==0&&occur[2]==0) {
                return "Bob";
            }
        }else{
            return "Draw";
        }
        return "";
    }

    public static void out(ArrayList<String> sideA,ArrayList<String> sideB) {
        for(int i=(sideA.size()/2), k=0;k<sideA.size();i++,k++){
            if (i<sideA.size()) {
                sideB.set(k,sideA.get(i));    
            }else{
                sideB.set(k, "N");
                sideA.set(k, "N");
            }
        }
        sideA.subList(sideA.size()/2,sideA.size()).clear();
        sideB.subList(sideB.size()/2,sideB.size()).clear();
    }
    public static void in(ArrayList<String> sideA,ArrayList<String> sideB) {
        for(int i=sideA.size()-1, k=0;k<sideA.size();i--,k++){
            if (k<i) {
                sideA.set(i,sideB.get(k));    
            }else{
                sideB.set(i, "N");
                sideA.set(i, "N");
            }
        }
        sideA.subList(0, sideA.size()/2).clear();
        sideB.subList(0, sideB.size()/2).clear();
    }
    public static int[] occurencies(ArrayList<String> sideA,ArrayList<String> sideB) {
        int[]occurr={Collections.frequency(sideA, "A"),Collections.frequency(sideA, "B"),
        Collections.frequency(sideB, "A"),Collections.frequency(sideB, "B")};
        return occurr;
    }
}

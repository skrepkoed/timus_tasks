package alice_and_bob_2104;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AliceAndBob {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        long length= Integer.parseInt(input.nextLine());
        ArrayList<String> sideA=new ArrayList<String>(Arrays.asList(input.nextLine().split("")));
        ArrayList<String> sideB=new ArrayList<String>(Arrays.asList(input.nextLine().split("")));
        String answer="";
        int counter=0;
        long frame=frame(length);
        
         while (length%2==0) {
            if (counter%2==0) {
                answer=aliceTurn(sideA, sideB, length, frame, answer);
            }else{
                answer=bobTurn(sideA, sideB, length, frame, answer);
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

    public static long frame(long length) {
        while(length%2==0&&length>2){
            length=length/2;
        }
        return length;
    }

    public static String aliceTurn(ArrayList<String> sideA,ArrayList<String> sideB, long length,long frame, String answer) {
        //int[]occurr=occurencies(sideA, sideB);
        if (length%2==0) {
            if (count_wins(sideA, frame, "A")>=count_wins(sideB, frame, "A")) {
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
    public static String bobTurn(ArrayList<String> sideA,ArrayList<String> sideB, long length, long frame, String answer) {
        //int[]occurr=occurencies(sideA, sideB);
        if (length%2==0) {
            if (count_wins(sideA, frame, "B")>=count_wins(sideB, frame, "B")) {
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
    public static long count_wins(ArrayList<String> side, long frame, String color) {
        long result=0;
        for(int i=0, k=(int)frame-1;i<side.size();i+=frame, k+=frame){
                if (Collections.frequency(side.subList(i, k), color)==side.subList(i, k).size()) {
                    result+=1;
                }
        }
        return result;
    }
    public static int[] occurencies(ArrayList<String> sideA,ArrayList<String> sideB) {
        int[]occurr={Collections.frequency(sideA, "A"),Collections.frequency(sideA, "B"),
        Collections.frequency(sideB, "A"),Collections.frequency(sideB, "B")};
        return occurr;
    }
}

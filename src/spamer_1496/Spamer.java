package spamer_1496;

import java.util.HashMap;
import java.util.Scanner;

public class Spamer {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        int size=Integer.parseInt(inputScanner.nextLine());
        HashMap<String,Integer>hash=new HashMap<>();
        int hashSize=hash.size();
        HashMap<String, Integer> resultHash=new HashMap<>();
        for(int i=0;i<size;i++){
            String str=inputScanner.nextLine();
            hash.putIfAbsent(str, 1);
            if (hashSize==hash.size()) {
                resultHash.putIfAbsent(str, 1);
            }
            hashSize=hash.size();
        }
        inputScanner.close();
        System.out.println(resultHash.keySet().stream().reduce("", (a,b)->a+b+"\n").trim());
    }
}

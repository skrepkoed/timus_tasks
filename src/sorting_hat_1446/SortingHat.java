package sorting_hat_1446;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SortingHat {
    public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        HashMap<String,ArrayList<String>>hash=new HashMap<>();
        hash.put("Gryffindor", new ArrayList<String>());
        hash.put("Hufflepuff", new ArrayList<String>());
        hash.put("Slytherin", new ArrayList<String>());
        hash.put("Ravenclaw", new ArrayList<String>());
        int size=Integer.parseInt(inputScanner.nextLine());
        for(int i=0;i<size;i++){
            String name=inputScanner.nextLine();
            String faculty=inputScanner.nextLine();
            hash.get(faculty).add(name);
        }
        System.out.println("Slytherin:");
        System.out.println(hash.get("Slytherin").stream().reduce("", (a,b)->a+b+"\n"));
        System.out.println("Hufflepuff:");
        System.out.println(hash.get("Hufflepuff").stream().reduce("", (a,b)->a+b+"\n"));
        System.out.println("Gryffindor:");
        System.out.println(hash.get("Gryffindor").stream().reduce("", (a,b)->a+b+"\n"));
        System.out.println("Ravenclaw:");
        System.out.println(hash.get("Ravenclaw").stream().reduce("", (a,b)->a+b+"\n"));
        inputScanner.close();
    }
}

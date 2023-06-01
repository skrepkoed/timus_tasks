package sandros_book_1723;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SandrosBook {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String spell=input.nextLine();
        String[] arr=spell.split("");
        HashMap<String,ArrayList<Integer>>sequences=new HashMap<String,ArrayList<Integer>>();
        for(int i=0;i<arr.length;i++){
            if (sequences.get(arr[i])==null) {
                ArrayList<Integer> indexes=new ArrayList<Integer>();
                indexes.add(i);
                sequences.put(arr[i],indexes);
            }else{
                sequences.get(arr[i]).add(i);
            }
        }
        for (String letter : sequences.keySet()) {
            ArrayList<Integer>indexes=sequences.get(letter);
            ArrayList<Integer>new_indexes=new ArrayList<Integer>();
            if (indexes.size()==1) {
              new_indexes.add(0);
            }else{
            for(int i=0;i<indexes.size()-1;i++){
                new_indexes.add(indexes.get(i+1)-indexes.get(i));
            }}
            sequences.put(letter, new_indexes);
        }
        HashMap<Integer,Integer> freq= new HashMap<Integer,Integer>();
        for (String letter : sequences.keySet()) {
            ArrayList<Integer>indexes=sequences.get(letter);
            for (Integer indexInteger : indexes) {
                if (freq.get(indexInteger)==null) {
                    freq.put(indexInteger, 1);
                }else{
                    freq.put(indexInteger, freq.get(indexInteger)+1);
                }
            }
        }
        int most_freq=Collections.max(freq.values());
        
        String result="";
        int counter=0;
        for(int i=0;i<arr.length;i++){
          if (i+most_freq<arr.length) {
            
          
          if (arr[i].equals(arr[i+most_freq])&&counter<most_freq) {
            result+=arr[i];
            counter+=1;
          }else{
            counter=0;
          }}
        }
        if (Collections.min(freq.keySet())==0) {
          result+=spell;  
        }
        System.out.println(freq);
    }
}

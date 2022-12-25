package day_of_knowledge_2115;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DayOFKnowledge {
  public static void main(String[] args) {
    Scanner inputScanner=new Scanner(System.in);
    long length = Long.parseLong(inputScanner.nextLine());
    String [] line=inputScanner.nextLine().split(" ");
    ArrayList <Long> lineNumbers= new ArrayList<Long>();

    for (String str : line) {
      lineNumbers.add(Long.parseLong(str));
    }
    ArrayList <Integer> result1=new ArrayList<Integer>();
    ArrayList <Integer> result2=new ArrayList<Integer>();
    ArrayList <Long> assert_increase=new ArrayList<Long>();
    ArrayList <Long> assert_decrease=new ArrayList<Long>();
    assert_increase.addAll(lineNumbers);
    assert_decrease.addAll(lineNumbers);
    Collections.sort(assert_increase);
    for(int i=0;i<lineNumbers.size();i++){
      if (lineNumbers.get(i)!=assert_increase.get(i)) {
        result1.add(i);
      }
    }
    Collections.sort(assert_decrease, Collections.reverseOrder());
    for(int i=0;i<lineNumbers.size();i++){
      if (lineNumbers.get(i)!=assert_decrease.get(i)) {
        result2.add(i);
      }
    }
    
    
    if (result1.size()==0||result2.size()==0) {
      System.out.println("Nothing to do here");
    }else if(result1.size()==2||result2.size()==2){
      System.out.println("Yes");
      if (result1.size()==2) {
        System.out.println(result1.get(0)+1+" "+(result1.get(1)+1));  
      }else{
        System.out.println(result2.get(0)+1+" "+(result2.get(1)+1));
      }   
    }else{
      System.out.println("No hope");
    }
    inputScanner.close();
  }
}

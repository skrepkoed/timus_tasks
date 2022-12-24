package long_condition_2011;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class LongCondition {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int length=Integer.parseInt(input.nextLine());
        int[] letters=new int[length];
        int counter=0;
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        String items[]=input.nextLine().split(" ");
        input.close();
        while (counter<length) {
            int item=Integer.parseInt(items[counter]);
            if(freq.get(item)==null){
                freq.put(item, 1);
            }else{
                freq.put(item, freq.get(item)+1);
            }
            letters[counter]=item;
            letters[counter]=item;
            counter+=1;
        }
        if (freq.keySet().size()<3) {
            if (length>=6&&freq.keySet().size()==2) {
                System.out.println("Yes");
            }else if(freq.keySet().size()==2&&Collections.max(freq.values())!=length-1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("Yes");
        }

    }
}

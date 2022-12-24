package long_condition_2011;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class LongCondition {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int length=Integer.parseInt(input.nextLine());
        int[] letters=new int[length];
        int counter=0;
        long sum=0;
        HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
        String items[]=input.nextLine().split(" ");
        while (counter<length) {
            int item=Integer.parseInt(items[counter]);
            if(freq.get(item)==null){
                freq.put(item, 1);
            }else{
                freq.put(item, freq.get(item)+1);
            }
            letters[counter]=item;
            sum+=item;
            letters[counter]=item;
            counter+=1;
        }

    }
}

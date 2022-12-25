package team_work_1581;

import java.util.HashMap;
import java.util.Scanner;

public class TeamWork {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int length= Integer.parseInt(input.nextLine());
        String[]str=input.nextLine().split(" ");
        int[]numbers=new int[length];
        for(int i=0;i<length;i++){
            numbers[i]=Integer.parseInt(str[i]);
        }
        HashMap<Integer,Integer> at_row=new HashMap<Integer,Integer>();
        String result_string="";
        for (int i=0; i<numbers.length;i++) {
            if (at_row.get(numbers[i])==null) {
                if (!at_row.keySet().isEmpty()) {
                    result_string+=result_string(at_row.get(numbers[i-1]),numbers[i-1]);
                    at_row.remove(numbers[i-1]);
                }
                at_row.put(numbers[i], 1);
            }else{
                at_row.put(numbers[i], at_row.get(numbers[i])+1);
            }
        }
        result_string+=result_string(at_row.get(numbers[length-1]), numbers[length-1]);
        System.out.println(result_string);
        input.close();
    }
    public static String result_string(int i, int k){
        String str="";
        return str+=i+" "+k+" ";
    }
}

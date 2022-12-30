package british_scientists_1925;

import java.util.Scanner;

public class BritishScientist {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] first_line=input.nextLine().split(" ");
        int years=Integer.parseInt(first_line[0]);
        int today_number=Integer.parseInt(first_line[1]);
        int counter=0;
        int sum=0;
        int entered_sum=0;
        while(counter<years){
            String [] numbers= input.nextLine().split(" ");
            sum+=Integer.parseInt(numbers[0]);
            entered_sum+=Integer.parseInt(numbers[1]);
            counter+=1;
        }
        sum-=years*2;
        sum+=today_number-2;
        if (sum-entered_sum>=0) {
            System.out.println(sum-entered_sum);
        }else{
            System.out.println("Big Bang!");
        }
        input.close();
    }
}

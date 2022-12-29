package one_step_before_happinness;

import java.util.Scanner;

public class OneStepBeforeHappiness {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int ticket=Integer.parseInt(input.nextLine());
        int step_back=ticket-1;
        int step_forward=ticket+1;
        if (happy(step_back)||happy(step_forward)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        input.close();
    }
    public static boolean happy(int ticket) {
        int[] result1=sum_of_three_digits(ticket);
        int []result2=sum_of_three_digits(result1[0]);
        if (result1[1]==result2[1]) {
            return true;
        }else{
            return false;
        }     
    }

    public static int[] sum_of_three_digits(int ticket) {
        int counter=0;
        int result=0;
        while(counter<3){
            result+=ticket%10;
            ticket=(ticket-(ticket%10))/10;
            counter+=1;
        }
        int[] arr={ticket,result};
        return arr;
    }
}

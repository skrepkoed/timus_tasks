package simple_expression_2066;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleExpression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=Integer.parseInt(input.nextLine());
        int b=Integer.parseInt(input.nextLine());
        int c=Integer.parseInt(input.nextLine());
        int[]arr={a,b,c};
        Arrays.sort(arr);
        int result=0;
        if ((arr[0]==0&&arr[1]==1)||(arr[0]==arr[1]&&(arr[0]==1||arr[1]==0))) {
            result=arr[0]-arr[1]-arr[2];
        }else{
            result=arr[0]-(arr[1]*arr[2]);
        }
       
        System.out.println(result);
        input.close();
    }
}

package stipendium_2056;

import java.util.Scanner;

public class Stipendium {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int length= Integer.parseInt(input.nextLine());
        int sum=0;
        int counter=0;
        String result="";
        while (counter<length) {
            int number=Integer.parseInt(input.nextLine());
            if (number==3) {
                result="None";
                break;
            }
            sum+=number;
            counter+=1;
        }
        double average=sum/(double)length;
        if(result.equals("")){if (average==5) {
            result="Named";
        }else if(average<5&&average>=4.5){
            result="High";
        }else{
            result="Common";
        }}   
        System.out.println(result);  
        input.close();
    }
}

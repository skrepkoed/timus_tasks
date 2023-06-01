package wedding_dinner_2100;

import java.util.Scanner;

public class WeddingDinner {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size=Integer.parseInt(input.nextLine());
        int result=200;
        int guests=2;
        for(int i=0;i<size;i++){
            String[]strarray=input.nextLine().split("\\+");
            if (strarray.length==1) {
                result+=100;
                guests+=1;
            }else{
                result+=200;
                guests+=2;
            }
        }
        if (guests==13) {
            result+=100;
        }
        System.out.println(result);
        input.close();
    }
}

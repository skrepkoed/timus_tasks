package hidden_passsage_1910;
import java.util.Scanner;
public class HiddenPassage {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int length= Integer.parseInt(input.nextLine());
        String[]str=input.nextLine().split(" ");
        int[]numbers=new int[length];
        for(int i=0;i<length;i++){
            numbers[i]=Integer.parseInt(str[i]);
        }
        int sum=0;
        int index=0;
        for(int i=0;i<numbers.length-2;i++){
            int a=numbers[i];
            int b=numbers[i+1];
            int c=numbers[i+2];
            if (a+b+c>sum) {
                sum=a+b+c;
                index=i+1;
            }
        }
        System.out.println(sum+" "+(index+1));
        input.close();
    }
}

package battle_by_the_swamp_1991;
import java.util.Scanner;

public class BattleBySwamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] items1=input.nextLine().split(" ");
        String[] items2=input.nextLine().split(" ");
        int droid_n=Integer.parseInt(items1[0]);
        int droid_k=Integer.parseInt(items1[1]);
        int[]bombs=new int[items2.length];
        int counter=0;
        int residual_bombs=0;
        int residual_droids=0;
        for (String i : items2) {
            bombs[counter]=Integer.parseInt(i);
            counter+=1;
        }
        for(int i=0;i<droid_n;i++){
            int number=droid_k;
            number-=bombs[i];
            if (number>0) {
                residual_droids+=number;
            }else{
                residual_bombs+=Math.abs(number);
            }
        }
        System.out.println(residual_bombs+" "+residual_droids);
        input.close();
    }
}

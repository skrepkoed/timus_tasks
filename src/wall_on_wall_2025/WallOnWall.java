package wall_on_wall_2025;

import java.util.ArrayList;
import java.util.Scanner;
public class WallOnWall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int tests= Integer.parseInt(input.nextLine());
        ArrayList<Integer>result=new ArrayList<Integer>();
        while(tests>0){
            String[] str=input.nextLine().split(" ");
            int fighters=Integer.parseInt(str[0]);
            int teams =Integer.parseInt(str[1]);
            //int ratio=2*(teams-1)
            
            int[] distribution=new int[teams];
            int counter_fighters=0;
            int counter=0;
            int number=fighters;
            while(counter<fighters){
                counter+=teams;
                if (number-teams>0) {
                    counter_fighters=teams;
                    number-=teams;
                }else{
                    counter_fighters=number;
                }
                for(int i=0;i<counter_fighters;i++){
                    distribution[i]+=1;
                }
            }
            int test_result=count_fights(fighters);
            for (int team : distribution) {
                test_result-=count_fights(team);
            }

            result.add(test_result);
            tests-=1;
        }
        for (Integer item : result) {
            System.out.println(item);
        }
        input.close();
    }
    public static int count_fights(int fighters) {
        return (fighters-1)*fighters/2;
    }
}

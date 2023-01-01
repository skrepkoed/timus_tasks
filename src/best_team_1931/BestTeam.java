package best_team_1931;
import java.util.Scanner;

public class BestTeam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int length=Integer.parseInt(input.nextLine());
        long [] badness=new long[length];
        String[]items=input.nextLine().split(" ");
        int counter=0;
        for (String string : items) {
            badness[counter]=Integer.parseInt(string);
            counter+=1;
        }
        long candidat=badness[0];
        int badness_counter=0;
        int i=1;
        int pirate=1;
        long[]result={1,0};
        for (long bad : badness) {
            if (bad<candidat) {
                candidat=bad;

                if (badness_counter>result[1]) {
                    
                    result[0]=pirate;
                    result[1]=badness_counter;
                }
                pirate=i;
                badness_counter=1;
                i+=1;
            }else{
                badness_counter+=1;
                i+=1;
            }
        }
        System.out.println(result[0]);
    }
}

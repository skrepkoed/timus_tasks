package elections_1263;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] str=input.nextLine().split(" ");
        int candidat=Integer.parseInt(str[0]);
        int electors= Integer.parseInt(str[1]);
        int counter=0;
        HashMap<Integer,Integer> results=new HashMap<Integer,Integer>();
        ArrayList<Integer> candidats=new ArrayList<Integer>();
        int cand_counters=1;
        while (cand_counters<=candidat) {
            candidats.add(cand_counters);
            results.put(cand_counters, 0);
            cand_counters+=1;
        }
        while (counter<electors) {
            int vote=Integer.parseInt(input.nextLine());
            results.put(vote, results.get(vote)+1);
            counter+=1;
        }
        candidats.sort(null);
        input.close();
        for (int result : candidats) {
            String result1=String.format("%.2f", results.get(result)*100/(double)electors) ;
            System.out.println(result1+"%");
        }

    }
}

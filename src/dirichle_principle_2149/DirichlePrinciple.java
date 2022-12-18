package dirichle_principle_2149;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DirichlePrinciple {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int length=Integer.parseInt(input.nextLine());
    String str =input.nextLine();
    String garbage=input.nextLine();
    garbage=input.nextLine();
    input.close();
    ArrayList <String> pigeons=new ArrayList<String>(Arrays.asList(str.replaceAll("(\\.|@)", "").split("")));
    test1(pigeons);
    int[] analyz1=test1(pigeons);
    int[] analyz2=test2(pigeons);
    int analyztest1=Math.min(analyz1[0], analyz1[1]);
    int analyztest2=Math.min(analyz2[0], analyz2[1]);
    System.out.println(Math.min(analyztest1, analyztest2));
  }
  public static int[] test1(ArrayList<String> pigeons) {
    int variant1=0;
    int variant2=0;
    for(int i=0;i<pigeons.size();i++){
      if (i%2==0&&pigeons.get(i).equals("<")) {
        variant1+=1;
      }
      if (i%2==1&&pigeons.get(i).equals(">")) {
        variant1+=1;
      }
    }
    for(int i=0;i<pigeons.size();i++){
      if (i%2==0&&pigeons.get(i).equals(">")) {
        variant2+=1;
      }
      if (i%2==1&&pigeons.get(i).equals("<")) {
        variant2+=1;
      }
    }
    int[] result={variant1,variant2};
    return result;
  }
  public static int[] test2(ArrayList<String> pigeons) {
    int variant1=0;
    int variant2=0;
    for(int i=0;i<pigeons.size();i++){
      if (i<pigeons.size()/2&&pigeons.get(i).equals("<")) {
        variant1+=1;
      }
      if (i>=pigeons.size()/2&&pigeons.get(i).equals(">")) {
        variant1+=1;
      }
    }
    for(int i=0;i<pigeons.size();i++){
      if (i<pigeons.size()/2&&pigeons.get(i).equals(">")) {
        variant2+=1;
      }
      if (i>=pigeons.size()/2&&pigeons.get(i).equals("<")) {
        variant2+=1;
      }
    }
    int[] result={variant1,variant2};
    return result;
  }
}

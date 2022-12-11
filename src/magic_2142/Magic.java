package magic_2142;

import java.util.Scanner;
public class Magic {
    public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      Mana mana = new Mana(input.nextLine());
      Mana cost = new Mana(input.nextLine());
      input.close();
      magic_eval(mana, cost);        
    }
    public static void magic_eval(Mana mana, Mana cost) {
        long red_diff=mana.red_mana-cost.red_mana;
        long blue_diff=mana.blue_mana-cost.blue_mana;
        if (red_diff<0&&red_diff+mana.red_blue_mana>=0) {
            mana.red_blue_mana+=red_diff;
            red_diff=0;
        }
        if (blue_diff<0&&blue_diff+mana.red_blue_mana>=0) {
            mana.red_blue_mana+=blue_diff;
            blue_diff=0;
        }
        if (red_diff>0&&blue_diff>0) {
            mana.red_blue_mana+=red_diff+blue_diff;
        }else if(red_diff>0){
            mana.red_blue_mana+=red_diff;
        }else if(blue_diff>0){
            mana.red_blue_mana+=blue_diff;
        }
        long red_blue_diff=mana.red_blue_mana-cost.red_blue_mana;
        if (blue_diff>=0&&red_diff>=0&&red_blue_diff>=0) {
          System.out.println("It is a kind of magic");
        }else{
          System.out.println("There are no miracles in life");
        }
    }
    
}

class Mana {
  long red_mana;
  long blue_mana;
  long red_blue_mana;
  public Mana(String str) {
    String [] number_string=str.split(" ");
    red_mana=Integer.parseInt(number_string[0]);
    blue_mana= Integer.parseInt(number_string[1]);
    red_blue_mana=Integer.parseInt(number_string[2]);
  }
}

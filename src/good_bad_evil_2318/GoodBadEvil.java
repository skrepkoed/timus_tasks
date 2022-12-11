package good_bad_evil_2318;

import java.util.Scanner;

public class GoodBadEvil {
    public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      String computer_type=input.nextLine();
      long number =input.nextLong();
      if (computer_type.equals("BAD")) {
        System.out.println(bad_decoder(number));
      }else{
        System.out.println(good_decoder(number));
      }
       input.close(); 
    }

    public static long bad_decoder(long number) {
        double power=3;
        double reverse_power=0;
        double remainder=0;
        long result=0;
        while (power>=0){
          remainder=number/(long)Math.pow(256, power);
          number-=remainder*(long)Math.pow(256, power);
          result+= remainder*Math.pow(256, reverse_power);
          power-=1;
          reverse_power+=1;
        }
        return result;
    }

    public static long good_decoder(long number) {
      double power=0;
        double reverse_power=3;
        double remainder=0;
        long result=0;
        while (power<=3){
          remainder=number/(long)Math.pow(256, reverse_power);
          number-=remainder*(long)Math.pow(256, reverse_power);
          result+= remainder*Math.pow(256, power);
          power+=1;
          reverse_power-=1;
        }
        return result;
    }
}

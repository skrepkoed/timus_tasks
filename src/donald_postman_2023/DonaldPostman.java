package donald_postman_2023;

import java.util.HashMap;
import java.util.Scanner;

public class DonaldPostman {
    public static void main(String[] args) {
        int start=0;
        HashMap<String, Integer>mailBoxes=new HashMap<String,Integer>();
        String[] mailBox0={"Alice","Ariel","Aurora","Phil","Peter","Olaf","Phoebus","Ralph","Robin"};
        String[]mailBox1={"Bambi","Belle","Bolt","Mulan","Mowgli","Mickey","Silver","Simba","Stitch"};
        String[]mailBox2={"Dumbo","Genie","Jiminy","Kuzko","Kida","Kenai","Tarzan","Tiana","Winnie"};
        for (String string : mailBox0) {
            mailBoxes.put(string,0);
        }
        for (String string : mailBox1) {
            mailBoxes.put(string, 1);
        }
        for (String string : mailBox2) {
            mailBoxes.put(string, 2);
        }
        Scanner input=new Scanner(System.in);
        int counter=0;
        String[]letters=new String[Integer.parseInt(input.nextLine())];
        while(counter<letters.length){
            letters[counter]=input.nextLine();
            counter+=1;
        }
        int steps=0;
        for (String string : letters) {
            steps += Math.abs(mailBoxes.get(string)-start);
            start=mailBoxes.get(string);
        }
        input.close();
        System.out.println(steps);
    }
}

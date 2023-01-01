package hieroglyphs_1545;

import java.util.ArrayList;
import java.util.Scanner;

public class Hieroglyphs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lenght= Integer.parseInt(input.nextLine());
        int counter=0;
        String[] hieroglyphs=new String[lenght];
        while (counter<lenght) {
            hieroglyphs[counter]=input.nextLine();
            counter+=1;
        }
        String letter=input.nextLine();
        ArrayList<String>result=new ArrayList<String>();
        for (String string : hieroglyphs) {
            if (string.split("")[0].equals(letter)) {
                result.add(string);
            }
        }
        for (String resulString : result) {
            System.out.println(resulString);
        }
        input.close();
    }
}

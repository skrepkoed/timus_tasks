package drowned_tears_1935;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DrownedTears {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int skins=Integer.parseInt(input.nextLine());
        String[] pages_str=input.nextLine().split(" ");
        ArrayList <Integer> pages= new ArrayList<Integer>();
        for (String page_String : pages_str) {
            pages.add(Integer.parseInt(page_String));
        }
        Collections.sort(pages);
        int book=2*pages.get(0);
        int pages_before_skin=pages.get(0);
        for(int i=1; i<pages.size();i++){
            if(pages.get(i)-pages_before_skin>0){
                book+=pages.get(i)-pages_before_skin;
            }
            book+=pages.get(i);
            pages_before_skin=pages.get(i);
        }
        
        System.out.println(book);
    }
}

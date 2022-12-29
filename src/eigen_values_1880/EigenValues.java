package eigen_values_1880;

import java.util.HashMap;
import java.util.Scanner;

public class EigenValues {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] first=initialize(input);
        int[] second=initialize(input);
        int[] third=initialize(input);
        HashMap<Integer,Integer> eigen=new HashMap<Integer,Integer>();
        int[][]values={first,second,third};
        int result=0;
        for (int[] is : values) {
            for (int is2 : is) {
                if (eigen.get(is2)==null) {
                    eigen.put(is2, 1);
                }else{
                    eigen.put(is2, eigen.get(is2)+1);
                    if (eigen.get(is2)==3) {
                        result+=1;
                    }
                }
            }
        }
        System.out.println(result);
        input.close();
    }

    public static int[] initialize(Scanner input) {
        int[] first=new int[Integer.parseInt(input.nextLine())];
        String[]items1=input.nextLine().split(" ");
        int counter=0;
        for (String string : items1) {
            first[counter]=Integer.parseInt(string);
            counter+=1;
        }
        return first;
    }
}

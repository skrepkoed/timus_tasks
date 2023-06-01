package about_sport_1313;
import java.util.Arrays;
import java.util.Scanner;

public class AboutSport{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=Integer.parseInt(input.nextLine());
        int[][]array=new int[size][size];
        for (int i=0;i<size;i++) {
            String[] string=input.nextLine().split(" ");
            array[i]=Arrays.stream(string).mapToInt(Integer::parseInt).toArray(); 
        }
        String result="";
        for(int i=0;i<2*size;i++){
            int k=0;
            if (isInIndex(i, size-1)) {
                result+=array[i][k]+" ";    
            }
            int y=i;
            int x=k;
            while(!isInIndex(y, size)){
                y-=1;
                x+=1;
            }
            while(isInIndex(y-1, size-1)&&isInIndex(x+1, size-1)){
                x+=1;
                y-=1;
                result+=array[y][x]+" ";
            }

        }
        System.out.println(result);
        input.close();
    }
    public static boolean isInIndex(int number, int bound) {
        if (number>=0&&number<=bound) {
            return true;
        }
        return false;
    }
}

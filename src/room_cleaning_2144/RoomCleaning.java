package room_cleaning_2144;

import java.util.Arrays;
import java.util.Scanner;

public class RoomCleaning {
    public static void main(String[] args) {
      String answer="YES";
      Scanner input_int=new Scanner(System.in);
      int count= Integer.parseInt(input_int.nextLine());
      int counter=0;
      Box[] boxArray=new Box[count];
      while(counter!=boxArray.length){
        boxArray[counter]=new Box(input_int.nextLine());
        if (!boxArray[counter].flag) {
          answer="NO";
        }  
        counter+=1;
      }
      Arrays.sort(boxArray);
      int[] variants=new int[boxArray[boxArray.length-1].tallest_hero+1];
      for(int i=0;i<variants.length;i++){
        variants[i]=i;
      }
      for (Box box : boxArray) {
        if (!(box.shortest_hero==box.tallest_hero)) {
          for(int i=box.shortest_hero+1;i<box.tallest_hero;i++){
            if(variants[i]!=0){
              variants[i]=0;
            }else{
              answer="NO";
              break;
            }   
          }
        }else{
          variants[box.shortest_hero]=0;
        }
      }
      
      for(int i=0; i<boxArray.length;i++){
        if (boxArray[i].flag==false) {
          answer="NO";
          break;
        }
        
      }
      
      input_int.close();
      System.out.println(answer);
    }
}

class Box implements Comparable<Box>{
  int shortest_hero=0;
  int tallest_hero=0;
  boolean flag=true;
  int[] for_comparsion;
  int comparable;
  public int compareTo(Box other_box) {
    return Integer.compare(tallest_hero,other_box.tallest_hero);
  }
  public Box(String box_params) {
    String[] params_array=box_params.split(" ");
    int[] height_values= new int[Integer.parseInt(params_array[0])];
    for(int i=0; i<height_values.length;i++){
      height_values[i]=Integer.parseInt(params_array[i+1]);
      if (i==0) {
        shortest_hero=height_values[i];
        tallest_hero=height_values[i];
      }else{
        if (height_values[i-1]>height_values[i]) {
          flag=false;
        }else{
          tallest_hero=height_values[i];
        }
      }
    }
  }
}

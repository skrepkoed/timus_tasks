package history_exam_1196;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class HistoryExam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int teacher_list_length=Integer.parseInt(input.nextLine());
        long[]teacher_list=new long[teacher_list_length];
        for(int i=0;i<teacher_list_length;i++){
            teacher_list[i]=Integer.parseInt(input.nextLine());
        }
        int student_list_length=Integer.parseInt(input.nextLine());
        long[]student_list=new long[student_list_length];
        for(int i=0;i<student_list_length;i++){
            student_list[i]=Integer.parseInt(input.nextLine());
        }
        Arrays.sort(student_list);
        HashMap<Long,Integer>true_dates=new HashMap<Long,Integer>();
        HashMap<Long,Integer>student_dates=new HashMap<Long,Integer>();
        freq_dates(student_dates, student_list);
        freq_dates(true_dates, teacher_list);
        int result=0;
        for (long l : teacher_list) {
            if (student_dates.get(l)!=null) {
                result+=student_dates.get(l);
                student_dates.remove(l);
            }
        }
        System.out.println(result);
        input.close();

    }
    public static void freq_dates(HashMap<Long,Integer> hash,long[]list) {
        for (long l : list) {
            if (hash.get(l)==null) {
                hash.put(l, 1);
            }else{
                hash.put(l, hash.get(l)+1);
            }
        }
    }
}

package ahmeteg;

import java.util.*;

public class StudentKElement {
    public static void main(String[] args) {
        String[] positive_feedback=new String[]{"smart","brilliant","studious"};
        String[] negative_feedback=new String[]{"not"};
        String[] report=new String[]{"this student is studious","the student is smart"};
        int[] student_id=new int[]{1,2};
        topStudents(positive_feedback,negative_feedback,report,student_id,2).forEach(System.out::println);
    }
    public static List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {

        HashSet<String> positive=new HashSet();
        HashSet<String> negative=new HashSet();
       List<Student> students=new ArrayList<>();

        for(int i=0;i<positive_feedback.length;i++){
            positive.add(positive_feedback[i]);

        }
        for(int i=0;i<negative_feedback.length;i++){
            negative.add(negative_feedback[i]);
        }

        for(int i=0;i<report.length;i++){
            int point=0;
            for(String s:report[i].split(" ")){
                if(positive.contains(s)){
                    point+=3;

                }
                if(negative.contains(s)){
                   point--;
                }
            }
            Student st=new Student(student_id[i],point);
            students.add(st);
        }



        List<Integer> result=new ArrayList<>();

        result= students.stream().sorted((o1, o2) -> {
            int i=o2.point.compareTo(o1.point);
            if(i==0) return o1.id.compareTo(o2.id);
            else return i;
        }).map(e->e.id).limit(k).sorted().toList();
       return result;

    }
    record Student(Integer id,Integer point){}
}

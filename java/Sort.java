package array_list;
import java.util.*;
public class Sort{
    public static void main(String args[]) {
        Students stu1 = new Students(10,"vinay","telangana");
        Students stu2= new Students(20,"vamshi","khammam"); 
        Students stu3 = new Students(30,"lucky","hyderabad");
       
        ArrayList<Students>student = new ArrayList<>();
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        
         for(Students obj:student){
             System.out.println(obj);
         }

         Collections.sort(student,new Sortmain());
         for(Students obj:student){
            System.out.println(obj);
         }
        Collections.sort(student,new Comparator<Student>(){
            public int compare(Students obj1,Students obj2){
                 return obj1.getPlace().compareTo(obj2.getPlace()); 
            }

        });


    }
    
}
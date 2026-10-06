//Java Program to demonstrate the use of Java Comparator  
import java.util.*;  
class StudentOrderCheck{  
    public static void main(String args[]){  
        //Creating a list of students  
        ArrayList<Student> studentList=new ArrayList<Student>();  
        studentList.add(new Student(101,"Ana",23));  
        studentList.add(new Student(106,"Pepe",27));  
        studentList.add(new Student(105,"Laura",21));  
        System.out.println("Sorting by Name");  
        //Using NameComparator to sort the elements  
        Collections.sort(studentList,new NameComparator());  
        //Traversing the elements of list  
        for(Student st: studentList){  
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
        }  
        System.out.println("Sorting in reverse order by Age");  
        //Using AgeComparator to sort the elements in reverse order
        Collections.sort(studentList,Collections.reverseOrder(new AgeComparator())); 
        //Travering the list again  
        for(Student st: studentList){  
            System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
        }  
    }  
}  
/**
 * Java Program to demonstrate the use of Java Comparator.  
 * Creating a class which implements Comparator Interface 
 */  
import java.util.*;  
import java.io.*;  
class Student {  
    private int rollno;   //roll number
    private String name;  //name of the student
    private int age;      //age of the student

    /**
     * Constructor for Student objects. 
     * This constructor creates a new Student object.
     */
    Student(int rollno,String name,int age){  
        this.rollno=rollno;  
        this.name=name;  
        this.age=age;  
    }   
    
    /**
     * Method that returns the field rollno
     *
     * @return    the field rollno
     */
    public int getRollno()
    {
        
        return rollno;
    }

     /**
     * Method that returns the field name
     *
     * @return    the field name
     */
    public String getName()
    {
        
        return name;
    }
    
         /**
     * Method that returns the field age
     *
     * @return    the field name
     */
    public int getAge()
    {
        
        return age;
    }
    
} 
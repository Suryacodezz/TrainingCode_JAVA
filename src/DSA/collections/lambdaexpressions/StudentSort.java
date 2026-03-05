package DSA.collections.lambdaexpressions;


import java.util.ArrayList;
import java.util.Collections;

class Student {
    int id;
    String name;
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(101,"rahaul"));
        list.add(new Student(100,"ram"));
        list.add(new Student(102,"raj"));
        for (Student s:list) {
            System.out.println(s.id+", "+s.name);
        }
       Collections.sort(list,(s1, s2) -> s1.id - s2.id);
        for (Student s: list){
            System.out.println(s.id+", "+s.name);
        }
    }
}

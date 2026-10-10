package Day4;
import java.util.*;
import java.util.ArrayList;

class Student {
    String name;
    int rn;
    int age;
    int marks;

    Student(String name, int rn, int age, int marks) {
        this.name = name;
        this.rn = rn;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rn=" + rn + ", age=" + age + ", marks=" + marks + "}";
    }
}
    public class pojo {
        public static void main(String[] args) {
            List<Student> l = new ArrayList<>(5);
            l.add(new Student("yash", 1, 22, 25));
            l.add(new Student("ash", 2, 23, 10));
            l.add(new Student("ysh", 3, 24, 20));
            l.add(new Student("kp", 5, 25, 25));
            l.add(new Student("pt", 4, 26, 26));
            System.out.print(l);
            Collections.sort(l, (Student s1, Student s2) -> Integer.compare(s1.age, s2.age));
            System.out.println(l);
        }
    }
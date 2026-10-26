package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class stream {
    public static void main(String[] args) {
        ArrayList<Integer> i=new ArrayList<>();
        ArrayList<String> s=new ArrayList<>();
        i.stream();
        s.stream();
        i.add(3);
        i.add(1);
        i.add(4);
        s.add("my");
        s.add("your");
        i.stream().filter(n->n>2);
        i.stream().filter(num -> num > 2).forEach(num -> System.out.println("Filtered int: " + num));

                i.stream().forEach(System.out::println);// method reference
              long count=s.stream().filter(str->str.length()>2).count(); //using lambda
        System.out.println(count);


    }
}

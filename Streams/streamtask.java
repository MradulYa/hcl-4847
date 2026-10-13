package Streams;

import java.util.ArrayList;
import java.util.List;

public class streamtask {
    static class people {
        String name;
        String gender;

        public people(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public static void main(String[] args) {
            ArrayList<people> n = new ArrayList<>();
            n.add(new people("parteek", "male"));
            n.add(new people("lamal", "male"));
            n.add(new people("kamli", "female"));
            n.stream().map(d->{
                if(d.gender=="male") return "mr."+d.name;
                return "miss. "+d.name;
            }).forEach(System.out::println);
        }
    }
}
package androidTutorial.collection;

import java.util.ArrayList;

public class Main {
    
public static void main(String[] args) {

    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("greg", 03));
    students.add(new Student("sarah", 05));
    

    for (Student s : students) {
        System.out.println(s.getId());
        System.out.println(s.getName());

    }
}
}
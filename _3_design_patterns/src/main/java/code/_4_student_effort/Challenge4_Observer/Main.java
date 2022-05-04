package code._4_student_effort.Challenge4_Observer;

import code._2_challenge._4_observer.Student;
import code._2_challenge._4_observer.Teacher;

public class Main {
    public static void main(String[] args) {
        code._2_challenge._4_observer.Teacher teacher = new Teacher();
        code._2_challenge._4_observer.Student s01 = new code._2_challenge._4_observer.Student("Popescu");
        code._2_challenge._4_observer.Student s02 = new code._2_challenge._4_observer.Student("Ionescu");
        code._2_challenge._4_observer.Student s03 = new Student("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        teacher.unregister(s01);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for (int i = 0; i < javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}

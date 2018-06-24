import java.util.function.Function;

public class Task9 {
    public static void main(String[] args) {

        Student jSmith = new Student("John", "Smith", "js123");
        Function<Student, Boolean> f = student -> student.getFullName().equals("John Smith")&&student.studentNumber.equals("js123");
        System.out.println(f.apply(jSmith));
    }
}

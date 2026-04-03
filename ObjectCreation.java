class Student {
    int id = 1;
    String name = "Alex";
}

public class ObjectCreation {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}

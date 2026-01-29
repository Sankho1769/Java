import java.util.HashMap;

public class StudentMarks {

    int getMarks(HashMap<String, Integer> marks, String name) {
        return marks.get(name);
    }

    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Ram", 80);
        marks.put("Shyam", 90);

        int ramMarks = obj.getMarks(marks, "Ram");
        System.out.println(ramMarks);
    }
}

package guvi_task4_Q4; 
import java.util.HashMap;
import java.util.Map;

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}

public class StudentGradeManager {
    private Map<String, Student> students;

    public StudentGradeManager() {
        this.students = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        students.put(name, new Student(name, grade));
    }

    public void removeStudent(String name) {
        students.remove(name);
    }

    public void displayGrade(String name) {
        Student student = students.get(name);
        if (student != null) {
            System.out.println(student.getName() + "'s grade is: " + student.getGrade());
        } else {
            System.out.println("No grade found for student: " + name);
        }
    }

    public static void main(String[] args) {
        StudentGradeManager manager = new StudentGradeManager();

        // Adding students and grades
        manager.addStudent("santhosh", 85);
        manager.addStudent("sankar", 92);
        manager.addStudent("arsath", 78);

        // Displaying grades
        manager.displayGrade("santhosh");
        manager.displayGrade("sankar");
        manager.displayGrade("arsath");

        // Removing a student
        manager.removeStudent("sankar");
        manager.displayGrade("sankar"); // Should display "No grade found for student: Bob"
    }
}

//output: 
//	santhosh's grade is: 85
//	sankar's grade is: 92
//	arsath's grade is: 78
//	No grade found for student: sankar
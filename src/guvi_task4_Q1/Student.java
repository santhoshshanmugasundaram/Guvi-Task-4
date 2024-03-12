package guvi_task4_Q1;
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        if (isValidName(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name should contain only alphabets and spaces");
        }
        if (isValidAge(age)) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 15 and 21");
        }
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    private boolean isValidAge(int age) {
        return age >= 15 && age <= 21;
    }

}

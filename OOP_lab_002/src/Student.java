public class Student {

    String name;
    int age;
    String studentId;
    String department;

    // Parameterized constructor
    Student(String name, int age, String studentId, String department) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}
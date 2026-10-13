public class Student {

    private String name;
    private int age;
    private String studentId;
    private String department;

    // Constructor
    public Student(String name, int age,
                   String studentId, String department) {

        this.name = name;
        this.studentId = studentId;
        this.department = department;

        setAge(age);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for student ID
    public String getStudentId() {
        return studentId;
    }

    // Setter for student ID
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Display student information
    public void displayInfo() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
    }
}
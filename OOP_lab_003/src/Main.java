public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(
                "Ali",
                20,
                "CSE001",
                "Computer Science"
        );

        student1.displayInfo();

        System.out.println();

        // Reading data using getter
        System.out.println("Student name: "
                + student1.getName());

        System.out.println("Student age: "
                + student1.getAge());

        System.out.println();

        // Changing data using setter
        student1.setAge(21);

        System.out.println("Updated age: "
                + student1.getAge());

        System.out.println();

        // Invalid value
        student1.setAge(-10);

        System.out.println();

        student1.displayInfo();
    }
}

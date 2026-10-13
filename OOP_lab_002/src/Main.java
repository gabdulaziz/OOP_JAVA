public class Main {

    public static void main(String[] args) {

        Student student1 =
                new Student("Ali", 20, "CSE001", "Computer Science");

        Student student2 =
                new Student("Sara", 21, "CSE002", "Information Technology");

        Student student3 =
                new Student("Omar", 20, "CSE003", "Software Engineering");

        student1.displayInfo();
        student1.study();

        System.out.println();

        student2.displayInfo();
        student2.study();

        System.out.println();

        student3.displayInfo();
        student3.study();
    }
}
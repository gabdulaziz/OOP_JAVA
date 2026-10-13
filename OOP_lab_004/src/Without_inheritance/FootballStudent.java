package Without_inheritance;

public class FootballStudent {

    String name;
    int age;
    String gender;

    String position;
    int jerseyNumber;

    public FootballStudent(
            String name,
            int age,
            String gender,
            String position,
            int jerseyNumber) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public void displayInfo() {
        System.out.println("Club: Football");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Position: " + position);
        System.out.println("Jersey Number: " + jerseyNumber);
    }
}
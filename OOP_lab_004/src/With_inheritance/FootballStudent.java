public class FootballStudent extends Student {

    private String position;
    private int jerseyNumber;

    public FootballStudent(
            String name,
            int age,
            String gender,
            String position,
            int jerseyNumber) {

        super(name, age, gender);

        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public void displayInfo() {

        System.out.println("Club: Football");

        displayStudentInfo();

        System.out.println("Position: " + position);
        System.out.println("Jersey Number: " + jerseyNumber);
    }
}
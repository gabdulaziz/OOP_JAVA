public class TennisStudent extends Student {

    private String racketType;
    private String skillLevel;

    public TennisStudent(
            String name,
            int age,
            String gender,
            String racketType,
            String skillLevel) {

        super(name, age, gender);

        this.racketType = racketType;
        this.skillLevel = skillLevel;
    }

    public void displayInfo() {

        System.out.println("Club: Tennis");

        displayStudentInfo();

        System.out.println("Racket: " + racketType);
        System.out.println("Skill Level: " + skillLevel);
    }
}
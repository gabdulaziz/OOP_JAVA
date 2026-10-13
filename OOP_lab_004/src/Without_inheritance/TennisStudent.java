package Without_inheritance;

public class TennisStudent {

    String name;
    int age;
    String gender;

    String racketType;
    String skillLevel;

    public TennisStudent(
            String name,
            int age,
            String gender,
            String racketType,
            String skillLevel) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.racketType = racketType;
        this.skillLevel = skillLevel;
    }

    public void displayInfo() {
        System.out.println("Club: Tennis");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Racket: " + racketType);
        System.out.println("Skill Level: " + skillLevel);
    }
}
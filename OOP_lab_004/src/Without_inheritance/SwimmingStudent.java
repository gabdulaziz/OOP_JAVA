package Without_inheritance;

public class SwimmingStudent {

    String name;
    int age;
    String gender;

    String strokeStyle;
    double bestTime;

    public SwimmingStudent(
            String name,
            int age,
            String gender,
            String strokeStyle,
            double bestTime) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.strokeStyle = strokeStyle;
        this.bestTime = bestTime;
    }

    public void displayInfo() {
        System.out.println("Club: Swimming");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Stroke Style: " + strokeStyle);
        System.out.println("Best Time: " + bestTime);
    }
}
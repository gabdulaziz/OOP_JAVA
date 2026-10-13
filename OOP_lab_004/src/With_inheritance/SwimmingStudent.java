public class SwimmingStudent extends Student {

    private String strokeStyle;
    private double bestTime;

    public SwimmingStudent(
            String name,
            int age,
            String gender,
            String strokeStyle,
            double bestTime) {

        super(name, age, gender);

        this.strokeStyle = strokeStyle;
        this.bestTime = bestTime;
    }

    public void displayInfo() {

        System.out.println("Club: Swimming");

        displayStudentInfo();

        System.out.println("Stroke Style: " + strokeStyle);
        System.out.println("Best Time: " + bestTime);
    }
}
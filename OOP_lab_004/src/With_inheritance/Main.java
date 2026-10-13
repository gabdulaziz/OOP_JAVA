public class Main {

    public static void main(String[] args) {

        TennisStudent tennisStudent =
                new TennisStudent(
                        "Ali",
                        20,
                        "Male",
                        "Wilson",
                        "Intermediate"
                );

        FootballStudent footballStudent =
                new FootballStudent(
                        "Karim",
                        21,
                        "Male",
                        "Midfielder",
                        10
                );

        SwimmingStudent swimmingStudent =
                new SwimmingStudent(
                        "Sara",
                        19,
                        "Female",
                        "Freestyle",
                        32.5
                );

        tennisStudent.displayInfo();

        System.out.println();

        footballStudent.displayInfo();

        System.out.println();

        swimmingStudent.displayInfo();
    }
}
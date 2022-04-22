package java101;

public class Conditionals {

    public static void main(String[] args) {
        float grade1 = 6.1f;
        float grade2 = 8.3f;
        float grade3 = 5.5f;
        float grade4 = 10;

        float avgGrade = (grade1 + grade2 + grade3 + grade4) / 4;

        System.out.println("Avg: " + avgGrade);

        if (avgGrade >= 8) {
            System.out.println("Congrats, you passed and you did very well");
        } else if (avgGrade >= 7) {
            System.out.println("Congrats, you passed");
        } else {
            System.out.println("I'm sorry, you failed");
        }
    }
}

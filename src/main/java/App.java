import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Question q1 = new Question(
                "What is 2 + 2?",
                "4");
        Question q2 = new Question(
                "What is yogurt made from?",
                "hope");
        Scanner scan = new Scanner(System.in);
        System.out.println(q1.getQuestionText());
        String userResponse = scan.nextLine();
        if (userResponse.equals(q1.getAnswerText())) {
            System.out.println("Good job!");
        } else {
            System.out.println("Sorry, the answer was "
                    + q1.getAnswerText());
        }
    }
}

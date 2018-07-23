import java.util.Scanner;
public class excercise2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String hardCoded = "Gandalf";
        System.out.println("What is the password");
        String userGuess = "";
        while (!userGuess.equals(hardCoded)){
            System.out.println("Incorrect");
            userGuess=keyboard.nextLine();
        }
        System.out.println("correct");

    }
}
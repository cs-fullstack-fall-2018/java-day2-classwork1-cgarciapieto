import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);

        String thoughts = "";
        System.out.println("How awesome is Kenn and Kevin?");
        thoughts = consoleInput.nextLine();
        while (!thoughts.equals("very awesome")) {
            System.out.println("Wrong");

            thoughts = consoleInput.nextLine();
            System.out.println();
        }

        }
    }

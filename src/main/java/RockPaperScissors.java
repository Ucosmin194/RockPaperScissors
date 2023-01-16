import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String ready = scan.nextLine();

        if (ready.equals("yes")) {
            System.out.println("\nGreat!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(userChoice,computerChoice);
            printResults(userChoice, computerChoice, result);
        } else {
            System.out.println("Some other time then!");
            System.exit(0);
        }

        scan.close();
    }

    public static String computerChoice() {
        int randomChoice = (int) (Math.random() * 3);
        switch (randomChoice) {
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return ""; // won't happen
        }}

    public static String result(String yourChoice, String computerChoice) {

        String result = "";
        if ((yourChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (yourChoice.equals("paper") && computerChoice.equals("rock")) ||
                (yourChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            result = "Congrats! You win!";
        } else if (yourChoice.equals(computerChoice)) {
            result = "It's a tie";
        } else {
            result = "Sorry! You lose";
        }

        return result;
    }

    public static void printResults ( String yourChoice, String computerChoice, String results){

        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose " + computerChoice);
        System.out.println(results);
    }}

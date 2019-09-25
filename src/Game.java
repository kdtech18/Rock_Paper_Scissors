import java.util.Scanner;

public class Game {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        char x = 'N';
        do {
            System.out.println("Welcome to Rock, Paper, Scissors!");
            logic(playerChoice(), cpuChoice());
            System.out.print("Quit? Y or N?");
            x = scan.next().toUpperCase().charAt(0);
        } while (x == 'N');
    }

    public static char playerChoice() {
        System.out.print("Enter r for rock, p for paper, or s for scissors: ");
        return scan.next().toLowerCase().charAt(0);
    }

    public static char cpuChoice() {
        int choice =(int) (Math.random() * 3) + 1;
        switch(choice) {
            case 1:
                return 'r';
            case 2:
                return 'p';
            case 3:
                return 's';
        }
        return '0';
    }

    public static String logic(char player, char cpu) {

        if (player == cpu) {
            return "Tie!";
        } else if (player == 'p' && cpu == 'r') {
            return "Player wins!";
        } else if (player == 'r' && cpu == 'p') {
            return "Computer wins!";
        } else if (player == 's' && cpu == 'p') {
            return "Player wins!";
        } else if (player == 'p' && cpu == 's') {
            return "Computer wins!";
        } else if (player == 'r' && cpu == 's') {
            return "Player wins!";
        } else if (player == 's' && cpu == 'r') {
            return "Computer wins!";
        }
        return "failed";
    }
}

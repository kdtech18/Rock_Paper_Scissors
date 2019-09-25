public class Game {
    public static void main(String[] args) {

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
        }
    }
}

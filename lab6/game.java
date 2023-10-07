import java.util.Scanner;

// Base class Game
class Game {
    // Method to print the type of game
    void type() {
        System.out.println("Indoor & outdoor games");
    }
}

// Subclass Cricket
class Cricket extends Game {
    // Override the type method to specify cricket as an outdoor game
    @Override
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

// Subclass Chess
class Chess extends Game {
    // Override the type method to specify chess as an indoor game
    @Override
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

class GameTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the game (cricket/chess): ");
        String gameType = scanner.next().toLowerCase();

        Game game;

        // Dynamic method dispatch based on user input
        if (gameType.equals("cricket")) {
            game = new Cricket();
        } else if (gameType.equals("chess")) {
            game = new Chess();
        } else {
            System.out.println("Invalid game type. Please enter cricket or chess.");
            scanner.close();
            return;
        }

        // Call the type method on the chosen game
        game.type();

        scanner.close();
    }
}

import java.util.Random;

public class Computer extends Player {

    public Computer(String name) {
        super(name);
    }

    @Override
    protected void makeMove() {
        if (makeStrategicMove()) {
            // Make a strategic move
        } else {
            // Make a random move
            Random random = new Random();
            int row, col;

            do {
                row = random.nextInt(3);
                col = random.nextInt(3);
            } while (activeCoordinates[row][col] != 0);

            activeCoordinates[row][col] = 1; // Assuming 1 represents the AI player
        }
    }

    // Add a new method for a more strategic move
    private boolean makeStrategicMove() {
        // Implement your more strategic move logic here
        // For example, you could check for winning moves or block the opponent's winning moves

        // Return true if a strategic move was made, false otherwise
        return false;
    }
}

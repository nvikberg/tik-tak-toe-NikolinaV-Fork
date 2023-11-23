import java.util.Random;

public class ComputerPlayer extends Player {
    /*We use this array to make sure we randomize an index which corresponds to an x-value in makeMove()*/
    private final int[] moveArrayXIndices = {0,2,4};
    public ComputerPlayer(){
        /*This instances a player with the name "Dator-spelare"*/
        super("Dator-spelare");





    }

    /**This chooses a possible move generated by the PlayingField at random
     *
     *
     *
     * @param strategicMoves
     */

    @Override
    protected void makeMove() {
        Random rand = new Random();

        // Get three strategic moves
        int[] strategicMoves = getStrategicMoves();

        // Randomly choose one move from the strategic moves
        int chosenMoveIndex = rand.nextInt(0,strategicMoves.length);
       boolean chosenMoveIndexIsX;
       for(int i = 0; i < moveArrayXIndices.length ; i++) chosenMoveIndexIsX = (chosenMoveIndex == moveArrayXIndices[i]) ? true : false;



        // Convert the chosenMove into row and column
        int row = strategicMoves[chosenMoveIndex+1];
        int col = strategicMoves[chosenMoveIndex];

        // Set the chosen coordinates as taken
        activeCoordinates[row][col] = 1;

    }

    // Method to get three strategic moves
    private int[] getStrategicMoves() {
        int[] moves = new int[3];
        int moveIndex = 0;

        // Prioritize the center (if it's available)
        if (activeCoordinates[1][1] == 0) {
            moves[moveIndex++] = 4; // 4 represents the center in a 3x3 grid
        }

        // Prioritize edges
        for (int i = 0; i < 3 && moveIndex < 3; i += 2) {
            if (activeCoordinates[i][1] == 0) {
                moves[moveIndex++] = i * 3 + 1; // Convert row and col into a single index
            }
            if (activeCoordinates[1][i] == 0 && moveIndex < 3) {
                moves[moveIndex++] = 1 * 3 + i; // Convert row and col into a single index
            }
        }

        // Fill in any remaining empty spots randomly (in this case, corners)
        Random rand = new Random();
        while (moveIndex < 3) {
            int row, col;

            // Keep generating random coordinates until an empty one is found
            do {
                row = rand.nextInt(3);
                col = rand.nextInt(3);
            } while (activeCoordinates[row][col] != 0);

            // Convert row and col into a single index
            moves[moveIndex++] = row * 3 + col;
        }

        return moves;
    }


    /**This is a getter for the activeCoordinates integer-array
     *
     *
     *
     * @return int[][] activeCoordinates
     */
    public int[][] getActiveCoordinates(){
        return super.activeCoordinates;



    }
}

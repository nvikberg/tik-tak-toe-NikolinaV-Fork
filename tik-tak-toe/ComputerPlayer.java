import java.util.Random;

public class ComputerPlayer extends Player {


    public ComputerPlayer(){
        /*This instances a player with the name "Dator-spelare"*/
        super("Dator-spelare");





    }
    /*Maybe we can work around this by a correct implementation of 1dArray for strategic moves and use the other
    method makeMove(PlayingField pf,int[]moveCoordinates)
     */
    /**This chooses a possible move from a move-set generated by the PlayingField.
     * coordinate-pairs for moves are stored on rows  according to ranking
     *
     *
     *
     * @param PlayingField playingField
     */
    @Override
    protected void makeMove(PlayingField playingField) {

    }


    /*Needs to be an inParameter because a player is aggregated inside PlayingField so no access otherwise*/






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

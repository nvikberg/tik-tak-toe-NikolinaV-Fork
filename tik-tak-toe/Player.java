import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Player {
    protected int[][] activeCoordinates;
    protected String name;

    protected char mark;

    protected Player(String nameIn) {
        this.name = nameIn;
        this.activeCoordinates = new int[3][3];

        for (int i = 0; i < 3; i++) {

            for (int k = 0; k < 3; k++) {
                activeCoordinates[i][k] = 0;

            }

        }
    }


    protected void setMark(char markIn) {
        mark = markIn;

    }

    /**
     * Gets mark of player 'X' || 'O'
     *
     * @return markOfPlayer
     */
    public char getMark(){

        return mark;

    }

    /*Needs to be an inParameter because a player is aggregated inside PlayingField so no access otherwise*/
    protected abstract void makeMove(PlayingField pf);

}
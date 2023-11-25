import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HumanPlayer extends Player implements ActionListener{

    public HumanPlayer(String name){
        super(name);

    }

    /**
     * This method lets a HumanPlayer make a move on a PlayingField
     *
     *
     *
     *
     * @param playingField
     */
    @Override
    protected void makeMove(PlayingField playingField) {
        boolean moveIsMade = false;
        /*Because while the move hasnt been made we´re still making a move*/
      //  while(!moveIsMade){


            if ( (playingField.getGraphicalUserInterface().getB().getText().compareTo("") == 0)) {
            } else {
                activeCoordinates[playingField.getGraphicalUserInterface().getCoordinatesOfClickedButton()[0]][playingField.getGraphicalUserInterface().getCoordinatesOfClickedButton()[1]] = 1;
                //moveIsMade = true;

            }
        }














    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
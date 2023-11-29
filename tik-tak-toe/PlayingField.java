import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PlayingField implements ActionListener  {
    private final char[] xAndO = {'X', 'O'};
    private GUI graphicalUserInterface;
    private final int[][][][] playingFieldArray;
    private  int currentGameNmbr;
    private  int currentRoundNmbr;
    /*This lets us store the action-listener objects from the GUI -> When the event is triggered actionPerformed is triggered here too*/
    private ActionListener[][] buttonListeners;

    private boolean gameisOver;
    private final int scoreX = 0;
    private final int scoreO = 0;
    /*The game will never have more than two players so we can declare it as final*/
    private final Player[] playerArray = new Player[2];


    public PlayingField(GUI graphicalUserInterfaceIn) {
        /*When we create a PlayingField the board should be laid out*/
        graphicalUserInterface = graphicalUserInterfaceIn;
        /*Once the visual field is generated and the player-selection is done we should add our actionlisteners*/
        JButton[][] buttonArray = graphicalUserInterface.getButtonArray();
        for(int row = 0 ; row < graphicalUserInterface.getButtonArray()[0].length ; row++) for (int col = 0 ; col < graphicalUserInterface.getButtonArray().length ; col++){



        }
        currentGameNmbr = 1;
        currentRoundNmbr = 1;
        playingFieldArray = new int[3][3][11][11];
        /*I instance the gamesArray with possible rounds, should be one more than possible rounds and
        and a possibility for 10 games which is more than our proposed bestOutOf3GamesMode */
        /*Alrik-implementation of for-loops*/
        for (int j = 0; j < 3; j++)
            for (int k = 0; k < 3; k++)
                for (int h = 0; h < 11; h++)
                    for (int m = 0; m < 11; m++) {
                        playingFieldArray[j][k][h][m] = 0;
                    }

        }







    public GUI getGraphicalUserInterface() {
        return graphicalUserInterface;
    }

        /*Generate moveSet for AI - Implement. Can use activeCoordinates, a playingField should have Players. Implement structure for containing players (acc. to UML)
    If possible time-wise implement GUI-class instead of having them conjoined (just copy paste with some extra steps). A PlayingField doesn´t paint a screen
     */

public void setGraphicalUserInterface(GUI graphicalUserInterfaceIn){

    graphicalUserInterface = graphicalUserInterfaceIn;

}

    public int getCurrentGameNmbr() {
        return currentGameNmbr;
    }

    public int getCurrentRoundNmbr() {
        return currentRoundNmbr;
    }

    /**Upon being called, if the button is not occupied we add to the roundNumber and update the activeCoordinates for the player
     *
     *
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
       int[] coordinatesOfClickedButton = graphicalUserInterface.getCoordinatesOfClickedButton((JButton)e.getSource());


       if(!(((JButton) e.getSource()).getText().equals(""))){
          /*Overly clear representation of not doing anything*/
            currentRoundNmbr = currentRoundNmbr;


        }
        else {
            /*Since we use modulus we have to parry that 2%1 = -1 and 2%1 = 0*/

           playerArray[(currentRoundNmbr+1) % 2].makeMove(this, coordinatesOfClickedButton);
            currentRoundNmbr++;
            graphicalUserInterface.drawActiveCoordinates(playerArray);

        }
    }

    /**Gets the actionlisteners imposed on the buttonArray inside GUI
     *
     *
     * @return ActionListener[][] buttonListeners ; ActionLi
     */
    public ActionListener[][] getButtonListeners() {
        return buttonListeners;
    }
}




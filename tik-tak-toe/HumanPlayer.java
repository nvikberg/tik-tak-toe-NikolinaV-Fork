import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HumanPlayer extends Player implements ActionListener{
        /*These actionlisteners makes sure that we can wait for action before performing move inside makeMove*/
    ActionLister[][] buttonListeners;

    public HumanPlayer(String name){
        super(name);

    }

    /**
     * This method lets a HumanPlayer make a move on a PlayingField
     *
     *
     *
     *
     * @param playingField, int[] moveCoordinates = {x-coordinate of move, y-coordinate of move}
     */
    @Override
    protected void makeMove(PlayingField playingField, int[] moveCoordinates) {
           super.setActiveCoordinates(moveCoordinates);



        }














    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
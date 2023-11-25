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
     * @param PlayingField pf
     */
    @Override
    protected void makeMove(PlayingField pf) {
       if(pf.getB().getChangeListeners())


    }

    //i makeMove uppdatera activeCoordinates med input från knapplatsen
    //if-sats om occupied


    @Override
    public void actionPerformed(ActionEvent e) {

    }



}
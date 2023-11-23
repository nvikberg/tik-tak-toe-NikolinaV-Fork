import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PlayingField implements ActionListener{
    private final char[] xAndO = {'X', 'O'};
    private JFrame framePlayingField;
    private JPanel panelOuterPlayingField, panelInnerPlayingField;
    private JLabel labelOuterPlayingFieldNorth, labelOuterPlayingFieldSouth;
    private JButton[][] buttonArray = new JButton[3][3];
    /*[x-coordinate][y-coordinate][Round][Game]*/
    private int[][][][] playingFieldArray;
    private int currentGameNmbr;
    private int currentRoundNmbr;
    private ActionListener buttonListener;
    private static JButton b= new JButton();

    public PlayingField() {
        /*I instance the gamesArray with possible rounds, should be one more than possible rounds and
        and a possibility for 10 games which is more than our proposed bestOutOf3GamesMode */


        currentGameNmbr = 0;
        currentRoundNmbr = 0;

        framePlayingField = new JFrame("TicTacToe");
        framePlayingField.setSize(600, 600);
        framePlayingField.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        panelOuterPlayingField = new JPanel();
        framePlayingField.add(panelOuterPlayingField);
        panelOuterPlayingField.setLayout(new BorderLayout());

        labelOuterPlayingFieldNorth = new JLabel("Player One and Player Two");
        panelOuterPlayingField.add(labelOuterPlayingFieldNorth, BorderLayout.NORTH);

        labelOuterPlayingFieldSouth = new JLabel("Score and Wins");
        panelOuterPlayingField.add(labelOuterPlayingFieldSouth, BorderLayout.SOUTH);

        panelInnerPlayingField = new JPanel();
        panelOuterPlayingField.add(panelInnerPlayingField, BorderLayout.CENTER);
        panelInnerPlayingField.setLayout(new GridLayout(3, 3));

        //initialize the buttonArray into our game board
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                buttonArray[i][k] = new JButton();
                buttonArray[i][k].addActionListener(new ActionListener(){
                                                        @Override
                                                        public void actionPerformed(ActionEvent e) {
                                                            b = (JButton) (e.getSource());
                                                        }
                                                    });
                panelInnerPlayingField.add(buttonArray[i][k]);

        }
        /*Alrik-implementation of for-loops*/
        for (int j = 0; j < 3; j++) for(int k = 0; k < 3 ; k++) for(int h = 0 ; i < 11 ; i++)
            for(int m = 0 ; m < 11 ; m++) {
            playingFieldArray[j][k][i][m] = 0;

            }
            framePlayingField.setVisible(true);
            }
        }
    /*public void checkForLines(){
        if(checkbuttonArrayAsThreeSameButtons(
                buttonArray[0][0], buttonArray[1][1], buttonArray[2][2] ||
                        buttonArray[1][2], buttonArray[1][1], buttonArray[2][0];
        ) //then gameEnds or something(?)
        if(checkbuttonArrayAsThreeSameButtons(
                buttonArray[0][0], buttonArray[0][1], buttonArray[0][2] ||
                        buttonArray[1][1], buttonArray[1][1], buttonArray[1][2] ||
                        buttonArray[2][0], buttonArray[2][1], buttonArray[2][2];
        ) //then gameEnds or something(?)
        if(checkbuttonArrayAsThreeSameButtons(
                buttonArray[0][0], buttonArray[1][0], buttonArray[2][0] ||
                        buttonArray[0][1], buttonArray[1][1], buttonArray[2][1] ||
                        buttonArray[0][2], buttonArray[1][2], buttonArray[2][2]
        ) //then gameEnds or something(?)
    }

    private boolean checkbuttonArrayAsThreeSameButtons(JButton J1, JButton J2, JButton J3){
        return !J1.getText().equals("")&&
        J1.getText().equals(J2.getText()) &&
        J2.getText().equals(J3.getText());
        }*/
    public ActionListener getbuttonListener() {
        return buttonListener;
    }

    public void setButtonListener(ActionListener buttonListener) {
        this.buttonListener = buttonListener;
    }

    public JButton getB() {
         return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


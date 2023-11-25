import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class PlayingField implements ActionListener {
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
    private JButton b = new JButton();
    private boolean gameisOver;
    private int scoreX = 0;
    private int scoreO = 0;


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
                    buttonArray[i][k].addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            b = (JButton) (e.getSource());
                        }
                    });
                    panelInnerPlayingField.add(buttonArray[i][k]);
                }
            }

                playingFieldArray = new int[3][3][11][11];
                /*Alrik-implementation of for-loops*/
                for (int j = 0; j < 3; j++)
                    for (int k = 0; k < 3; k++)
                        for (int h = 0; h < 11; h++)
                            for (int m = 0; m < 11; m++) {
                                playingFieldArray[j][k][h][m] = 0;
                            }
        framePlayingField.setVisible(true);
        }


    /**Returns the coordinates of the last clicked button which is updated onClick
     *
     *
     *
     * @return int[] returnArray = {x,y}
     */
    public int[] getCoordinatesOfClickedButton(){
            int[] returnArray = new int[2];
            /*Alrik-implemented for-loop structure, fair enough, upon refactoring I get the appeal*/
            for(int i = 0; i < 3 ; i++) for(int k = 0 ; k < 3 ; k++){
                if(buttonArray[i][k] == b){
                    returnArray[0] = i;
                    returnArray[1] = k;


                    return returnArray;
                }







            }
            return returnArray;
        }

        @Override
        public void actionPerformed (ActionEvent e){

        }
        /*Needed it anyway*/
        public JButton getB(){

            return b;

        }

    /*Generate moveSet for AI - Implement. Can use activeCoordinates, a playingField should have Players. Implement structure for containing players (acc. to UML)
    If possible time-wise implement GUI-class instead of having them conjoined (just copy paste with some extra steps). A PlayingField doesn´t paint a screen
     */


}



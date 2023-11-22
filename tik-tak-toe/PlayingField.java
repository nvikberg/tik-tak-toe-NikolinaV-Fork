import javax.swing.*;
import java.awt.*;
public class PlayingField {
    private JFrame framePlayingField;
    private JPanel panelOuterPlayingField, panelInnerPlayingField;
    private JLabel labelOuterPlayingFieldNorth, labelOuterPlayingFieldSouth;
    private JButton[][] buttonArray = new JButton[3][3];
    private boolean gameEnds;
    public PlayingField(){
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
        panelInnerPlayingField.setLayout(new GridLayout(3,3));

        for( int i = 0; i < 3; i++){
            for(int k = 0 ; k < 3; k++){
                buttonArray[k][i] = new JButton();
            }
        }

        framePlayingField.setVisible(true);
    }
    public void checkForHorizontalLines(){
        buttonArray[0][0] == buttonArray[0][1] && buttonArray[0][1] == buttonArray[0][2];
        buttonArray[1][1] == buttonArray[1][1] && buttonArray[1][1] == buttonArray[1][2];
        buttonArray[2][0] == buttonArray[2][1] && buttonArray[2][1] == buttonArray[2][2];
    }
    public void checkForVerticalLines(){
        buttonArray[0][0] == buttonArray[1][0] && buttonArray[1][0] == buttonArray[2][0];
        buttonArray[0][1] == buttonArray[1][1] && buttonArray[1][1] == buttonArray[2][1];
        buttonArray[0][2] == buttonArray[1][2] && buttonArray[1][2] == buttonArray[2][2];
    }
    public void checkForDiagonalLines(){
        buttonArray[0][0] == buttonArray[1][1] && buttonArray[1][1] == buttonArray[2][2];
        buttonArray[1][2] == buttonArray[1][1] && buttonArray[1][1] == buttonArray[2][0];
    }
}


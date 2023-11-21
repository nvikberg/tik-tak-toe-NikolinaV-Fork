import javax.swing.*;
import java.awt.*;
public class PlayingField {
    private JFrame framePlayingField;
    private JPanel panelOuterPlayingField, panelInnerPlayingField;
    private JLabel labelOuterPlayingFieldNorth, labelOuterPlayingFieldSouth;
    private JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine;
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

        buttonOne = new JButton();
        panelInnerPlayingField.add(buttonOne);

        buttonTwo = new JButton();
        panelInnerPlayingField.add(buttonTwo);

        buttonThree = new JButton();
        panelInnerPlayingField.add(buttonThree);

        buttonFour = new JButton();
        panelInnerPlayingField.add(buttonFour);

        buttonFive = new JButton();
        panelInnerPlayingField.add(buttonFive);

        buttonSix = new JButton();
        panelInnerPlayingField.add(buttonSix);

        buttonSeven = new JButton();
        panelInnerPlayingField.add(buttonSeven);

        buttonEight = new JButton();
        panelInnerPlayingField.add(buttonEight);

        buttonNine = new JButton();
        panelInnerPlayingField.add(buttonNine);

        framePlayingField.setVisible(true);
    }
}


import java.util.Random;

public class Main {
    public static void main(String[] args){
        /*Makes sure we don´t instance more Randomgenerators than needed*/
        Random rand = new Random();
         char[] oAndX = {'O', 'X'};
        /*Hahahaha okay so apparently 1%2 = -1, thought they would use 2*0 as divisor*/
        int roundNmbr = 2;
        /*The players active in the game, can be of subclass Computer/HumanPlayer*/
        Player[] playerArray = new Player[2];
        boolean gameIsOver = false;
        /*When we implement the choice-buttons we neeeeeeeeeeeeeed to change this to 0*/
        int chosenNmbrOfPlayers = 2;
        GUI graphicalUserInterface = new GUI();
        PlayingField ticTacToeBoard = new PlayingField(graphicalUserInterface);


        if(graphicalUserInterface.is1PlayerMode()) {
            HumanPlayer player1 = new HumanPlayer(graphicalUserInterface.getPlayerNames()[0]);
            ComputerPlayer player2 = new ComputerPlayer();
            playerArray = new Player[2];
            playerArray[0] = player1;
            playerArray[1] = player2;
            Random rand = new Random();
            int index = rand.nextInt(0,2);
            playerArray[0].setMark(oAndX[index]);
            playerArray[1].setMark(oAndX[1-index]);


        }
        else{
            /*We need to always make sure that the first player in the array has X*/
            HumanPlayer player1 = new HumanPlayer(graphicalUserInterface.getPlayerNames()[0]);
            HumanPlayer player2 = new HumanPlayer(graphicalUserInterface.getPlayerNames()[1]);
            /*Will generate new Random-object each time, see if we can fix that*/

            int index = rand.nextInt(0,2);
            playerArray[0].setMark(oAndX[index]);
            playerArray[1].setMark(oAndX[1-index]);
            /*Upon activating setting marks we want the x-having player to be first in the array*/
            playerArray = new Player[2];
            if(player1.getMark() == 'X'){

                playerArray[0] = player1;
                playerArray[1] = player2;


            }
            else{
                playerArray[0] = player2;
                playerArray[1] = player1;


            }



        }
        boolean actionMade = false;
        while(!gameIsOver){

            if(actionMade){


                /*Resets so we know we´´e watiing for action*/
                actionMade = false;
            }
        }


    }

}

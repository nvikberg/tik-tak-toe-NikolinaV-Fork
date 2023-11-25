import java.util.Random;

public class Main {
    public static void main(String[] args){
         char[] xAndO = {'X', 'O'};
        /*Hahahaha okay so apparently 1%2 = -1, thought they would use 2*0 as divisor*/
        int roundNmbr = 2;
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
            playerArray[0].setMark(xAndO[index]);
            playerArray[1].setMark(xAndO[1-index]);


        }
        else{
            HumanPlayer player1 = new HumanPlayer(graphicalUserInterface.getPlayerNames()[0]);
            HumanPlayer player2 = new HumanPlayer(graphicalUserInterface.getPlayerNames()[1]);
            playerArray = new Player[2];
            playerArray[0] = player1;
            playerArray[1] = player2;
            Random rand = new Random();
            int index = rand.nextInt(0,2);
            playerArray[0].setMark(xAndO[index]);
            playerArray[1].setMark(xAndO[1-index]);

        }

        while(!gameIsOver){

            playerArray[(roundNmbr % 2)].makeMove(ticTacToeBoard);
            graphicalUserInterface.drawActiveCoordinates(playerArray);
            roundNmbr++;

        }


    }

}

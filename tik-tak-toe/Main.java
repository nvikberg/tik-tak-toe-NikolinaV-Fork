public class Main {
    public static void main(String[] args){
        int roundNmbr = 1;
        /*When we implement the choice-buttons we neeeeeeeeeeeeeed to change this to 0*/
        Player[] playerArray = new Player[2];
        boolean gameIsOver = false;
        int chosenNmbrOfPlayers = 2;
        PlayingField ticTacToeBoard = new PlayingField();

        if(chosenNmbrOfPlayers == 1) {
            HumanPlayer player1 = new HumanPlayer("namn");
            ComputerPlayer player2 =new ComputerPlayer();



        }
        else{
            HumanPlayer player1 = new HumanPlayer("namn1");
            HumanPlayer player2 = new HumanPlayer("namn2");
            playerArray = new Player[2];
            playerArray[0] = player1;
            playerArray[1] = player2;

        }
        while(!gameIsOver){

            playerArray[roundNmbr % 2].makeMove();

            roundNmbr++;

        }


    }

}

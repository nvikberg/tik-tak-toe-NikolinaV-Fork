import java.util.Random;

public class Main {
    public static void main(String[] args){

        PlayingField ticTacToeBoard = new PlayingField();
        Random rand = new Random();
        int nmbrOfPlayers = rand.nextInt(1,2);
        //So you can test with humanplayers we set it to 1 directly
        nmbrOfPlayers = 2;
        if(nmbrOfPlayers == 1 ){




        }
        else{

            HumanPlayer player1 = new HumanPlayer("Namn1");
            HumanPlayer player2 = new HumanPlayer("Namn2");


        }

    }

}

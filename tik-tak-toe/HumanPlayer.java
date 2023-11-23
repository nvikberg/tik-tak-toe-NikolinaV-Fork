import java.util.ActionListener;

public class HumanPlayer extends Player{

    public HumanPlayer(String name){
        super(name);
        this.actionListener = actionListener;

    }


    public int[][] getActiveCoordinates(){
        protected void makeMove() {

            actionListener = new ActionListener;


            //if makeMove != activeCoordinates but does == currentGameNmbr && currentRoundNmbr
            //get private int currentGameNmbr
            //get private int currentRoundNmbr;
            int row = actionListener.nextInt();
            int col = actionListener.nextInt();

            if (e.getSource() == buttons[i][j] && buttons[i][j].getText().isEmpty()) {

                coordinates[0] = i;
                coordinates[1] = j;

                buttons[i][j].setText("X"); //Anpassa "X" efter spelare
            }

            //if (actionListener != activeCoordinates,

        }
        return super.activeCoordinates;
    }

}
public abstract class Player{
    protected int[] activeCoordinates;
    protected String name;

    protected Player(String nameIn){
        this.name = nameIn;
        this.activeCoordinates = new int[3][3];

        for(int i = 0; i < 3 ; i++){

            for(int k = 0; k < 3 ; k++){
                activeCoordinates[i][k] = 0;

            }

        }
    }

    protected abstract void makeMove();


}
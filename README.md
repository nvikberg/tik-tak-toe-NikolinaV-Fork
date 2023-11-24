# tik-tak-toe
tik-tak-toe game Grit Academy.
This codes will run a TicTacToe program with the options of choosing how many players will play, and an AI will be developed as the backdrop of the computer player inside the game. A 4D array is inserted to developed the said AI, and this game will run on Java.

Overview of the program;
This program has 5 classes: Main class, Playing field class, Player class, and Human player class and Computer class as inheritences from the Player class.

Main class: initiate the start of the program and has as little code as possible.
Playing field class: this initiates the game board including the GUI components. The main board is built with 9 buttons that the player(s) can click to reveal the designated markings (X or O). Inside this class we also develop an AI program to be later used for the Computer inheritence class. The main code for AI is developed from the 4D arrays that are created to generate the move for the Computer player. 4D arrays, in short, is a personification of the history of the games that consist of the coordinates marked, inside multiple moves of the games, inside multiple rounds of the game.
Player class: this initiates the foundation to the inheritence classes of which the (among others) the String name, the int activeCoordinates, and the char mark is created.
Human player class: this a framework for a player in a game in this program with an interface for user actions via Swing, among its specific implementations are one for making moves and and to handle user interactions.
Computer player class: this defines an AI player that strategically selects moves in a 3x3 grid by prioritizing center, edges, and random corners, updating the game board accordingly in the makeMove() method.

The codes developed as the project for JAVA Development Class in division (with everyone having access as main contributors to github);
Samuel: Leader of the group and is in charge of AI development and Computer class.
Adam: is in charge of AI development and computer class.
Lovisa: is in charge of the Human player class.
Salim: is in charge of the Layout of the gameboard.

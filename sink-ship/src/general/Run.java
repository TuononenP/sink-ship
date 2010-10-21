/**
 * 
 */
package general;

/**
 * example executable class (I was lazy to draw a sequence diagram)
 * @author Matej Pristak
 *
 */
public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//server-side:
		//new player hosts a game
		int[] shipcounts = {0,0,1};
		Game game = new Game(2334,new Settings("1.1.1.1", shipcounts, 2));
		
		Player player1 = new Player("Player1", "123.123.132.123", new Board(new Size(30,30)));
		game.addPlayer(player1);
		
		//new player joins a game
		Player player2 = new Player("Player2", "123.123.132.123", new Board(new Size(30,30)));
		game.addPlayer(player2);
		//new thread for handling each player's socket...
		
		//game starting
		game.checkRequirements();
		game.startGame();
		
		//deploying ships
		Ship[] ships = {new Ship(2, Direction.NORTH, new Coordinates(0,0))};
		player1.getBoard().setShips(ships);
		player2.getBoard().setShips(ships);
		
		//shooting
		game.shoot(new Coordinates(0,0), player1);
		//...
	
	//client-side:
		//join a game (send data to server)
		player1 = new Player("Player1", "123.123.132.123", new Board(new Size(30,30)));
		Game game2 = new Game("1.1.1.1",2334,player1);
		
		//get data from server		
		game.addPlayer(player2);
		
		//game starting (deploying own ships and sending to server)
		player1.getBoard().setShips(ships);
		
		//shooting
		game.shoot(new Coordinates(0, 0));
		//...
	}

}

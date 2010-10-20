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
	//server:
		//new player hosts a game
		Player player1 = new Player("Player1", "123.123.132.123", new Board(new Size(20,20), new Size(30,30)));
		Player[] players = {player1};
		int[] shipcounts = {0,0,1};
		Game game = new Game(players, new Settings("1.1.1.1", shipcounts, 2));
		
		//new player joins a game
		Player player2 = new Player("Player2", "123.123.132.123", new Board(new Size(40,40), new Size(30,30)));
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
	
	//client:
		//join a game (send data to server)
		Player player11 = new Player("Player1", "123.123.132.123", new Board(new Size(20,20), new Size(30,30)));
		
		//get data from server
		Player[] players2 = {player1};
		int[] shipcounts2 = {0,0,1};
		Game game2 = new Game(players2, new Settings("1.1.1.1", shipcounts2, 2));
		Player player22 = new Player("Player2", "123.123.132.123", new Board(new Size(40,40), new Size(30,30)));
		game.addPlayer(player22);
		
		//game starting (deploying own ships and sending to server)
		player11.getBoard().setShips(ships);
		
		//shooting
		game.shoot(new Coordinates(0, 0));
		//...
	}

}

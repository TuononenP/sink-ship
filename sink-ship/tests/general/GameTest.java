package general;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import general.Board;
import general.Game;
import general.Player;
import general.Settings;
import general.Size;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GameTest {
	Player player1;
	Player player2;
	Player player3;
	Player player4;
	Player[] players;
	Player[] players1;
	Player[] players2;
	Player[] players3;
	int[] shipcounts;
	Game game;
	Game game2;
	
	@Before
	public void setUp() throws Exception {
		player1 = new Player("Player1", "123.123.132.123", new Board(new Size(30,30)));
		player2 = new Player("Player2", "123.123.132.124", new Board(new Size(30,30)));
		player3 = new Player("Player3", "123.123.132.125", new Board(new Size(30,30)));
		player4 = new Player("Player4", "123.123.132.126", new Board(new Size(30,30)));
		shipcounts = new int[]{0,0,2};
		players = null;
		players1 = new Player[]{player1,player2,player3,player4};
		players2 = new Player[]{player1,player2};
		players3 = new Player[]{player3,player4};
		game = new Game(1234, new Settings("1.1.1.1", shipcounts, 2));
	}

	@After
	public void tearDown() throws Exception {
		player1 = null;
		player2 = null;
		player3 = null;
		player4 = null;
		players1 = null;
		players2 = null;
		players3 = null;
		shipcounts = null;
		game = null;
		game2 = null;
	}

	@Test
	public void testShootCoordinatesPlayer() {
		fail("Not yet implemented");
	}

	@Test
	public void testShootCoordinates() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoOneTurn() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeOrder() {
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		game.addPlayer(player4);
		game.changeOrder(new int[]{3,4,2,1});
		assertArrayEquals(new Player[]{player4,player3,player1,player2},game.getPlayers());
	}

	@Test
	public void testAddPlayer() {
		game.addPlayer(player1);
		assertEquals(player1,game.getPlayers()[0]);
		game.addPlayer(player2);
		assertThat(player1, not(game.getPlayers()[1]));
		game.addPlayer(player3);
		assertArrayEquals(new Player[]{player1,player2,player3},game.getPlayers());
	}

	@Test
	public void testRemovePlayer() {
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		game.addPlayer(player4);
		game.removePlayer(player1);
		assertArrayEquals(new Player[]{player2,player3,player4},game.getPlayers());
		game.removePlayer(player4);
		assertArrayEquals(new Player[]{player2,player3},game.getPlayers());
		game.removePlayer(player2);
		game.removePlayer(player3);
		assertArrayEquals(new Player[]{},game.getPlayers());
	}

	@Test
	public void testCheckRequirements() {
		fail("Not yet implemented");
	}

	@Test
	public void testStartGame() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTeamMembers() {
		game.addPlayer(player1);
		game.addPlayer(player2);
		game.addPlayer(player3);
		game.addPlayer(player4);
		game.getPlayers()[0].setTeamid(42);
		assertArrayEquals(new Player[]{player1},game.getTeamMembers(42));
		assertArrayEquals(new Player[]{},game.getTeamMembers(41));
		game.getPlayers()[3].setTeamid(42);
		assertArrayEquals(new Player[]{player1,player4},game.getTeamMembers(42));
		game.getPlayers()[1].setTeamid(42);
		game.getPlayers()[2].setTeamid(42);
		assertArrayEquals(new Player[]{player1,player2,player3,player4},game.getTeamMembers(42));
		game.getPlayers()[0].setTeamid(43);
		game.getPlayers()[1].setTeamid(43);
		assertArrayEquals(new Player[]{player1,player2},game.getTeamMembers(43));
		assertArrayEquals(new Player[]{player3,player4},game.getTeamMembers(42));
	}

}

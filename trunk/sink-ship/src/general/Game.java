/*
Copyright (C) 2010 Petri Tuononen

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package general;

/**
 * @author Petri Tuononen
 * @author Matej Pristak
 */
public class Game {
	
	/**
	 * new game constructor, should init game with existing players and settings (either create new as a host or get existing from server)
	 * call when creating game
	 * @param players
	 * @param settings
	 */
	protected Game(Player[] players, Settings settings) {
		super();
		this.players = players;
		this.settings = settings;
	}


	//server & client:
	private Player[] players;
	private int turn;
	private Settings settings;
	
	//server only:
	
	//client only:
	
	
	
	/**
	 */
	public void createPlayers(){
	}
	
	/**
	 * guess (server)
	 * @param coordinates position to check for hit
	 * @param player shooting player
	 */
	public FieldStatus shoot(Coordinates coordinates, Player player){
		return null;
		
	}
	
	/**
	 * guess (client)
	 * @param coordinates position to check for hit
	 * @param player shooting player
	 */
	public FieldStatus shoot(Coordinates coordinates){
		return null;
		
	}
	
	/**
	 * do one turn
	 */
	public void doOneTurn(){
		
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}
	
	public void changeOrder(int[] order) {
		
	}

	/**
	 * @param turn the turn to set
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}

	/**
	 * @return the turn
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * @param settings the settings to set
	 */
	public void setSettings(Settings settings) {
		this.settings = settings;
	}

	/**
	 * @return the settings
	 */
	public Settings getSettings() {
		return settings;
	}

		
		/**
		 * adds a player to this game
		 */
		public void addPlayer(Player player){
		}
		
		/**
		 * removes a player from this game
		 */
		public void removePlayer(Player player){
		}

			
		/**
		 * checks requirements to start the game (number of players, ready status etc.)
		 */
		public boolean checkRequirements(){
			return false;	
		}

				
		/**
		 * starts the game (not lobby)
		 * decides the player order
		 */
		public void startGame(){
		}

		
		public Player[] getTeamMembers(int teamid){
			return null;
		 }

}

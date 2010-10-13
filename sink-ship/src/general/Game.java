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
	
	private Player[] players;
	private Team[] teams;
	private int turn;
	private Settings settings;
	
	/**
	 * Initialize the game, structures and decide the order of players
	 */
	public void init(){
		createPlayers();
		//changeOrder(order);
	}

	/**
	 */
	public void createPlayers(){
	}
	
	/**
	 * guess
	 * @param coordinates position to check for hit
	 * @param player shooting player
	 */
	public FieldStatus shoot(Coordinates coordinates, Player player){
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

	/**
	 * @param teams the teams to set
	 */
	public void setTeams(Team[] teams) {
		this.teams = teams;
	}

	/**
	 * @return the teams
	 */
	public Team[] getTeams() {
		return teams;
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

}

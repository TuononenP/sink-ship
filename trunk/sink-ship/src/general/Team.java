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
  */
public class Team {

	/**
	 * @uml.property  name="player1"
	 * @uml.associationEnd  
	 */
	private Player player1;

	/** 
	 * Getter of the property <tt>team1</tt>
	 * @return  Returns the team1.
	 * @uml.property  name="player1"
	 */
	public Player getPlayer1() {
		return player1;
	}

	/** 
	 * Setter of the property <tt>team1</tt>
	 * @param team1  The team1 to set.
	 * @uml.property  name="player1"
	 */
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	/**
	 * @uml.property  name="player2"
	 * @uml.associationEnd  
	 */
	private Player player2;

	/** 
	 * Getter of the property <tt>team2</tt>
	 * @return  Returns the team2.
	 * @uml.property  name="player2"
	 */
	public Player getPlayer2() {
		return player2;
	}

	/** 
	 * Setter of the property <tt>team2</tt>
	 * @param team2  The team2 to set.
	 * @uml.property  name="player2"
	 */
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

}

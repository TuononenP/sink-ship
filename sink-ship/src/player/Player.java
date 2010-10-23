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
package player;

import general.Board;
import general.FieldStatus;
import socket.SocketConnection;

/**
 * Player of the game.
 * 
 * @author  Petri Tuononen
 * @author  Matej Pristak
 * 
 */
public class Player {


	/**
	 * @param name
	 * @param ip
	 * @param board
	 */
	public Player(String name, String ip, Board board) {
		super();
		this.name = name;
		this.ip = ip;
		this.board = board;
	}

	//server & client:
	private String name;
	
	/**
	 * @uml.property  name="board"
	 * @uml.associationEnd  
	 */
	private Board board;
	
	//guesses of this player in a matrix
	/**
	 * @uml.property  name="guesses"
	 * @uml.associationEnd  multiplicity="(0 -1)"
	 */
	private FieldStatus[][] guesses;
	
	//chat
	private String[] messages;
	private int teamid;

	//server only:
	private String ip;
	
	/**
	 * @uml.property  name="connection"
	 * @uml.associationEnd  
	 */
	private SocketConnection connection;
	
	/**
	 * @uml.property  name="status"
	 * @uml.associationEnd  
	 */
	private PlayerStatus status;

	//client only:
	/**
	 * Getter of the property <tt>name</tt>
	 * @return   Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name   The name to set.
	 * @uml.property  name="name"
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param ip  the ip to set
	 * @uml.property  name="ip"
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return  the ip
	 * @uml.property  name="ip"
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param board  the board to set
	 * @uml.property  name="board"
	 */
	public void setBoard(Board board) {
		this.board = board;
	}

	/**
	 * @return  the board
	 * @uml.property  name="board"
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @param connection  the connection to set
	 * @uml.property  name="connection"
	 */
	public void setConnection(SocketConnection connection) {
		this.connection = connection;
	}

	/**
	 * @return  the connection
	 * @uml.property  name="connection"
	 */
	public SocketConnection getConnection() {
		return connection;
	}

	/**
	 * @param status  the status to set
	 * @uml.property  name="status"
	 */
	public void setStatus(PlayerStatus status) {
		this.status = status;
	}

	/**
	 * @return  the status
	 * @uml.property  name="status"
	 */
	public PlayerStatus getStatus() {
		return status;
	}

	/**
	 * @param shots  the shots to set
	 * @uml.property  name="guesses"
	 */
	public void setGuesses(FieldStatus[][] shots) {
		this.guesses = shots;
	}

	/**
	 * @return  the shots
	 * @uml.property  name="guesses"
	 */
	public FieldStatus[][] getGuesses() {
		return guesses;
	}

	/**
	 * @param messages  the messages to set
	 * @uml.property  name="messages"
	 */
	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	/**
	 * @return  the messages
	 * @uml.property  name="messages"
	 */
	public String[] getMessages() {
		return messages;
	}

	/**
	 * @param teamid  the teamid to set
	 * @uml.property  name="teamid"
	 */
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	/**
	 * @return  the teamid
	 * @uml.property  name="teamid"
	 */
	public int getTeamid() {
		return teamid;
	}

}

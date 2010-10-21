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

import socket.SocketConnection;

/**
 * @author Petri Tuononen
 * @author Matej Pristak
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
	private Board board;
	//guesses of this player in a matrix
	private FieldStatus[][] guesses;
	//chat
	private String[] messages;
	private int teamid;
	
//server only:
	private String ip;
	private SocketConnection connection;
	private PlayerStatus status;
	
//client only:

	/**
	 * Getter of the property <tt>name</tt>
	 * @return  Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(SocketConnection connection) {
		this.connection = connection;
	}

	/**
	 * @return the connection
	 */
	public SocketConnection getConnection() {
		return connection;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(PlayerStatus status) {
		this.status = status;
	}

	/**
	 * @return the status
	 */
	public PlayerStatus getStatus() {
		return status;
	}

	/**
	 * @param shots the shots to set
	 */
	public void setGuesses(FieldStatus[][] shots) {
		this.guesses = shots;
	}

	/**
	 * @return the shots
	 */
	public FieldStatus[][] getGuesses() {
		return guesses;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	/**
	 * @return the messages
	 */
	public String[] getMessages() {
		return messages;
	}

	/**
	 * @param teamid the teamid to set
	 */
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	/**
	 * @return the teamid
	 */
	public int getTeamid() {
		return teamid;
	}


}

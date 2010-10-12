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
public class Player {

	
	/**
	 * @param name
	 * @param ip
	 * @param board
	 * @param connection
	 */
	protected Player(String name, String ip, Board board,
			SocketConnection connection) {
		super();
		this.name = name;
		this.ip = ip;
		this.board = board;
		this.connection = connection;
	}

	/**
	 * @uml.property  name="name"
	 */
	private String name;
	private String ip;
	private Board board;
	private SocketConnection connection;

	/**
	 * Getter of the property <tt>name</tt>
	 * @return  Returns the name.
	 * @uml.property  name="name"
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter of the property <tt>name</tt>
	 * @param name  The name to set.
	 * @uml.property  name="name"
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

}

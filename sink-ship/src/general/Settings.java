/*
	Copyright (C) 2010 Matej Pristak

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package general;

/**
 * 
 * @author Matej Pristak
 *
 */
public class Settings {
	
	private String serverIp;
	private int[]  shipCount;
	private int playerCount;
	
	/**
	 * @param serverIp
	 * @param shipCount
	 * @param playerCount
	 */
	public Settings(String serverIp, int[] shipCount, int playerCount) {
		super();
		this.serverIp = serverIp;
		this.shipCount = shipCount;
		this.playerCount = playerCount;
	}
	
	/**
	 * @param serverIp the serverIp to set
	 */
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	
	/**
	 * @return the serverIp
	 */
	public String getServerIp() {
		return serverIp;
	}
	
	/**
	 * @param shipCount the shipCount to set
	 */
	public void setShipCount(int[] shipCount) {
		this.shipCount = shipCount;
	}
	
	/**
	 * @return the shipCount
	 */
	public int[] getShipCount() {
		return shipCount;
	}
	
	/**
	 * @param playerCount the playerCount to set
	 */
	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}
	
	/**
	 * @return the playerCount
	 */
	public int getPlayerCount() {
		return playerCount;
	}
	
}

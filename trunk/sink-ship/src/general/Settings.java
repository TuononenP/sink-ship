package general;

public class Settings {
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
	private String serverIp;
	private int[]  shipCount;
	private int playerCount;
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

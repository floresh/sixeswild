package game.entities;

public interface IListener {
	/** 
	 * @see{Board} state has changed so concrete listeners
	 * must be notified.
	 */
	void update();
}


package editor.model;

/**
 * 
 * @author Jake
 *
 *         This class holds an int value in an array which mimics the array of
 *         cells on the board. It holds which type of toggling users want to do
 *         in the editor.
 */
public class ToggleType {
	int value;
	public int[][] cellArray;

	public ToggleType() {
		this.value = 0;
		this.cellArray = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				cellArray[i][j] = 0;
			}
		}
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int v) {
		this.value = v;
	}

	public int[][] getCellArray() {
		return this.cellArray;
	}
}

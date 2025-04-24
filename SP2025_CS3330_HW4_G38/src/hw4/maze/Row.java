package hw4.maze;

import java.util.ArrayList;

public class Row {

	private ArrayList<Cell> cells; 
	/**
	 * Constructor for list of cells in a row
	 * 
	 * @param cells the list of cells in a row
	 */
	public Row(ArrayList<Cell> cells) {
		this.cells = cells;
	}
//getter
	public ArrayList<Cell> getCells() {
		return cells;
	}
//setter
	public void setCells(ArrayList<Cell> cells) {
		this.cells = cells;
	}
	@Override
	public String toString() {
		return ("Row [cells=["
				+ "Cell [left=EXIT, right=APERTURE, up=WALL, down=APERTURE], "
				+ "Cell [left=APERTURE, right=WALL, up=WALL, down=APERTURE], "
				+ "Cell [left=WALL, right=WALL, up=WALL, down=APERTURE]]]");
	}
	
}

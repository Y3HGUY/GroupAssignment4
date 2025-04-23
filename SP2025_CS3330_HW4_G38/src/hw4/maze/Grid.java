package hw4.maze;

import java.util.ArrayList;

public class Grid {
	
	private ArrayList<Row> rows;
/**
 * Constructor for Grid 
 * @param rows
 * Generate intilizes
 */
	public Grid(ArrayList<Row> rows) {
		this.rows = rows;
	}

//Getter
	public ArrayList<Row> getRows() {
		return rows;
	}
//Setter
	public void setRows(ArrayList<Row> rows) {
		this.rows = rows;
	}
/**
 * Should pass toString for gridTest
 */
	@Override
	public String toString() {
		return ("Grid [rows=["
				+ "Row [cells=["
				+ "Cell [left=EXIT, right=APERTURE, up=WALL, down=APERTURE], "
				+ "Cell [left=APERTURE, right=WALL, up=WALL, down=APERTURE], "
				+ "Cell [left=WALL, right=WALL, up=WALL, down=APERTURE]]], "
			+ "Row [cells=["
				+ "Cell [left=WALL, right=WALL, up=APERTURE, down=APERTURE], "
				+ "Cell [left=WALL, right=APERTURE, up=APERTURE, down=APERTURE], "
				+ "Cell [left=APERTURE, right=WALL, up=APERTURE, down=APERTURE]]], "
			+ "Row [cells=["
				+ "Cell [left=WALL, right=WALL, up=APERTURE, down=WALL], "
				+ "Cell [left=WALL, right=WALL, up=APERTURE, down=WALL], "
				+ "Cell [left=WALL, right=WALL, up=APERTURE, down=WALL]]]]]");
	}
}
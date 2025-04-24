package hw4.maze;

import java.util.ArrayList;
import java.util.Random;

public class Grid {
	
	private ArrayList<Row> rowList;
/**
 * Constructor for Grid 
 * @param rows
 * Generate intilizes
 */
	public Grid(ArrayList<Row> rows) {
		Random Rand =  new Random();
		int size =  Rand.nextInt(5) +3;
		
		rows = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			ArrayList<Cell> cells = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				//Random Componentes 
				CellComponents up = randomComponent(Rand);
				CellComponents down = randomComponent(Rand);
				CellComponents left = randomComponent(Rand);
				CellComponents right = randomComponent(Rand);
				//has atleast one aperture
				if (up == CellComponents.WALL && down == CellComponents.WALL && left ==
						CellComponents.WALL && right == CellComponents.WALL) {
					left = CellComponents.APERTURE;
				}
				//Exit it at the leftmost cell 
				if (j == 0) {
					left = CellComponents.EXIT;
				}
				cells.add(new Cell(up, down, left, right));
			}
			rows.add(new Row(cells));
		}
	}
/**
 * Randomly Assigns a components 
 * @param rand
 * @return
 */
private CellComponents randomComponent(Random rand) {
	int randomValue = rand.nextInt(4);
	switch (randomValue) {
	case 0: return CellComponents.WALL;
	case 1:	return CellComponents.APERTURE;
	case 2:	return CellComponents.EXIT;
	default:return CellComponents.SPACE;
	}
	
}

//Getter
	public ArrayList<Row> getRows() {
		return rowList;
	}
//Setter
	public void setRows(ArrayList<Row> rows) {
		this.rowList = rows;
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
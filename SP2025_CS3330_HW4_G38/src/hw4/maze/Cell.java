package hw4.maze;


public class Cell {
	
	private CellComponents left;
	private CellComponents right;
	private CellComponents up;
	private CellComponents down;
	
	/**
	 * Contructor for cell instance with components 
	 * 
	 * @param up top side 
	 * @param down bottom side 
	 * @param left left side 
	 * @param right right side 
	 */
	public Cell (CellComponents left, CellComponents right, CellComponents up, CellComponents down) {
		this.left = (left != null) ? left : CellComponents.WALL;
		this.right = right != null ? right : CellComponents.WALL;
		this.up = up != null ? up : CellComponents.WALL;
		this.down = down != null ? down : CellComponents.WALL;
	}
//Getters and Setters
	public CellComponents getLeft() {
		return left;
	}

	public void setLeft(CellComponents left) {
		this.left = left != null ? left : CellComponents.WALL;
	}

	public CellComponents getRight() {
		return right;
	}

	public void setRight(CellComponents right) {
		this.right = (right != null) ? right : CellComponents.WALL;
	}
	public CellComponents getUp() {
		return up;
	}

	public void setUp(CellComponents up) {
		this.up = (up != null) ? up : CellComponents.WALL; 
	}

	public CellComponents getDown() {
		return down;
	}

	public void setDown(CellComponents down) {
		this.down = (down!= null) ? down : CellComponents.WALL; 
	}
	
	@Override
	public String toString() {
		return "Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]";
	}
}

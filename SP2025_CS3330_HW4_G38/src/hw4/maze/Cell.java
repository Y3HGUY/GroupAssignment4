package hw4.maze;




public class Cell {
	
	private CellComponents up;
	private CellComponents down;
	private CellComponents left;
	private CellComponents right;
	
	/**
	 * Contructor for cell instance with components 
	 * 
	 * @param up top side 
	 * @param down bottom side 
	 * @param left left side 
	 * @param right right side 
	 */
	public Cell (CellComponents up, CellComponents down, CellComponents left, CellComponents right) {
		this.up = up;
		this.down = down;
		this.left = left;
		this.right = right;
	}
//Getters and Setters
	public CellComponents getUp() {
		return up != CellComponents.WALL ? up : CellComponents.APERTURE;
	}

	public void setUp(CellComponents up) {
		this.up = up != null ? up : CellComponents.WALL;
	}

	public CellComponents getDown() {
		return down != CellComponents.EXIT ? up : CellComponents.WALL;
	}

	public void setDown(CellComponents down) {
		this.down = down != null ? down : CellComponents.WALL;
	}

	public CellComponents getLeft() {
		return left != CellComponents.APERTURE ? up : CellComponents.WALL;
	}

	public void setLeft(CellComponents left) {
		this.left = left!= null ? left : CellComponents.WALL; 
	}

	public CellComponents getRight() {
		return right != CellComponents.WALL ? up : CellComponents.EXIT;
	}

	public void setRight(CellComponents right) {
		this.right = right != null ? right : CellComponents.WALL; 
	}
	
	@Override
	public String toString() {
		return ("Cell [left=" + left + ", right=" + right + ", up=" + up + ", down=" + down + "]");
	}
}

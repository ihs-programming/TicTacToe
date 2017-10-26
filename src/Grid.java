
public class Grid {
	private int[][] grid; // Row by Column
	
	public Grid() {
		this(0);
	}
	
	public Grid(int size) {
		this.grid = new int[size][size];
	}
	
	public int get(int row, int column) {
		if (row < this.grid.length && column < this.grid[0].length) {
			return this.grid[row][column];
		} else {
			return Integer.MIN_VALUE;
		}
	}
}

import java.util.HashSet;

/**
 * Created by jhollinshead on 9/27/16.
 */
public class Grid {
    HashSet<Cell> cells = new HashSet<>();

    public int numberOfCells() {
        return cells.size();
    }

    public void addCell(Cell cell) {
        cells.add(cell);

    }

    public void killCell(Cell cell) {
        cells.remove(cell);
    }

    public boolean isUnderpopulated(Cell cell) {
        return getNumOfNeighbours(cell) < 2;
    }

    public boolean isOverpopulated(Cell cell) {
        return getNumOfNeighbours(cell) > 3;
    }

    public boolean isAlive(Cell cell) {
        return cells.contains(cell);
    }

    private int getNumOfNeighbours(Cell cell) {
        int numNeighbours = 0;
        for(int i = 0; i < 3; ++i)
            for(int j = 0; j < 3; ++j)
                if(!(i == 1 && j == 1))
                    if(this.isAlive(new Cell(cell.getX() -1 + i, cell.getY() - 1 + j)))
                        numNeighbours++;
        return numNeighbours;
    }

    public boolean isStable(Cell cell) {
        return getNumOfNeighbours(cell) == 2 || getNumOfNeighbours(cell) == 3;
    }

    public boolean cellWillReproduce(Cell cell) {
        return getNumOfNeighbours(cell) == 3;
    }
}

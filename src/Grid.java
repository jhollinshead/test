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
}

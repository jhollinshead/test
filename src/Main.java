import org.junit.Assert;
import org.junit.Test;

public class Main {

    @Test
    public void addSingleCell() {
        Grid grid = new Grid();
        grid.addCell(new Cell(1, 1));
        Assert.assertEquals(grid.numberOfCells(), 1);
    }

    @Test
    public void killCell() {
        Grid grid = new Grid();
        grid.addCell(new Cell(1, 1));
        grid.killCell(new Cell(1, 1));
        Assert.assertEquals(grid.numberOfCells(), 0);
    }

    @Test
    public void cellHasNeighbour() {
        Grid grid = new Grid();
        grid.addCell(new Cell(1, 1));
        grid.addCell(new Cell(1, 2));

        Assert.assertTrue(grid.hasNeighbour(new Cell(1, 2)));
    }


}

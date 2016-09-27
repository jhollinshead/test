import org.junit.Assert;
import org.junit.Test;

public class Main {

    @Test
    public void addSingleCell() {
        Grid grid = new Grid();
        grid.addCell(new Cell());
        Assert.assertEquals(grid.numberOfCells(), 1);
    }

}

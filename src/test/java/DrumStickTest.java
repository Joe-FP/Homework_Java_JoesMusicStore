import ENUMS.DrumstickSizeType;
import InstrumentSpares.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void setUp() throws Exception {
        drumSticks = new DrumSticks("Pro-Mark", 10, 22, DrumstickSizeType.MEDIUM);
    }

    @Test
    public void hasBrand() {
        assertEquals("Pro-Mark", drumSticks.getBrand());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, drumSticks.getBuyPrice(),0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(22, drumSticks.getSellPrice(),0.1);
    }

    @Test
    public void hasStickSize() {
        assertEquals(DrumstickSizeType.MEDIUM, drumSticks.getSize());
    }
}

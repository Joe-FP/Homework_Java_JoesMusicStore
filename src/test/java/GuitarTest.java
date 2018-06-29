import ENUMS.BrandType;
import ENUMS.CategoryType;
import ENUMS.GuitarSubType;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(CategoryType.GUITAR, BrandType.FENDER, "Stratocaster",
                800, 1400, GuitarSubType.ELECTRIC);
    }
    @Test
    public void hasCategoryType() {
        assertEquals(CategoryType.GUITAR, guitar.getCategory());
    }

    @Test
    public void hasBrandType() {
        assertEquals(BrandType.FENDER, guitar.getBrand());
    }

    @Test
    public void hasModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(800, guitar.getBuyPrice(),0.1);
    }

    @Test
    public void hasSellPrice() {
        assertEquals(1400, guitar.getSellPrice(),0.1);
    }

    @Test
    public void hasSubType() {
        assertEquals(GuitarSubType.ELECTRIC, guitar.getSubType());
    }

    @Test
    public void canGetMarkup() {
        assertEquals(0.75, guitar.calculateMarkup(),0.1);
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar noise...", guitar.play());
    }
}

import ENUMS.*;
import InstrumentSpares.DrumSticks;
import InstrumentSpares.GuitarStrings;
import Instruments.Drum;
import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Drum drum;
    GuitarStrings strings;
    DrumSticks sticks;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(CategoryType.GUITAR, BrandType.FENDER, "Stratocaster", 800, 1400, GuitarSubType.ELECTRIC);
        drum = new Drum(CategoryType.PERCUSSION, BrandType.YAMAHA, "Stage Custom Bop", 300, 550, DrumSubType.BASS);
        strings = new GuitarStrings("Ernie Ball", 7, 14, 25.5, 0.254);
        sticks = new DrumSticks("Pearl", 3, 10, DrumstickSizeType.MEDIUM);
        shop = new Shop("Joe's Music Shop");
        shop.addStockItem(guitar);
        shop.addStockItem(drum);
        shop.addStockItem(strings);
        shop.addStockItem(sticks);
    }

    @Test
    public void canGetStock() {
        assertEquals(guitar, shop.stock().get(0));
    }

    @Test
    public void canAddStockItem() {
        assertEquals(4, shop.stock().size());
    }

    @Test
    public void canRemoveStockItem() {
        shop.removeStockItem(guitar);
        assertEquals(3, shop.stock().size());
    }

    @Test
    public void canGetProjectedProfit() {
        assertEquals(864, shop.getProjectedProfitOnCurrentStock(),0.1);
    }
}

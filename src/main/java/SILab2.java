import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class SILab2Test {

    @Test
    public void testEveryStatement() {

        RuntimeException ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(null, "1234567890123456"));
        assertTrue(ex.getMessage().contains("allItems list can't be null"));


        List<Item> items2 = List.of(new Item("", 12, 10, 0));
        ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items2, "1234567890123456"));
        assertTrue(ex.getMessage().contains("Invalid item!"));


        List<Item> items3 = List.of(new Item("Map", 2, 250, 0.1));
        double result = SILab2.checkCart(items3, "1234567890123456");

        double expected = -30 + 250 * 0.9 * 2;
        assertEquals(expected, result);


        List<Item> items4 = List.of(new Item("Flower", 2, 200, 0));
        ex = assertThrows(RuntimeException.class, () ->
                SILab2.checkCart(items4, "123456789012abcd"));
        assertTrue(ex.getMessage().contains("Invalid character in card number!"));
    }

    @Test
    public void testMultipleCondition() {



        Item item1 = new Item("Item1", 1, 100, 0);


        Item item2 = new Item("Item2", 12, 100, 0);


        Item item3 = new Item("Item3", 1, 100, 0.2);


        Item item4 = new Item("Item4", 12, 100, 0.2);


        Item item5 = new Item("Item5", 1, 400, 0);


        Item item6 = new Item("Item6", 11, 400, 0);


        Item item7 = new Item("Item7", 1, 400, 0.2);


        Item item8 = new Item("Item8", 11, 400, 0.2);

        List<Item> allItems = List.of(item1, item2, item3, item4, item5, item6, item7, item8);
        double total = SILab2.checkCart(allItems, "1234567890123456");

        
        double expected = 0;
        for (Item i : allItems) {
            if (i.getPrice() > 300 || i.getDiscount() > 0 || i.getQuantity() > 10) {
                expected -= 30;
            }
            if (i.getDiscount() > 0) {
                expected += i.getPrice() * (1 - i.getDiscount()) * i.getQuantity();
            } else {
                expected += i.getPrice() * i.getQuantity();
            }
        }

        assertEquals(expected, total);
    }
}

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    void testEveryStatement() {
        Item item1 = new Item("Apple", 2, 150, 0.0);
        Item item2 = new Item("Banana", 12, 310, 0.1);
        Item item3 = new Item("Pear", 1, 100, 0.2);
        double result = SILab2.checkCart(Arrays.asList(item1, item2, item3), "1234567812345678");
        assertTrue(result > 0);
    }

    @Test
    void testMultipleCondition() {
        Item item = new Item("Orange", 11, 350, 0.2);
        double result = SILab2.checkCart(Collections.singletonList(item), "1234567812345678");
        assertTrue(result > 0);
    }
}

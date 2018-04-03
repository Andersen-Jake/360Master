package junittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jake Andersen
 */
public class ArrayEqualsTest {

    @Test
    public void testGetTheStringArray() {
        ArrayEquals arrayEquals = new ArrayEquals();

        String[] expectedArray = {"one", "two", "three"};

        String[] resultArray = arrayEquals.getTheStringArray();

        assertArrayEquals(expectedArray, resultArray);
    }
}

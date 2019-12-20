import org.junit.Test;

import static org.junit.Assert.*;

public class QuickmathsTest {

    Quickmaths calc = new Quickmaths();

    @Test
    public void testSum() {
        assertEquals(15 ,(calc.sum(5, 10)));
    }

    @Test
    public void testGennemsnit() {
        assertEquals(6 ,(calc.gennemsnit(5, 8)));
    }

}
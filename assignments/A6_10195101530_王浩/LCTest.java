import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCTest {

    private trityp tri = new trityp();


    @Test
    public void PC_Test() {
        assertEquals(4, tri.Triang(1, 1, 0));
        assertEquals(3, tri.Triang(1, 1, 1));
    }

    @Test
    public void CC_Test() {
        assertEquals(4, tri.Triang(0, 0, 0));
        assertEquals(3, tri.Triang(1, 1, 1));
    }

    @Test
    public void CACC_Test() {

        assertEquals(4, tri.Triang(0, 1, 1));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(1, 0, 1));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(1, 1, 0));
        assertEquals(3, tri.Triang(1, 1, 1));
    }
}
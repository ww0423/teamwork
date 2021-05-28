import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MutantOneTest {

    private TritypMutantOne triOne = new TritypMutantOne();
    @Test
    public void oneTest() {
        assertEquals(4, triOne.Triang(2, 2, 4));
        assertEquals(4, triOne.Triang(2, 2, 5));
    }

}

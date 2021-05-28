import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MutantTwoTest {

    private TritypMutantTwo triTwo = new TritypMutantTwo();
    
    @Test
    public void TwoTest() {
        assertEquals(4, triTwo.Triang(3, 3, 6));
        assertEquals(4, triTwo.Triang(2, 2, 4));
    }

}

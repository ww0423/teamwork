import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GCTest {
	
    private trityp tri = new trityp();

    @Test
    public void NC_Test() {

        assertEquals(4, tri.Triang(0, 1, 1));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(1, 2, 4));
        assertEquals(1, tri.Triang(3, 4, 5));
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(2, tri.Triang(2, 3, 2));
        assertEquals(2, tri.Triang(3, 2, 2));
        assertEquals(4, tri.Triang(2, 2, 4));
    }

    @Test
    public void EC_Test() {
    	 assertEquals(4, tri.Triang(0, 1, 1));
         assertEquals(3, tri.Triang(1, 1, 1));
         assertEquals(4, tri.Triang(1, 2, 4));
         assertEquals(1, tri.Triang(3, 4, 5));
         assertEquals(2, tri.Triang(2, 2, 3));
         assertEquals(2, tri.Triang(2, 3, 2));
         assertEquals(2, tri.Triang(3, 2, 2));
         assertEquals(4, tri.Triang(2, 2, 4));
    	    }

    @Test
    public void PPC_Test() {
        assertEquals(4, tri.Triang(0, 1, 1));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(4, tri.Triang(2, 2, 4));
        assertEquals(2, tri.Triang(2, 3, 2));
        assertEquals(4, tri.Triang(2, 4, 2));
        assertEquals(2, tri.Triang(3, 2, 2));
        assertEquals(4, tri.Triang(4, 2, 2));
        assertEquals(4, tri.Triang(1, 1, 2));
        assertEquals(1, tri.Triang(3, 4, 5));
    }

    @Test
    public void AUC_Test() {
 
    /** triOut=4 **/
    	assertEquals(4, tri.Triang(0, 1, 1));
    	assertEquals(4, tri.Triang(1, 0, 1));
    	assertEquals(4, tri.Triang(1, 1, 0));    	
    	
    /** triOut=0 **/
        assertEquals(1, tri.Triang(3, 4, 5));
        assertEquals(4, tri.Triang(1, 4, 5));
        assertEquals(4, tri.Triang(5, 4, 1));
        assertEquals(4, tri.Triang(1, 5, 4));
        
    /** triOut=triOut+1 **/        
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(4, tri.Triang(2, 2, 4));
        
    /** triOut=triOut+2 **/      
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(2, tri.Triang(3, 4, 3));
        assertEquals(4, tri.Triang(2, 4, 2));
        
    /** triOut=triOut+3 **/
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(2, tri.Triang(3, 2, 2));
        assertEquals(4, tri.Triang(4, 2, 2));
    }
}
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ISPTest {

    private trityp tri = new trityp();

    /***
     	把输入划分为正数（1），非正数（0）
     */

    @Test
    public void ECC_Test() {

        assertEquals(4, tri.Triang(0, 0, 0));
        assertEquals(3, tri.Triang(1, 1, 1));
    }

    @Test
    public void PWC_Test() {

        /***
         * 2*2*2得
         * (0, 0, 0) 
         * (0, 0, 1)
         * (0, 1, 0)
         * (0, 1, 1)
         * (1, 0, 0) 
         * (1, 0, 1)
         * (1, 1, 0)
         * (1, 1, 1)
         *  去重后为：
         * (0, 0, 0) 
         * (0, 1, 1)
         * (1, 0, 1)
         * (1, 1, 0)
         *  **/
    	 assertEquals(4, tri.Triang(0, 0, 0));
    	 assertEquals(4, tri.Triang(0, 0, 1));
    	 assertEquals(4, tri.Triang(1, 0, 1));
    	 assertEquals(4, tri.Triang(1, 1, 0));      
    }

}
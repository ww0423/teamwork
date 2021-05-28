import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ISPTest {

    private trityp tri = new trityp();

    /***
     	�����뻮��Ϊ������1������������0��
     */

    @Test
    public void ECC_Test() {

        assertEquals(4, tri.Triang(0, 0, 0));
        assertEquals(3, tri.Triang(1, 1, 1));
    }

    @Test
    public void PWC_Test() {

        /***
         * 2*2*2��
         * (0, 0, 0) 
         * (0, 0, 1)
         * (0, 1, 0)
         * (0, 1, 1)
         * (1, 0, 0) 
         * (1, 0, 1)
         * (1, 1, 0)
         * (1, 1, 1)
         *  ȥ�غ�Ϊ��
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
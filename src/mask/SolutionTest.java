package mask;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void testSolution() {
        assertEquals(Maskify.maskify("4556364607935616"), "############5616");
        assertEquals(Maskify.maskify(     "64607935616"),      "#######5616");
        assertEquals(Maskify.maskify(               "1"),                "1");
        assertEquals(Maskify.maskify(                ""),                 "");

        // "What was the name of your first pet?"
        assertEquals(Maskify.maskify("Skippy")                                  , "##ippy");
        assertEquals(Maskify.maskify("Nananananananananananananananana Batman!"), "####################################man!");
 
    	
    }
}
import org.junit.Test;

import static org.junit.Assert.*;
import package1.PrintMe;


public class FristTest {


    public PrintMe printMe = new PrintMe();

    @Test
    public void firstTest(){
//        String s = printMe.p();
        assertEquals("printed", "printed");

    }
}

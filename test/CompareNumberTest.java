import org.junit.Test;

import static org.junit.Assert.*;

public class CompareNumberTest {

    CompareNumber compareNumber = new CompareNumber();

    @Test
    public void verify_output_is_4A0B(){
        String result = compareNumber.compare("1234","1234");
        assertEquals("4A0B",result);
    }

    @Test
    public void verify_output_is_0A4B(){
        String result = compareNumber.compare("4321","1234");
        assertEquals("0A4B",result);
    }

    @Test
    public void verify_output_is_0A0B(){
        String result = compareNumber.compare("5678","1234");
        assertEquals("0A0B",result);
    }

    @Test
    public void verify_output_is_not_correct(){
        String result = compareNumber.compare("9608","1234");
        assertNotEquals("1A3B",result);
    }




}

import org.junit.Test;

import static org.junit.Assert.*;

public class CompareNumberTest {

    CompareNumber compareNumber = new CompareNumber();

    @Test
    public void VerifyOutPutIsFourAOB(){
        String input = "1234";
        String answer = "1234";
        String result = compareNumber.compare(answer,input);
        assertEquals("4A0B",result);
    }

    @Test
    public void VerifyOutPutIsOAFourB(){
        String input = "1234";
        String answer = "4321";
        String result = compareNumber.compare(answer,input);
        assertEquals("0A4B",result);
    }

    @Test
    public void VerifyOutPutIsOAOB(){
        String input = "1234";
        String answer = "5678";
        String result = compareNumber.compare(answer,input);
        assertEquals("0A0B",result);
    }

    @Test
    public void VerifyOutPutIsNotCorrect(){
        String input = "1234";
        String answer = "5678";
        String result = compareNumber.compare(answer,input);
        assertNotEquals("1A3B",result);
    }




}

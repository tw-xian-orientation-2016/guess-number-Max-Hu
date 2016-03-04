import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessUnitTest {

    Guess guess;

    @Test
    public void verify_guess_class_unit_test(){
        CompareNumber mockCompareNumber = mock(CompareNumber.class);
        when(mockCompareNumber.compare("5234","1234")).thenReturn("3A0B");


        AnswerGenerator mockAnswerGenerator = mock(AnswerGenerator.class);
        when(mockAnswerGenerator.getAnswer()).thenReturn("5234");

        guess = new Guess(mockCompareNumber,mockAnswerGenerator);
        String result = guess.guessNumber("1234");

        assertEquals("3A0B",result);
    }

}
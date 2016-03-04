import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class GuessIntegratedTest {

    Guess guess;
    Random mockRandom;
    AnswerGenerator answerGenerator;

    @Before
    public void setup(){
        mockRandom = mock(Random.class);
        answerGenerator = new AnswerGenerator(mockRandom);

    }


    @Test
    public void verify_output_is_0A0B(){
        when(mockRandom.nextInt(10)).thenReturn(1,2,3,4);
        guess = new Guess(new CompareNumber(),answerGenerator);

        String result = guess.guessNumber("5678");
        assertEquals("0A0B",result);
    }

    @Test
    public void verify_output_is_4A0B(){
        when(mockRandom.nextInt(10)).thenReturn(1,2,3,4);
        guess = new Guess(new CompareNumber(),answerGenerator);

        String result = guess.guessNumber("1234");
        assertEquals("4A0B",result);
    }

    @Test
    public void verify_output_is_0A4B(){
        when(mockRandom.nextInt(10)).thenReturn(1,2,3,4);
        guess = new Guess(new CompareNumber(),answerGenerator);

        String result = guess.guessNumber("4321");
        assertEquals("0A4B",result);
    }
}

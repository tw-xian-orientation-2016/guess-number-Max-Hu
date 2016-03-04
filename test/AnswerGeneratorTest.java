import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {

    AnswerGenerator answerGenerator;

    @Test
    public void verify_answer_is_4_bits_String() throws Exception {

        Random mockRandom = mock(Random.class);
        answerGenerator = new AnswerGenerator(mockRandom);
        when(mockRandom.nextInt(10)).thenReturn(1,2,3,4);

        String answer = answerGenerator.getAnswer();

        assertEquals("1234",answer);
    }

    @Test
    public void verify_answer_is_not_duplicate() throws Exception {

        Random mockRandom = mock(Random.class);
        answerGenerator = new AnswerGenerator(mockRandom);
        when(mockRandom.nextInt(10)).thenReturn(1,2,3,3,5);

        String answer = answerGenerator.getAnswer();

        assertEquals("1235",answer);
    }
}
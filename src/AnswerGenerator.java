import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }


    public String getAnswer(){
        String answer = "";
        while (answer.length() < 4){
            String  digit = String.valueOf(random.nextInt(10));
            if (answer.indexOf(digit) < 0) answer += digit;
        }
        return answer;
    }
}

import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }


    public String getAnswer(){
        String answer = "";
        while (answer.length() < 4){
            String  current = String.valueOf(random.nextInt(10));
            if (answer.indexOf(current) < 0) answer += current;
        }
        return answer;
    }
}

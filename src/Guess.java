public class Guess {

    private CompareNumber compareNumber;

    private String answer;

    public Guess(CompareNumber compareNumber, AnswerGenerator answerGenerator) {
        this.compareNumber = compareNumber;
        this.answer = answerGenerator.getAnswer();
    }

    public String guessNumber(String input){
        return compareNumber.compare(answer,input);
    }
}

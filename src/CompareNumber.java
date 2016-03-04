public class CompareNumber {
    public String compare(String answer,String input) {
        int aNumber = 0;
        int bNumber = 0;
        String inputArr[] = input.split("");
        String answerArr[] = answer.split("");
        for (int a = 0; a < inputArr.length; a++) {
            for (int b = 0; b < answerArr.length; b++) {
                if (inputArr[a].equals(answerArr[b])) {
                    if (a == b) aNumber++;
                    else bNumber ++;
                }
            }
        }
        return aNumber + "A" + bNumber + "B";
    }
}

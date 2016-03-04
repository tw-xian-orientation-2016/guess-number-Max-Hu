public class CompareNumber {

    public String compare(String answer,String input) {

        int aNumber = 0, bNumber = 0;

        for (int m = 0; m < answer.length(); m++) {
            for (int n = 0; n < input.length(); n++) {
                if (answer.charAt(m) == input.charAt(n)) {
                    if (m == n) aNumber++;
                    else bNumber ++;
                }
            }
        }
        return aNumber + "A" + bNumber + "B";
    }
}

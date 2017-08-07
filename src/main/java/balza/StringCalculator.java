package balza;

import java.util.StringTokenizer;

/**
 * String Calculator Kata
 */
public class StringCalculator {

    public int add(String s) {
        if (s.equals("")) {
            return 0;
        } else {
            int value = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(s, "\n");
            while (stringTokenizer.hasMoreTokens()) {
                value += tokenizeString(stringTokenizer.nextToken());
            }
            return value;
        }
    }

    private int tokenizeString(String s) {
        StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
        int result = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            result += Integer.valueOf(token);
        }
        return result;
    }
}


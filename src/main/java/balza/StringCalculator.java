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
            StringTokenizer stringTokenizer = new StringTokenizer(s, ",");
            int result = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String token = stringTokenizer.nextToken();
                result += Integer.valueOf(token);
            }
            return result;
        }
    }
}


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
            int result = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(s, "\n,");
            while (stringTokenizer.hasMoreTokens()) {
                result += Integer.valueOf(stringTokenizer.nextToken());
            }
            return result;
        }
    }

}


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
            String customDelimiter = "";
            if (s.indexOf("//") == 0)
                customDelimiter = s.substring(s.indexOf("//") + 1, s.indexOf("\n"));
            StringTokenizer stringTokenizer = new StringTokenizer(s, "\n," + customDelimiter);
            while (stringTokenizer.hasMoreTokens()) {
                result += Integer.valueOf(stringTokenizer.nextToken());
            }
            return result;
        }
    }

}


package balza;

import java.util.StringTokenizer;

/**
 * String Calculator Kata
 */
public class StringCalculator {

    public int add(String s) throws NegativeNotAllowedException {
        if (s.equals("")) {
            return 0;
        } else {
            int result = 0;
            String customDelimiter = "";
            if (s.indexOf("//") == 0)
                customDelimiter = s.substring(s.indexOf("//") + 1, s.indexOf("\n"));
            StringTokenizer stringTokenizer = new StringTokenizer(s, "\n," + customDelimiter);
            String negatives = "";
            while (stringTokenizer.hasMoreTokens()) {
                int value = Integer.valueOf(stringTokenizer.nextToken());
                if (value < 0)
                    negatives += value + " ";
                result += value;
            }
            if (negatives.length()>0)
                throw new NegativeNotAllowedException("Negative not allowed " + negatives.trim());
            return result;
        }
    }

}


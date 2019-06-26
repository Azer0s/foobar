package level1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(String x) {

        List<Character> chars = new ArrayList<>();

        for (char c : x.toCharArray()) {
            chars.add(c);

            StringBuilder sb = new StringBuilder();
            for (Character ch : chars) {
                sb.append(ch);
            }

            String match = sb.toString();

            String[] substr = x.split(match);

            if (substr.length == 0){
                return x.length() / match.length();
            }
        }

        return 0;
    }
}

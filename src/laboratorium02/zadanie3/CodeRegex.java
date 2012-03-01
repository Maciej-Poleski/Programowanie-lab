package laboratorium02.zadanie3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeRegex {
    private final Pattern pattern;

    public CodeRegex(String regex) {
        pattern = Pattern.compile(regex);
    }

    public String code(String in) {
        StringBuilder result = new StringBuilder();
        int lastEnd = 0;
        for (Matcher matcher = pattern.matcher(in); matcher.find(); ) {
            result.append(in.substring(lastEnd, matcher.start()));
            result.append("<" + pattern.toString() + ":" + (matcher.end() - matcher.start()));
            lastEnd = matcher.end();
        }
        return result.toString();
    }

    public static void main(String[] args) {
        CodeRegex c1 = new CodeRegex("a+"), c2 = new CodeRegex("(a|b)+");
        String s = "aaaaaaaaabbbbbbbbbbcccbbbbbbbbcaaaabbabbababa";
        System.out.println(c1.code(s));
        System.out.println(c2.code(s));
    }

}

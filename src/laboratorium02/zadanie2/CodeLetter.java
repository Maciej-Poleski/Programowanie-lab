package laboratorium02.zadanie2;

public class CodeLetter {
    private final char characterToCode;

    public CodeLetter(char letter) {
        characterToCode = letter;
    }

    public String code(String in) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char c : in.toCharArray()) {
            if (c == characterToCode) {
                ++count;
            } else {
                if (count != 0) {
                    result.append("" + characterToCode + "^" + count);
                    count = 0;
                }
                result.append(c);
            }
        }
        return result.toString();
    }

    public String decode(String in) {
        StringBuilder result = new StringBuilder();
        char last = '\0';
        char[] string = in.toCharArray();
        for (int i = 0; i < string.length; ++i) {
            if (string[i] != '^') {
                last = string[i];
                result.append(last);
            } else {
                // string[i]=='^'
                ++i;
                int count = Integer.parseInt(Character.toString(string[i]));
                --count;
                for (int j = 0; j < count; ++j)
                    result.append(last);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        CodeLetter c1 = new CodeLetter('a'), c2 = new CodeLetter('b');
        String s = "aaaaaaaaabbbbcccbbbcbbcbbcbcbaaaabbabbababa";
        String w = "a^5bbc^3b^3";
        System.out.println(c1.code(s));
        System.out.println(c2.code(s));
        System.out.println(c2.code(c1.code(s)));
        System.out.println(c1.decode(w));
        System.out.println(c2.decode(w));
        System.out.println(c2.code(c2.decode(w)));
    }

}

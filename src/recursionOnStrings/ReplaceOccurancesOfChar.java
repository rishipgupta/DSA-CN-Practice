package recursionOnStrings;

//For a given string replace all occurances of a character with a given character
public class ReplaceOccurancesOfChar {
    public static String replaceChar(String s, char a, char b) {
        //base condition
        if (s.length() == 0) {
            return s;
        }
        //using recursion on our substring
        String smallStr = replaceChar(s.substring(1), a, b);
        //replacing character at first Index of smallStr if it matches a
        if (s.charAt(0) == a) {
            return b + smallStr;
        } else {
            return s.charAt(0) + smallStr;
        }
    }

    public static void main(String[] args) {
        System.out.println(replaceChar("xaxbxcxd", 'x', 'y'));
    }
}

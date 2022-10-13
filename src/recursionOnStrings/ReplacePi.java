package recursionOnStrings;

public class ReplacePi {
    public static String replacePi(String s) {
       //base case
        if (s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {
            //run recursion on string of length n-2;\
            //Induction Hypothesis
            String smallStr = replacePi(s.substring(2));
            //induction step;
            return "3.14" + smallStr;

        } else {
            //run recursion on string of length n-1
            String smallStr = replacePi(s.substring(1));
            return s.charAt(0) + smallStr;
        }
    }

    public static void main(String[] args) {
        System.out.println(replacePi("piabcpi"));
    }
}

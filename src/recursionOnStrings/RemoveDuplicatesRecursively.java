package recursionOnStrings;

//Given a string S, remove consecutive duplicates from it recursively.
public class RemoveDuplicatesRecursively {
    public static String removeDuplicates(String s) {
        if(s.length()<=1){
            return s;
        }
        if (s.charAt(0) == s.charAt(1)) {
//            String smallStr = removeDuplicates(s.charAt(1)+s.substring(2));
//            return smallStr;
            return removeDuplicates(s.substring(1));
        }else{
            String smallStr = removeDuplicates(s.substring(1));
            return s.charAt(0) + smallStr;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("xxxyyyzzzzwxxwwy"));
    }
}

package ahmeteg;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));

    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){

         t= t.replaceFirst(String.valueOf(s.charAt(i)),"");

        }
        if(t=="")
        return true;
        else return false;
    }
}

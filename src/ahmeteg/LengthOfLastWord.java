package ahmeteg;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }
    public static int lengthOfLastWord(String s) {

        s=s.trim();
        for (int i=s.length()-1;i>-1;i--){
            if(s.charAt(i)==' ')
                return s.length()-i-1;
        }
        return s.length();
    }
}

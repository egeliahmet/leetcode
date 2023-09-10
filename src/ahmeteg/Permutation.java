package ahmeteg;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        checkInclusion("ba","eidbaooo");
    }
    public static boolean checkInclusion(String s1, String s2) {

        boolean result=false;
        char[] s1Array=new char[s1.length()];

        for(int i=0;i<s1.length();i++){
            s1Array[i]=s1.charAt(i);
        }
        Arrays.sort(s1Array);
        String sorted=new String(s1Array);

        for(int i=0;i<s2.length()-s1.length();i++){
            char[] chars1 = new char[s1.length()];
            s2.getChars(i, i+s1.length(), chars1, 0);
            Arrays.sort(chars1);
            String value=new String(chars1);
            if(sorted.equals(value)){
                return true;
            }
        }
        return result;
    }
}

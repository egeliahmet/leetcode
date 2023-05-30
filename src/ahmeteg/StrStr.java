package ahmeteg;

public class StrStr {
    public static void main(String[] args) {
        String haystack="sodbutsad";
        String needle="sad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return  -1;
        if(needle.length()==haystack.length()&&!needle.equals(haystack))
            return -1;


        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            String s=haystack.substring(i,i+needle.length());
            if(s.equalsIgnoreCase(needle)){
                return i;}

        }

        return -1;
    }
}

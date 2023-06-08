package ahmeteg;

public class MergeAlternately {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","pqrs"));
    }
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<word1.length();i++){
            builder.append(word1.charAt(i));
            if(word2!=""){
                builder.append(word2.charAt(0));
                word2=word2.substring(1);
            }
        }
        builder.append(word2);
        return builder.toString();
    }
}

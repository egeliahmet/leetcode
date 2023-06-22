package ahmeteg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("bbbbbb"));
    }
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set=new HashSet<>();
        StringBuilder builder=new StringBuilder();
        ArrayList<String> subString=new ArrayList<>();
       int first=0;
       int last=1;
       set.add(s.charAt(first));
       builder.append(s.charAt(first));
        while(last<s.length()){
           if(!set.contains(s.charAt(last))){
               set.add(s.charAt(last));
               builder.append(s.charAt(last));
               last++;
           }
           else {
               first++;
               last=first+1;
               subString.add(builder.toString());
               set=new HashSet<>();
               builder=new StringBuilder();
               set.add(s.charAt(first));
               builder.append(s.charAt(first));
           }
        }

        subString.add(builder.toString());
        return subString.stream().map(s1 -> s1.length()).max(Integer::compare).get();

    }
}

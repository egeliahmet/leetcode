package ahmeteg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {

                String[] input=new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(input).forEach(e->{System.out.println();
        e.forEach(System.out::print);});
        int a='a';
        char x= (char) ( a+4);
        System.out.println(a);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();

      List<String> temp=new ArrayList<>();
      temp.add(strs[0]);
        result.add(temp);
       for(int i=1;i<strs.length;i++){
           boolean flag=false;
           for(int j=0;j<result.size();j++){

               if(isAnagram(result.get(j).get(0),strs[i]))
               {
                   result.get(j).add(strs[i]);
                   flag=true;
                   break;
               }

           }
              if(!flag){
               temp=new ArrayList<>();
               temp.add(strs[i]);
               result.add(temp);

           }
       }

        return result;
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++){

            t=t.replaceFirst(String.valueOf(s.charAt(i)),"");

        }
        if(t.equals(""))
            return true;
        else return false;
    }
}

package ahmeteg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MostFrequent {
    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {

        //List<List<Integer>> result=new ArrayList<>();
        //result.add();

        HashMap<String,Integer> frequency=new HashMap();
        List<FreqWord> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(frequency.containsKey(words[i])){
                frequency.put(words[i],frequency.get(words[i])+1);
            }
            else
                frequency.put(words[i],1);
        }

        frequency.forEach((s, integer) ->result.add(new FreqWord(s,integer)));
        return result.stream().
                sorted(Comparator.comparing(FreqWord::freq).
                        reversed().
                        thenComparing(FreqWord::word)).
                limit(k).map(FreqWord::word).toList();
    }
    record FreqWord(String word,Integer freq){}
}

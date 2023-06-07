package ahmeteg;

import java.util.HashMap;
import java.util.Optional;

public class SingleNumber {
    public static void main(String[] args) {
        singleNumber(new int[]{4,1,2,1,2});
    }
    public static int singleNumber(int[] nums) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        return map.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findAny().get();
    }
}

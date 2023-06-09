package ahmeteg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        majority(new int[]{3,2,3});
    }
    public static int majority(int [] nums){

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
           if(hashMap.containsKey(nums[i])){
               hashMap.put(nums[i],hashMap.get(nums[i])+1);
           } else hashMap.put(nums[i],1);
        }

        for (Map.Entry<Integer,Integer> entry: hashMap.entrySet())
        {
           if(entry.getValue()> nums.length/2);
           return entry.getKey();
        }
        return 0;

    }
}

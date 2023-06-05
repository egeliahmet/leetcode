package ahmeteg;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
       sumary(new int[]{0,1,2,4,5,7});
    }
    public static List<String> sumary(int[] nums){
        List<String> list  =new ArrayList<>();

        int first=0;

        for(int i=0;i<nums.length;i++){
            first=i;
            while(i<nums.length-1&&(nums[i]+1==nums[i+1])){
                i++;
            }
            if(first==i){
                list.add(String.valueOf(nums[i]));
            }
            else{
                list.add(String.valueOf(nums[first])+"->"
                        +String.valueOf(nums[i]));

            }
        }

        return list;
    }

}

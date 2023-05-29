package ahmeteg;

import java.util.HashSet;

public class RemoveDublicades {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set =new HashSet<Integer>();
        int[] expected=new int[nums.length];
        int k=0;
        set.add(nums[0]);
        expected[0]=nums[0];
        k=1;
        if(nums.length==1)
            return 1;
        for(int i=1;i<nums.length;i++){
            if(!set.contains(nums[i])){
                k++;
                expected[k]=nums[i];
                set.add(nums[i]);
            }
        }
return k;
    }
}

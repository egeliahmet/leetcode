package ahmeteg;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        List<List<Integer>> sum=  threeSum(new int[]{-2,0,1,1,2});

    }
        public static List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);


            HashSet<List<Integer>> solution= new HashSet<>()   ;
            for(int i=0;i<=nums.length-3;i++){
                int second=i+1;
                int third=nums.length-1;

                while(((nums[i]+nums[second]+nums[third])<0)&&second<third-1){
                    second++;
                }
                while(((nums[i]+nums[second]+nums[third])>0)&&second<third-1){
                    third--;
                }
                if((nums[i]+nums[second]+nums[third])==0){

                    solution.add(Arrays.asList(nums[i],nums[second],nums[third]));
                }

            }
            return solution.stream().toList();
        }


}

package ahmeteg;

public class MaxSubArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        if(nums.length==1)
            return nums[0];

        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int max=sum;

        int left=0;
        int right=nums.length-1;

        while(left<right){

            if(nums[left]>nums[right]){
                sum-=nums[right];
                right--;
                if(sum>max)
                    max=sum;
            }
            else if(nums[left]<nums[right]){
                sum-=nums[left];
                left++;
                if(sum>max)
                    max=sum;
            }
            else{
                if(nums[left+1]>nums[right-1]){
                    sum-=nums[right];
                    right--;
                    if(sum>max)
                        max=sum;
                }
                else{
                    sum-=nums[left];
                    left++;
                    if(sum>max)
                        max=sum;
                }
            }

        }

        return max;
    }
}

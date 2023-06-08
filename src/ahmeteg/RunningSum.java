package ahmeteg;

public class RunningSum {
    public static void main(String[] args) {

    }
    public static int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){

            for(int j=0;j<=i;j++){
                sum=sum+nums[j];
            }
            result[i]=sum;
            sum=0;
        }
        return result;
    }
}

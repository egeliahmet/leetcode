package ahmeteg;

public class RunningSum {
    public static void main(String[] args) {
      String s="egg";
      String t="add";
      for(int i=0;i<s.length();i++){
          s=s.replace(s.charAt(i),'a');
      }

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

package ahmeteg;

public class MissingNumber {
    public static void main(String[] args) {

    }
    public static int missingNumber(int[] nums) {
        int[] array=new int[nums.length+1];
        for(int i=0;i<nums.length;i++)
            array[nums[i]]=1;

        for(int i=0;i<array.length;i++){
            if(array[i]==0)
                return i;
        }
        return 0;
    }
}

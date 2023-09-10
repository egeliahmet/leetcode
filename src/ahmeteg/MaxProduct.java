package ahmeteg;

public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,-1,4}));
    }
    public static int maxProduct(int[] nums) {

        int max=Integer.MIN_VALUE;
        int current=1;
        int min=nums[0];
        if(nums.length==1)
            return nums[0];
        boolean flag=false;
        int control=1;
        for(int i=0;i<nums.length;i++){
            control*=nums[i];
        }
        if(control>0){
            return control;
        }
        for(int i=0;i<nums.length;i++){


            current*=nums[i];

            if(current>max)
                max=current;
            if(current<min)
                min=current;

            if(current ==0&&max==-min)
                current=1;


        }
        return max;
    }
}

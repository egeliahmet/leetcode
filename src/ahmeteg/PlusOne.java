package ahmeteg;

public class PlusOne {
    public static void main(String[] args) {

        int[] nums={9,8,9};
        int[] k=plusOne(nums);
        for (int i=0;i<k.length;i++)
            System.out.print(k[i]+",");
    }
    public static int[] plusOne(int[] nums){
        if(nums.length==1){
            if(nums[0]==9)
                return new int[]{1,0};
            else{
                nums[0]=nums[0]+1;
                return nums;
            }
        }
      int remainder=0;
        if(nums[nums.length-1]==9){
            nums[nums.length-1]=0;
            remainder=1;
        }
        else {
            nums[nums.length-1]=nums[nums.length-1]+1;
            return nums;
        }
       int index= nums.length-1;
     while(remainder==1){
         index--;
         if(index==0){
             if(nums[index]==9){
                 nums[index]=0;
                 int[] array=new int[nums.length+1];
                 array[0]=1;
                 for(int i=1;i<array.length;i++){
                     array[i]=nums[i-1];
                 }
                 return array;
             }
             else{
                 nums[index]=nums[index]+1;
                 return nums;
             }
         }else{
             if(nums[index]==9)
                 nums[index]=0;
             else{
                 nums[index]=nums[index]+1;
                 remainder=0;
             }

         }
     }

        return nums;
    }
}

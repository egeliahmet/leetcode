package ahmeteg;

public class SearchInsert {
    public static void main(String[] args) {
       int num[] ={1,3,4,6};
        System.out.println(searchInsert(num,6));
    }

    public static int searchInsert(int[] nums, int target) {

        int index=0;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int midle=(start+end)/2;
            if(target>nums[midle]){

                start=midle+1;
                if(start>end)
                    return start;

            }
            else if(target<nums[midle]){
                end=midle-1;
                if(start>end)
                    return start;
            }
            else{
                index=midle;
               return index;
            }


        }

        return index;
    }
}

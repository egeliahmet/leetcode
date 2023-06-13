package ahmeteg;

import java.util.Arrays;
import java.util.stream.Stream;

public class LargestKth {
    public static void main(String[] args) {


    }
     private class KthLargest{
        int k;
        int[] nums;
         public KthLargest(int k, int[] nums) {
             this.k=k;
             this.nums=nums;

         }
         public int add(int val) {
             int[] temp=new int[1];
             temp[0]=val;

             return 0;
         }
    }
}

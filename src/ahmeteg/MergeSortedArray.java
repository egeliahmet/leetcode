package ahmeteg;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){

        int i=m-1;
        if(m==0)
            i=0;

        int j=n-1;
        if(m==0)

            for(int k=nums1.length-1;k>=0;k--){
                if(n>=0){
                    if(nums1[i]>nums2[j]){
                        nums1[k]=nums1[i];
                        i--;
                    }
                    else{
                        nums1[k]=nums2[j];
                        j--;
                    }
                }
            }
        }





}

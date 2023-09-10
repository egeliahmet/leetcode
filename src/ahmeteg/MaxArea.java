package ahmeteg;

public class MaxArea {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,4,3}));
    }
    public static int maxArea(int[] height) {
        int result=0;

        int first=height[0];
        int firstIndex=0;
        int current=0;


        for(int i=1;i<height.length;i++){

            int distance=i-firstIndex;
            int min=Math.min(first,height[i]);

            current=distance*min;
            if(current>result)
                result=current;

            if(height[i]>first&&height[i]>distance+1){
                first=height[i];
                firstIndex=i;

            }

        }
        return result;
    }
}

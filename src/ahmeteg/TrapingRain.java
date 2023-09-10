package ahmeteg;

public class TrapingRain {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,3}));
    }
    public static int trap(int[] height) {

        int sum=0;
        int first=0;
        int second=first+1;
        int tempSum=0;
        int limit=0;
        boolean flag=false;
        while(first<height.length-2){
            if(second>=height.length)
            {
                limit=first;
                tempSum=0;
                flag=true;
                break;
            }
            if(height[first]>height[second]){
                tempSum+=height[first]-height[second];
                second++;
            }
            else if(height[first]<=height[second]){
                if((second-first)==1){
                    first=second;
                    second++;
                }else{
                    sum+=tempSum;
                    first=second;
                    second++;
                    tempSum=0;
                }
            }
        }
       if(flag){
           first=height.length-1;
           second=first-1;
           while (first>limit){
               if(height[first]>height[second]){
                   tempSum+=height[first]-height[second];
                   second--;
               }else if(height[first]<=height[second]){
                   if((first-second)==1){
                       first=second;
                       second--;
                   }else{
                       sum+=tempSum;
                       first=second;
                       second--;
                       tempSum=0;
                   }
               }

           }
       }

        return sum;
    }
}

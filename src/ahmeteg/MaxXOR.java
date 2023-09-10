package ahmeteg;

public class MaxXOR {
    public static void main(String[] args) {
        System.out.println(maxXor(4));
    }
    public static int maxXor(int num){


        int tempnum=num;
        int length=0;

        while(tempnum>0){
            tempnum>>=1;
            length++;
        }
        int maxNum=0;
        for(int i=length-1;i>=0;i--){
            maxNum= (int) (maxNum+(Math.pow(2,i)));
        }

        int maxValue=0;
        int maxReturn=num;
        int val=num;
        for(int i=num+1;i<maxNum+1;i++){
            val=i^val;
            if(val>maxValue){
                maxValue=val;
                maxReturn=i;
            }
        }
        return maxReturn;
    }
}

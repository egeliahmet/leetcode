package ahmeteg;

public class Flowerbed {
    public static void main(String[] args) {
        canPlaceFlowers(new int[]{0,0,1,0,0},1);
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length==1){
            if(flowerbed[0]==0&&n<=1)
                return true;
            else if(flowerbed[0]==1&&n==0)
                return true;
            else return false;
        }
        if(flowerbed.length==2){
            if(flowerbed[0]==0&&flowerbed[1]==0&&n<=1)
                return true;
            else return false;
        }
        int turn=n;
        for(int i=0;i<n;i++){
            for(int j=1;j<flowerbed.length-1;j++){
                if(flowerbed[0]==0&&flowerbed[1]==0){
                    flowerbed[0]=1;
                    n--;
                    continue;
                }
                if(flowerbed[flowerbed.length-1]==0&&
                        flowerbed[flowerbed.length-2]==0){
                    flowerbed[flowerbed.length-1]=1;
                    n--;
                    continue;
                }
                if(flowerbed[j]==0&&flowerbed[j-1]==0&&flowerbed[j+1]==0){
                    n--;
                    flowerbed[j]=1;
                }

            }

        }
        return n==0;
    }
}

package ahmeteg;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));

    }
    public static int climbStairs(int n){

        int arr[] = new int[n];
        arr[0]=1;
        if(n ==1){
            return 1;
        }
        arr[1]=2;

        if(n ==2){
            return 2;
        }

        for(int i = 2 ; i< n; i++){
            arr[i] = arr[i-1] + arr[i-2];

        }
        return arr[n-1];
    }
}

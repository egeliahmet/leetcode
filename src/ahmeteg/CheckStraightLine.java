package ahmeteg;

public class CheckStraightLine {
    public static void main(String[] args) {
        checkStraightLine(new int[][]{{1,2},{1,3},{1,4},{1,5},{1,6},{6,7}});
        String s="df";
    }
    public static boolean checkStraightLine(int[][] coordinates){
        int firstSum=coordinates[0][0]-coordinates[1][0];
        int secondSum=coordinates[0][1]-coordinates[1][1];
        boolean first=true;
        boolean second=true;
        for(int i=1;i<coordinates.length;i++){
            if(coordinates[i-1][0]-coordinates[i][0] !=firstSum) {
                first=false;
                break;
            }
        }
        for(int i=1;i<coordinates.length;i++){
            if(coordinates[i-1][1]-coordinates[i][1] !=secondSum) {
                second=false;
                break;
            }
        }
        if(firstSum==0||secondSum==0)
            return first||second;
        else return first&&second;
    }
}

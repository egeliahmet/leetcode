package ahmeteg;

import java.util.ArrayList;
import java.util.HashMap;

public class EqualPairs {
    public static void main(String[] args) {
        int[][] nums=new int[][] {{11,1},{1,11}};
        equalPairs(nums);
        System.out.println(" " +nums[1][0]);
    }
    public static int equalPairs(int[][] grid) {

        ArrayList<String> rows=new ArrayList<>();

        ArrayList<String > columns=new ArrayList<>();
        int length=grid.length;
        for(int i=0;i<length;i++){
            String row="";
            String column="";
            for(int j=0;j<length;j++){
                row=row+" "+grid[i][j];
                column=column+" "+grid[j][i];

            }
            System.out.println("row"+row);
            System.out.println("column:"+column);
            rows.add(row);
            columns.add(column);
        }
        int result=0;
        for(String colum:columns){
            for (String ro:rows) {
                if(colum.equals(ro))
                    result++;
            }
        }

        return result;
    }
}

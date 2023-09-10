package ahmeteg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Sudoku {
    public static void main(String[] args) {
        HashSet<List<Integer>> solution=new HashSet<>();

        solution.add(Arrays.asList(1,2,3));
        solution.add(Arrays.asList(1,2,3));
        solution.add(Arrays.asList(3,2,3));

        List<List<Integer>> c=solution.stream().toList();
    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<List<Integer>> solution=new HashSet<>();

        solution.add(Arrays.asList(1,2,3));
        solution.add(Arrays.asList(1,2,3));
        solution.add(Arrays.asList(3,2,3));

        List<List<Integer>> c=solution.stream().toList();

        solution.stream().toList();
        boolean flag=true;
        for(int i=0;i<9;i++){
            HashSet<Character> column=new HashSet<>();
            HashSet<Character> row=new HashSet<>();
            for(int j=0;j<9;j++){
                if(column.contains(board[i][j]))
                    return false;
                else
                    column.add(board[i][j]);

                if(row.contains(board[j][i]))
                    return false;
                else
                    column.add(board[j][i]);
            }
        }
        return flag;
    }
}

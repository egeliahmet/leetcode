package ahmeteg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CircularGameLosers {
    public static void main(String[] args) {

        int[] dongu=circularGameLosers(5,2);
        for(int i=0;i<dongu.length;i++){
            System.out.print(" "+i);
        }

    }
    private static int[] circularGameLosers(int n,int k){
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=i+1;
        }

            int index=0;
        array[index]=0;

        for(int i=1;i<n;i++){

            index=(index+i*k)%n;
            if(array[index]==0)
                break;
            else
                array[index]=0;
        }

        List<Integer> result=new ArrayList<>();
        for (int i=0;i<n;i++){
        if(array[i]!=0)
            result.add(array[i]);
        }
int[] fin=result.stream().mapToInt(i->i).toArray();
        return fin;
    }
}

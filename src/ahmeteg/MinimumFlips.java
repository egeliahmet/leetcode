package ahmeteg;

public class MinimumFlips {
    public static void main(String[] args) {
       // System.out.println(minFlips(10,9,1));
        System.out.println(3>>1);
    }
    public static int minFlips(int a, int b, int c) {

        if(a+b==c)
            return 0;
        String aBinary=toBinary(a);
        String bBinary=toBinary(b);
        String cBinary=toBinary(c);



        int maxindex=Math.max(aBinary.length(),bBinary.length());
        maxindex=Math.max(maxindex,cBinary.length());
        aBinary=fillZeros(aBinary,maxindex);
        bBinary=fillZeros(bBinary,maxindex);
        cBinary=fillZeros(cBinary,maxindex);


        int result=0;
        for(int i=0;i<maxindex;i++){

            if(aBinary.charAt(i)!=bBinary.charAt(i)&&cBinary.charAt(i)=='0')
                result++;
            else if(aBinary.charAt(i)=='1'&&bBinary.charAt(i)=='1'&&cBinary.charAt(i)=='0')
                result+=2;
            else if(aBinary.charAt(i)=='0'&&bBinary.charAt(i)=='0'&&cBinary.charAt(i)=='1')
                result++;
        }



        return result;

    }
   public static String fillZeros(String input,int size){

        if(input.length()==size)
            return input;
        else{
            size=size-input.length();
            for(int i=0;i<size;i++){
                input="0"+input;
            }
            return input;

        }
}
    public static String toBinary(int num){
        int index=0;
        for(int i=0;num>=Math.pow(2,i);i++)
        index=i;
        int[] result=new int[index+1];
        result[index]=1;
        num -= Math.pow(2, index);

       while(num>0){
           for(int i=0;num>=Math.pow(2,i);i++)
               index=i;
           result[index]=1;
           num -= Math.pow(2, index);
       }
       StringBuilder builder=new StringBuilder();
        for(int i=result.length-1;i>=0;i--){
            builder.append(result[i]);
        }
     return builder.toString();
    }
}

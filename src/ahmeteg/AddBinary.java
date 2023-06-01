package ahmeteg;

public class AddBinary {
    public static void main(String[] args) {
        String a="100";
        String b="110010";
        System.out.println(addBinary(a,b));
    }
    public static String addBinary(String a, String b) {
        if(a.length()>b.length()){
            int difference=a.length()-b.length();
            for(int i=0;i<difference;i++)
                b="0"+b;}
        else if(a.length()<b.length()){
            int difference=b.length()-a.length();
            for(int i=0;i<difference;i++)
                a="0"+a;}
        int reminder=0;
        for(int i=a.length()-1;i>=0;i--){

            if(a.charAt(i)!=b.charAt(i)){
                StringBuilder string=new StringBuilder(a);
                if(reminder==0){
                    string.setCharAt(i,'1');
                }
                else{
                    string.setCharAt(i,'0');
                }
                a= string.toString();
            }else if(a.charAt(i)==b.charAt(i)&&b.charAt(i)=='1'){
                StringBuilder string=new StringBuilder(a);

                if(reminder==0){
                    string.setCharAt(i,'0');
                    reminder=1;
                }
                else{
                    string.setCharAt(i,'1');
                }
                a= string.toString();
            }else if(a.charAt(i)==b.charAt(i)&&b.charAt(i)=='0'){
                StringBuilder string=new StringBuilder(a);
                if(reminder==0){
                    string.setCharAt(i,'0');

                }
                else{
                    string.setCharAt(i,'1');
                    reminder=0;
                }
                a= string.toString();
            }
        }
        if(reminder==1)
            return "1"+a;
        else return a;
    }
}

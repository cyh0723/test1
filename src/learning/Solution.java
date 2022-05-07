package learning;

public class Solution {
    public int myAtoi(String s){
        char[] chars=s.toCharArray();
        int n=0;
        int flag=1;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                continue;
            }else if ((chars[i]>='a'&&chars[i]<='z')||(chars[i]>='A'&&chars[i]<='Z')){
                continue;
            }else if (chars[i]=='-'){
                flag=-1;
                continue;
            }
            n=n*10+Integer.parseInt(String.valueOf(chars[i]));


        }
        n=n*flag;
        return n;
    }
}

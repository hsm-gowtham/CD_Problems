package ChellaDurai_Problems.Test_ques;

import java.util.*; 
public class ConditionalString {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        
        String str ="";
        int n = s.length();
        for(int i=0;i<n-1;i++){
            if(Character.toLowerCase(s.charAt(i))=='z' && Character.toLowerCase(s.charAt(i+1))=='z')
            	str+="z0";
            else if((Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(i+1)))){
                int sum= (Character.toLowerCase(s.charAt(i))-'a') + (Character.toLowerCase(s.charAt(i+1))-'a') + 2;
                
                if(sum>26) 
                	sum-=26;
                char y = (char)(sum+'a'-1);
                str+=Character.toString(Character.toLowerCase(s.charAt(i)))+Character.toString(y);
            }
            else 
            	str+=Character.toString(Character.toLowerCase(s.charAt(i)));
        }
        str+=Character.toString(Character.toLowerCase(s.charAt(n-1)));
        System.out.print(str);
        sc.close();
    }
}
package Basics_Must_Know;
//program to print count of spl char
public class AsciiValues {
// 48 to 57(0-9), 65 to 90(A-Z), 97 to 122(a-z), space (32)
	public static void main(String[] args) {
		String s="abc $%^ 124 123kjd *";
		int l=s.length();
		int c=0;
		for(int i=0;i<l;i++)
		{
			if((s.charAt(i)!=32)&&(s.charAt(i)<48||s.charAt(i)>57)&&(s.charAt(i)<97)||(s.charAt(i)>97)&&(s.charAt(i)<65)||(s.charAt(i)>122))
			{
				c++;
			}
		}
		System.out.println(c);
	}

}

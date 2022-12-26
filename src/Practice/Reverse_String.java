package Practice;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sangita najan";
		String s1=" ";
		
		String[]st=s.split(" ");
		
		
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.println(st[i]+" ");
		}}}
		
		/*
String s="12345";

String s1="";

int leng=s.length();
for(int i=leng-1;i>=0;i--)
{
char ch =s.charAt(i);
s1=s1+ch;
{
System.out.println(s1);}}}
}*/

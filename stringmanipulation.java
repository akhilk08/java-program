import java.util.*;
class stringmanipulation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter the first string:");
		s1=sc.nextLine();
		System.out.println("length of the string: "+s1.length());
		System.out.println("string in lowercase: "+s1.toLowerCase());
		System.out.println("string in uppercase: "+s1.toUpperCase());
		System.out.print("Enter the second string: ");
		s2=sc.nextLine();
		System.out.println("concatination of string: "+s1.concat(s2));
		System.out.println("substrin from index 1 to 5: "+s1.substring(1,5));
	}
}

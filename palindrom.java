import java.io.*;
class palindrom
{
	public static void main(String arg[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		String f;
		do
		{
		System.out.println("*********************************************");
		System.out.print("Enter a number:");	
		int a=Integer.parseInt(br.readLine());
		int n=a;		
		int d,r=0;
		do
		{
			d=n%10;
			r=r*10+d;
			n=n/10;
		}while(n!=0);
		if(a==r)
			System.out.println("It is a palindrom number:  "+a);
		else
			System.out.println("It is not a palindrom number:  "+a);
		System.out.print("Do you want to continue:");
		f=br.readLine();
		}while(f.equalsIgnoreCase("yes"));
	}
}
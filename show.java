import java.io.*;
public class show 
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
		int z=a;								
		int p,b;
		double r;
		p=z*z;									
		b=a/10;									
		r=p%(Math.pow(10,b));					
		if(z==r)
		System.out.println("It is a automorphic number");
		else
		System.out.println("It is not an automorphic number");
		System.out.print("Do you want to test another number:");
		f=br.readLine();
		}while(f.equalsIgnoreCase("Yes"));
	}
	

}

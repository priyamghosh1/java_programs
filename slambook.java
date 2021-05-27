import java.io.*;
public class slambook
{
    public static void main(String arg[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String st;
	do
	{
		System.out.println("**************************************************");
        System.out.print("Please enter your full name : ");
        String a=(br.readLine());
        System.out.print("Enter your nick name : ");
        String b=(br.readLine());
        System.out.print("Enter your address : ");
        String c=(br.readLine());
        System.out.print("Date of birth : ");
        String d=(br.readLine());
        System.out.print("your 1st love : ");
        String e=(br.readLine());
        System.out.print("your 2nd love : ");
        String f=(br.readLine());
        System.out.print("your hobby : ");
        String g=(br.readLine());
        System.out.print("Person you like : ");
        String h=(br.readLine());
        System.out.print("Best gift : ");
        String i=(br.readLine());
        System.out.print("Best colour : ");
        String j=(br.readLine());
        System.out.print("Best place : ");
        String k=(br.readLine());
        System.out.print("your best food : ");
        String l=(br.readLine());
        System.out.print("Crazy about : ");
        String m=(br.readLine());
        System.out.print("love is : ");
        String n=(br.readLine());
        System.out.print("Live without lover(yes/no) : ");
        String o=(br.readLine());
        System.out.print("Best flim : ");
        String p=(br.readLine());
        System.out.print("Best song : ");
        String q=(br.readLine());
        System.out.print("your phone no : ");
        String r=(br.readLine());
	System.out.print("Do you want to fill a new slambook : ");
	st=br.readLine();
	}while(st.equalsIgnoreCase("Yes"));
    }
}

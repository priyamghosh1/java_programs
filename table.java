import java.io.*;
public class table
{
    public static void main(String arg[])throws IOException
    {
String st;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("************************************************");
System.out.print("Enter the table number u want to see:");
int a=Integer.parseInt(br.readLine());
System.out.print("Till : ");
        int i,multi;
        int r=Integer.parseInt(br.readLine());
        System.out.println("The table of "+a);
        for(i=1;i<=r;i++)
        {
            multi=i*a;
            System.out.println(a+"*"+i+"="+multi);
        }
System.out.print("Do you want to see another table: ");
st=br.readLine();
}while(st.equalsIgnoreCase("Yes"));
    }
}

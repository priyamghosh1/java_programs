import java.io.*;
public class str
{
public void xx(String x,String z)
{
System.out.println(x+" and "+z+" are good friends");
}
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter two name:");
System.out.print("1st name: ");
String a=br.readLine();
System.out.print("2nd name: ");
String b=br.readLine();
str ob=new str();
ob.xx(a,b);
}
}
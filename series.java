import java.io.*;
public class series
{
public static void main(String ar[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,max=0,min=99999999;String st;
System.out.println("The Greatest and Smallest no.....");
do{
System.out.println("********************************************************");
System.out.print("Within how many number:");
int x=Integer.parseInt(br.readLine());
System.out.println("Now enter "+x+" number: ");
for(i=0;i<x;i++)
{
int a=Integer.parseInt(br.readLine());
if(a>max)
{
max=a;
}
if(a<min)
{
min=a;
}
}
System.out.println("The largest no is: "+ max);
System.out.println("The smallest no. is: "+min);
System.out.print("Do u want to continue: ");
st=br.readLine();
}while(st.equalsIgnoreCase("Yes"));
}
}

import java.io.*;
public class input
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k=0,l=0;
System.out.print("Enter ur name: ");
String a=br.readLine();
int d=a.length();
if(d==0){
System.out.println("you have not entered ur name");
k=1;
}
System.out.print("Acc. no.: ");
String b=br.readLine();
int e=b.length();
if(e==0){
System.out.println("You have not entered ur acc. no.");
l=1;
}
System.out.print("Enter amount: ");
int c=Integer.parseInt(br.readLine());
if((k==1)&&(l==1)||k==1||l==1)
System.out.println("Sorry we cannot withdraw bcoz u have missed something plz check");
else
System.out.println("U have withdrawed RS. "+c+" from ur acc.");
}
}
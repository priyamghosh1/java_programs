import java.util.*;
public class calender{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a date: ");
String v=sc.nextLine();
String s[]={"friday","saturday","sunday","monday","tuesday","wednesday","thursday"};
int a=Integer.parseInt(v);
int b=a%7,c=0,i;
for(i=0;i<b;i++){
if(b!=0)
c++;
}
if(b!=0)
System.out.println(s[c-1]);
else
System.out.println(s[6]);
}
}
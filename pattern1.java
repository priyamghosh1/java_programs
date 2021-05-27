import java.util.*;
public class pattern1{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.print("\n\n\n\nEnter the last no. ");
int a= sc.nextInt();a=a+1;
int i,c=0,b=0,j;
float c2=0;
for(i=1;i<=a;i++){
c=c+i;b=b+1;
if(c>=3){
System.out.print("1/"+c);
if(b!=a)
System.out.print(" + ");
c2=c2+1/(float)c;
}
else
continue;
}
System.out.println(" = "+c2);
}}
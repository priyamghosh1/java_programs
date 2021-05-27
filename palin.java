import java.util.*;
public class palin{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a word : ");
String a=sc.nextLine();String str =" ";char c;
String n=a;
int b=a.length();
int i;
for(i=0;i<b;i++){
c=a.charAt(i);
str= c+str;
}System.out.println("The reverse string is : "+ str);
if(n==str){
System.out.println("It is a palindrom string ");
}
else{
System.out.println("It is not a palindrom string");
}
}
}
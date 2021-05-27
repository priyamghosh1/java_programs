import java.util.*;
public class binary {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number to be converted: ");
        int a =sc.nextInt();
        String str = "";
        int n=a,r=0;
	if(a==1){
	System.out.println("1");}
	else{
        while(n!=0){
            r=n%2;
            str =r+str;
            n=n/2;
        }
        System.out.println("The converted number is: " + str);}
    }
}
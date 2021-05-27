import java.util.*;
public class factorial {
    public static void main(String arg[]){
	System.out.println("\n\n\n\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i=sc.nextInt();
        int n=i,j,d=0,t=0;
        do{
            int s=1;
            d=n%10;
            for(j=d;j>=1;j--)
                s=s*j;
            t=t+s;
           n=n/10;
        }while(n!=0);
        if(t==i)
        System.out.println("This is a special number : "+t);
        else
        System.out.println("This is not a special number : "+t);
    }
}

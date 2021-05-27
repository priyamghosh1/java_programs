import java.util.*;
public class calender2{
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter month / date / year ");
String month=sc.nextLine();
//int date=sc.nextInt();
int y=sc.nextInt();

String months[] = {"","january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
        int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        {
            D[2]=29;
        }
       int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(month.equalsIgnoreCase(months[i]))
            {
                max = D[i];  
            }
        }
	System.out.println(max);


	String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday"};
        int f = 0;
        for(int i=0; i<7; i++)
        {
            if(wname.equalsIgnoreCase(days[i]))
            {
                f = i; 
            }
        }System.out.println(max);
}
}
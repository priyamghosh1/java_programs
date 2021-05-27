import java.util.*;
public class time{
public static void main(String arg[]){
int hrs=0,min=0,sec=0,k=0;
Scanner sc=new Scanner(System.in);do{k=0;
System.out.print("Enter 1st time: ");
String a=sc.nextLine();
System.out.print("Enter 2nd time: ");
String b=sc.nextLine();
int leng1=a.length(),leng2=b.length();
if((leng1==15)&&(leng2==15)){
char ab=a.charAt(0);
char gh=a.charAt(1);
char bc=a.charAt(5);
char cd=a.charAt(6);
char ij=a.charAt(10);
char jk=a.charAt(11);
char de=b.charAt(0);
char hi=b.charAt(1);
char ef=b.charAt(5);
char fg=b.charAt(6);
char kl=b.charAt(10);
char lm=b.charAt(11);
String c=(Character.toString(bc))+(Character.toString(cd));
String d=(Character.toString(ef))+(Character.toString(fg));
String e=(Character.toString(ab))+(Character.toString(gh));
String f=(Character.toString(de))+(Character.toString(hi));
String g=(Character.toString(ij))+(Character.toString(jk));
String h=(Character.toString(kl))+(Character.toString(lm));
hrs=Integer.parseInt(e)+Integer.parseInt(f);
min=Integer.parseInt(c)+Integer.parseInt(d);
sec=Integer.parseInt(g)+Integer.parseInt(h);
if(sec>59){
min=min+1;
sec=sec-60;
}
if(min>59){
hrs=hrs+1;
min=min-60;
}if((hrs<10)&&(min<10)&&(sec<10))
System.out.print("The output time is: 0"+hrs+"hrs 0"+min+"min 0"+sec+"sec");
else if((hrs<10)&&(min<10))
System.out.print("The output time is: 0"+hrs+"hrs 0"+min+"min "+sec+"sec");
else if((hrs<10)&&(sec<10))
System.out.print("The output time is: 0"+hrs+"hrs "+min+"min 0"+sec+"sec");
else if((min<10)&&(sec<10))
System.out.print("The output time is: "+hrs+"hrs 0"+min+"min 0"+sec+"sec");
else if(hrs<10)
System.out.print("The output time is: 0"+hrs+"hrs "+min+"min "+sec+"sec");
else if(min<10)
System.out.print("The output time is: "+hrs+"hrs 0"+min+"min "+sec+"sec");
else if(sec<10)
System.out.print("The output time is: "+hrs+"hrs "+min+"min 0"+sec+"sec");
else
System.out.print("The output time is: "+hrs+"hrs "+min+"min "+sec+"sec");
System.out.println("\n\n");
}
else {
System.out.print("Wrong inpput please check it...!!! \n\n");
k=1;
}
}while(k==1);
}}

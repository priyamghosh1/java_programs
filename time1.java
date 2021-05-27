import java.util.*;
public class time1{
int hrs=0,min=0,sec=0;
char ab,gh,bc,cd,ij,jk,de,hi,ef,fg,kl,lm;
String a,b,c,d,e,f,g,h;
time1(String x,String y){
a=x;b=y;
time1_calc();
}
void time1_calc(){
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
}display();
}
void display(){
if((hrs<10)&&(min<10)&&(sec<10))
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
public static void main(String arg[]){
Scanner sc=new Scanner(System.in);int leng1,leng2;
int k;
do{k=0;
System.out.print("Enter 1st time: ");
String a1=sc.nextLine();
System.out.print("Enter 2nd time: ");
String b1=sc.nextLine();
leng1=a1.length();leng2=b1.length();
if((leng1!=15)&&(leng2!=15)){k=1;
System.out.println("You have entered something wrong please check it carefully..!!! \n\n");continue;
}
time1 m1=new time1(a1,b1);
}while(k==1);
}}
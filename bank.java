import java.io.*;
public class bank
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String st,q,w,e;int u,qw,qe,qr,qt,qy,qu,qi;
do
{
System.out.println("**************************************");
System.out.println("	Welcome to SBI bank.....");
System.out.println("1.Create account");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Loan");
System.out.print("Enter your choise:");
int a=Integer.parseInt(br.readLine());
switch(a)
{
case 1:do{
System.out.print("Name: ");
q=br.readLine();
qw=q.length();
if(qw==0)
System.out.println("You have not entered you name");}while(qw==0);do{
System.out.print("Address: ");
w=br.readLine();
qe=w.length();
if(qe==0)
System.out.println("You have not entered ur address");}while(qe==0);do{
System.out.print("Date of birth(mm/dd/yyyy): ");
e=br.readLine();
qr=e.length();
if(qr==0)
System.out.println("You have not entered your date of birth");}while(qr==0);do{
System.out.print("Phone no. ");
String r=br.readLine();
qt=r.length();
if(qt!=10)
System.out.println("Something is missing in your ph. no."+qt+" charecter in your ph. no.");}while(qt!=10);do{
System.out.print("Age: ");
String t=br.readLine();
qy=t.length();
if(qy==0)
System.out.println("You have not entered ur age");}while(qy==0);do{
System.out.print("Nomini: ");
String y=br.readLine();
qu=y.length();
if(qu==0)
System.out.println("You have not entered ur nomini");}while(qu==0);
System.out.print("Amount: ");
u=Integer.parseInt(br.readLine());
if(qw==0||qe==0||qr==0||qt!=10||qy==0||qu==0){
System.out.println("We cannot account because something is missing in the above form");
System.out.println("*****Please try again***");
}
else
System.out.println("***THANK YOU FOR CREATING AN ACCOUNT IN SBI***");
break;
case 2:
System.out.print("Name: ");
q=br.readLine();
qw=q.length();
if(qw==0)
System.out.println("You have not entered you name");
System.out.print("Account no.: ");
w=br.readLine();
qe=w.length();
if(qe==0)
System.out.println("You have not entered the account no.");
System.out.print("Amount: ");
u=Integer.parseInt(br.readLine());
if(qw==0||qe==0)
System.out.println("Sorry!! we cannot deposit because something is missing");
else
System.out.println("YOUR RS."+u+" HAVE DEPOSITED IN YOUR ACCOUNT");
break;
case 3:
System.out.print("Name: ");
q=br.readLine();
qw=q.length();
if(qw==0)
System.out.println("You have not entered you name");
System.out.print("Account no.: ");
w=br.readLine();
qe=w.length();
if(qe==0)
System.out.println("You have not entered the account no.");
System.out.print("Amount: ");
u=Integer.parseInt(br.readLine());
if(qw==0||qe==0)
System.out.println("Sorry!! we cannot withdraw because something is missing");
else
System.out.println("YOU HAVE WITHDRAWED RS."+u+" FROM YOUR ACCOUNT");
break;
case 4:
System.out.print("Name: ");
q=br.readLine();
qw=q.length();
if(qw==0)
System.out.println("You have not entered you name");
System.out.print("Account no.: ");
w=br.readLine();
qe=w.length();
if(qe==0)
System.out.println("You have not entered the account no.");
System.out.print("Amount: ");
u=Integer.parseInt(br.readLine());
System.out.print("Enter time: ");
int z=Integer.parseInt(br.readLine());
if(qw==0||qe==0)
System.out.println("Sorry!! we cannot give the loan because something is missing");
else
{
int k=8;double l=0;
l=(u*k*z)/100;
System.out.println("YOU HAVE BEEN GIVEN A LOAN OF "+u);
System.out.println("AND YOU HAVE TO PAY RS."+u+" WITHIN "+z+" YEARS");
}
break;
}
System.out.print("Do you want to continue: ");
st=br.readLine();
}while(st.equalsIgnoreCase("Yes"));
}
}
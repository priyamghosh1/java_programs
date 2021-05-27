import java.io.*;
import java.util.Scanner;
public class project{
int ans,t=0;
public static void main(String arg[])throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
System.out.println("|***********|-------------------------------|****************|");
System.out.println("|***********|   WELCOME TO OUR QUIZ WORLD   |****************|");
System.out.println("|***********|-------------------------------|****************|");
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
System.out.println("|************************************************************|");
String a,b;System.out.print("\n");String qw;int n;do{
System.out.print("\tEnter your name:");qw=br.readLine();
n=qw.length();
if(n==0)
System.out.println("\tYou have not entered your name"+"\n");}while(n==0);
System.out.print("If are ready to play press enter: ");a=br.readLine();int p=0,k=0;
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
project ob=new project();do{
System.out.println("\n");
System.out.println("    |################################|");
System.out.println("    |   Subjects:-                   |");
System.out.println("    |   1. Computer Science          |");
System.out.println("    |   2. Geography                 |");
System.out.println("    |   3. Chemistry                 |");
System.out.println("    |   4. History                   |");
System.out.println("    |################################|");do{
System.out.print("\n");
System.out.print("  Enter your choice (1,2,3 or 4): ");
int ch=Integer.parseInt(br.readLine());k=ch;
System.out.println("");
if(ch==1){
System.out.println("You have choose: Computer Science");
p=ob.computer_science();}
if(ch==2){
System.out.println("You have choose: Geography");
p=ob.geography();}
if(ch==3){
System.out.println("You have choose: Chemistry");
p=ob.chemistry();}
if(ch==4){
System.out.println("You have choose: History");
p=ob.history();}
if(ch>=5){
System.out.println("The choice you have entered does not exist");
}}while(k>=5);
System.out.println("");
System.out.println("        |===============================|");
System.out.println("        |THE TOTAL YOU HAVE SCORED IS:"+p+"|");
System.out.println("        |===============================|");
System.out.print("\n");
System.out.print("Do You Want to continue(yes/no): "); 
b=br.readLine();
}while(b.equalsIgnoreCase("Yes"));
System.out.println("**** Thank You For Visiting *****");
System.out.println("******* Have a Nice Day **********");
}
int computer_science(){
Scanner sc=new Scanner(System.in);do{
System.out.println("Answer the following questions given below");
System.out.println("A. IC chips used in computers usally made of: ");
System.out.println("    1.Lead");
System.out.println("    2.Silicon");
System.out.println("    3.Chromium");
System.out.println("    4.Gold");
System.out.print("  Enter your choise: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2         |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                                |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("B. One Kilobyte is equal to: ");
System.out.println("    1.1000 bytes");
System.out.println("    2.100 bytes");
System.out.println("    3.1024 bytes");
System.out.println("    4.1023 bytes");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==3)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                  |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                  |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("C. Which of the following is not an example of OS?");
System.out.println("    1.Windows 98");
System.out.println("    2.BSD Unix");
System.out.println("    3.Microsoft Office XP");
System.out.println("    4.Red Hat Linux");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==3)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                  |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                  |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                  |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("D. Which Supercomputer is developed by Indian Scientist?");
System.out.println("    1.Param");
System.out.println("    2.Super 301");
System.out.println("    3.Compaq Presario");
System.out.println("    4.CRAY YMP");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                  |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("E. One gigabyte is approximately equal is ");
System.out.println("    1.1000,000 bytes");
System.out.println("    2.1000,000,000 bytes");
System.out.println("    3.1000,000,000,000 bytes");
System.out.println("    4.None of the above");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);
return(t);
}
int geography(){
Scanner sc=new Scanner(System.in);do{
System.out.println("Answer the following questions given below");
System.out.println("A. The Homolographic projection has the correct repesentation of: ");
System.out.println("    1.Shape");
System.out.println("    2.Area");
System.out.println("    3.Baring");
System.out.println("    4.Distance");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("B. The latitudinal differences in pressure delineat a number of major pressure zones, which correspond with: ");
System.out.println("    1.zones of climate");
System.out.println("    2.zones of ocean");
System.out.println("    3.zones of land");
System.out.println("    4.zones of cyclone depression");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("C. The hazard of radiation belts Include: ");
System.out.println("    1.Detoriation of eletric current ");
System.out.println("    2.Damage of solar cells of spacecraft");
System.out.println("    3.Adverse effect on living organism");
System.out.println("    4.All of the above");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==4)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 4                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 4                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 4                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("D. The great Victoria Desert is located in: ");
System.out.println("    1.Canada");
System.out.println("    2.West Africa");
System.out.println("    3.Austrilla");
System.out.println("    4.North America");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==3)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("E. The intersecting lines Drawn on maps and globes are: ");
System.out.println("    1.Latitude");
System.out.println("    2.Longitude");
System.out.println("    3.Geographic grid");
System.out.println("    4.None of the above");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==3)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 3                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);
return(t);
}
int chemistry(){
System.out.println("Answer the following questions given below");
Scanner sc=new Scanner(System.in);do{
System.out.println("A. Bases gets discoloured in air because of the pressure of whish of the following gases in air? ");
    System.out.println("    1.Oxygen");System.out.println(" 2.Hydrogen Sulphide");
    System.out.println("    3.Carbondi oxide");System.out.println(" 4.Nitrogen");
    System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("B. Which of the followinf is a non metal that remains liquid at room temperature?");
System.out.println("    1.Phosphrous");
System.out.println("    2.Bromine");
System.out.println("    3.Chlorine");
System.out.println("    4.Healium");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                                |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("C. Chlorophyll is a naturally occuring chelate compound in which central metal is: ");
System.out.println("    1.Cupper");
System.out.println("    2.Magnissium");
System.out.println("    3.Iron");
System.out.println("    4.Calcium");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("D. Which of the following is used in pencil? ");
System.out.println("    1.Graphite");
System.out.println("    2.Silicon");
System.out.println("    3.Charcoal");
System.out.println("    4.Phosphrous");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("E. Which of the following metal forms an amalgam with other metals? ");
System.out.println("    1.Tin");
System.out.println("    2.Mercury");
System.out.println("    3.Lead");
System.out.println("    4.Zinc");
System.out.print("  Enter your choice: ");ans=sc.nextInt();
if (ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2         |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);
return(t);
}
int history(){
Scanner sc=new Scanner(System.in);do{
System.out.println("Answer the following questions given below");
System.out.println("A. The Battle of Plassey was fought in:");
System.out.println("    1.1757");   
System.out.println("    2.1782");
System.out.println("    3.1748");   
System.out.println("    4.1764");
System.out.print("  Enter your choice:");ans=sc.nextInt();
if(ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("B. The teritory of Porus who offered strong resistance to Alexander was situated between the rivers of: ");
System.out.println("    1.Satluj & Beas");  
System.out.println("    2.Jhelum & Chenab");
System.out.println("    3.Ravi & Chenab");  
System.out.println("    4.Ganga & Yamuna");
System.out.print("  Enter your choice:");ans=sc.nextInt();
if(ans==2)
t=t+10;
switch(ans){
case 1:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 2:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 2                  |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("C. Under Akbar, the Mir Bakshi was required to look after: ");
System.out.println("    1.Military affair");    
System.out.println("    2.The State Treasury");
System.out.println("    3.The Royal Household");
System.out.println("    4.The Land Revenue System");
System.out.print("  Enter your choice:");ans=sc.nextInt();
if(ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                  |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("D. Tripitakas are sacred books of: ");
System.out.println("    1.Buddhist");   
System.out.println("    2.Hindus");
System.out.println("    3.Jains");  
System.out.println("    4.None of the above");
System.out.print("  Enter your choice:");ans=sc.nextInt();
if(ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);do{
System.out.println("E. The trident-shaped Symbol of Buddhism does not represent: ");
System.out.println("    1.Nirvana");    
System.out.println("    2.Singha");
System.out.println("    3.Buddha"); 
System.out.println("    4.Dhamma");
System.out.print("  Enter your choice:");ans=sc.nextInt();
if(ans==1)
t=t+10;
switch(ans){
case 1:
System.out.println("        |----------------------------------------------------------|");
System.out.println("        | Congratulation!!!! You are correct & you have scored 10  |");
System.out.println("        |----------------------------------------------------------|");break;
case 2:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 3:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
case 4:
System.out.println("        |-------------------------------------------|");
System.out.println("        | OOPS!!!! You are wrong & you have scored 0|");
System.out.println("        |   The correct answer is 1                 |");
System.out.println("        |-------------------------------------------|");break;
default:
System.out.println("        |***************************************************|");
System.out.println("        |Sorry!!! The number you have entered does not exist|");
System.out.println("        |   Try again........                               |");
System.out.println("        |***************************************************|");break;
}System.out.println("\n");}while(ans>=5);
return(t);
}}
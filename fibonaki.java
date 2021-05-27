public class fibonaki{
public static void main(String arg[]){
int a=0,b=1,c=0,i;
System.out.println(""+a);
System.out.println(""+b);
for(i=1;i<=10;i++){
c=a+b;
System.out.println(""+c);
a=b;b=c;
}
}
}

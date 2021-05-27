public class arr{
public static void main(String arg[]){
int a[]={10,20,30,40,50};
int b[]={60,70,80,90,100};
int c[]=new int[10];
int i,j=0,k=0;
for(i=0;i<10;i++){
if(i%2==0){
c[i]=a[j]*10;
j++;
}else{
c[i]=b[k]*20;
k++;
}}
for(i=0;i<10;i++)
System.out.println(c[i]);
}
}
import java.io.*;public class Display {
    public static void main(String arg[]) throws IOException    {
       float r;String f;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	do{
	System.out.println("*********************************************");
        System.out.println("1.Perimeter of triangle");
        System.out.println("2.Semi-perimeter of triangle");
        System.out.println("3.Perimeter of rectangle");
        System.out.println("4.Perimeter of square");
        System.out.println("5.Area of square");
        System.out.println("6.a+b whole square");
        System.out.println("7.a-b whole square");
        System.out.println("8.asquare-bsquare");
        System.out.println("9.a+b+c whole square");
        System.out.println("10.a+b-c whole square");
        System.out.println("11.a+b whole cube");
        System.out.println("12.a-b whole cube");
        System.out.println("    Enter three numbers");
        System.out.println("    Select your choise-1,2,3,4,5,6,7,8,9,10,11,12");
        System.out.print("    Enter your choise:");   int ch=Integer.parseInt(br.readLine());
        System.out.println("    your choise is= "+ch);
        System.out.println("    Enter three number");
        System.out.print("   Enter the value of A:");        float a=Float.parseFloat(br.readLine());
        System.out.print("   Enter the value of B:");        float b=Float.parseFloat(br.readLine());
        System.out.print("   Enter the value of C:");        float c=Float.parseFloat(br.readLine());
        System.out.println("    The no you entered a= "+a);
        System.out.println("                       b= "+b);
        System.out.println("                       c= "+c);
        switch(ch)        {
            case 1:
                r=a+b+c;
                System.out.println("    Perimeter of triangle is= "+r); break;
            case 2:
                r=(a+b+c)/2;
                System.out.println("    Semi-perimeter of triangle is= "+r); break;
            case 3:
                r=2*(a+b);
                System.out.println("    Perimeter of rectangle is= " +r);break;
            case 4:
                r=4*a;
                System.out.println("    Perimeter of square is= "+r); break;
            case 5:
                r=a*a;
                System.out.println("    Area of square is= "+r);break;
            case 6:
                r=(a*a)+2*a*b+(b*b);
                System.out.println("    a+b whole square is= " +r);break;
            case 7:
                r=(a*a)-2*a*b+(b*b);
                System.out.println("    a-b whole square is= "+r);break;
            case 8:
                r=(a+b)*(a-b);
                System.out.println("    asquare-bsquare is= "+r);break;
            case 9:
                r=(a*a)+(b*b)+(c*c)+2*(a*b+b*c+c*a);
                System.out.println("    a+b+c whole square is= "+r);break;
            case 10:
                r=(a*a)+(b*b)+(c*c)+2*a*b+2*b*c+2*c*a;
                System.out.println("    a+b-c whole square is="+r);break;
            case 11:
                r=(a*a*a)+(b*b*b)+3*a*b*(a+b);
                System.out.println("    a+b whole cube is="+r);break;
            case 12:
                r=(a*a*a)-(b*b*b)-3*a*b*(a-b);
                System.out.println("    a-b whole cube is="+r);break;
            default:
                System.out.println("Wrong choise");
                break;	  }
	System.out.print("Do you want to continue: ");
	f=br.readLine();
	}while(f.equalsIgnoreCase("Yes")); }}
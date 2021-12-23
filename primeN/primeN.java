import java.util.*;
class primeN{
	boolean checkSumPrime(int a){
		String temp = String.valueOf(a);
		int i,c=0,k=0;
		for(i = 0; i < temp.length(); i++){
			c=c + Character.getNumericValue(temp.charAt(i));
		}
		for(i=2; i < c; i++){
			if(c%i ==0){
				return false;
			}
		}
		return true;
			
	}
	
	boolean isPrime(int a){
		for(int i = 2; i<a; i++){
			if(a%i ==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		int c = 1;
		System.out.print("Enter 1st number : ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int b = sc.nextInt();
		primeN ob = new primeN();
		for(int i = a; i<=b; i++){
			if(ob.isPrime(i) == true){
				if(ob.checkSumPrime(i) == true){
					System.out.println(c + " => " + i);
					c++;
				}
			}
		}
	}
}
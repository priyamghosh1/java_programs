import java.util.*;
class twinPrime{
	
	boolean checkPrime(int a){
		for(int i = 2; i<a ; i++){
			if(a%i == 0){
				return false;	
			}
		}
		return true;
	}	
	
	void checkTwin(int a, int b){
		if((b-a) == 2){
			System.out.println("( "+a+" , "+b+" )");
		}
	}

	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int first = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int second = sc.nextInt();
		twinPrime ob = new twinPrime();
		int a = 0, b =0;
		for(int i = first; i<=second;i++){
			if(ob.checkPrime(i)){
				if(a==0){
					a = i;
				}else if(b==0){
					b = i;
				}
				if(a!=0 && b!=0){
					ob.checkTwin(a,b);
					a=b;b=0;
				}
				
			}
		}
	}
}
import java.util.*;
class middleChar{
	public static void main(String aa[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
		int mid = str.length();
		if(mid%2 == 0){
			System.out.println(str.charAt((mid/2)-1));
		}else{
			System.out.println(str.charAt(mid/2));
		}
	}
}
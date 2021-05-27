import java.util.*;
public class TicTacToe{
	public static void main(String args[]){
		Scanner inp= new Scanner(System.in);
		String[] a=new String[10];
		System.out.print("Player 1 name: ");
		String player1=inp.nextLine();
		System.out.print("Player 2 name: ");
		String player2=inp.nextLine();
		do{
		int count=1,mov=0;
		for(int intfor = 0; intfor<=8; intfor++){
			a[intfor]= " ";
		}
		System.out.println();
		System.out.println("				     |     |");
		System.out.println("				  1  |  2  |  3  ");
		System.out.println("				_____|_____|_____");
		System.out.println("				     |     |");
		System.out.println("				  4  |  5  |  6  ");
		System.out.println("				_____|_____|_____");
		System.out.println("				     |     |");
		System.out.println("				  7  |  8  |  9  ");
		System.out.println("				     |     |");
		System.out.println();
		do{	
			do{
				do{
					if(count % 2 == 0){
						System.out.print("		");
						System.out.print(player2 + "'s Chance : ");
					}else{
						System.out.print("		");
						System.out.print(player1 + "'s Chance : ");
					}
					mov = inp.nextInt();
					if(mov>=1 && mov<=9){
						if((a[mov-1] == "X") || (a[mov-1] == "O")){
							System.out.println("		Error: "+mov +" already given. Choose another block");
							continue;
						}else{
								break;
						}
					}else{
						System.out.println("		****************	The Number you have entered is not valid	****************");
						continue;
					}
				}while(true);
				if(count % 2 == 0){
					a[mov-1] = "O";
				}else{
					a[mov-1] = "X";
				}
			}while(mov>9 || mov<1);
			System.out.println();
			System.out.println("				     |     |				   |     |");
			System.out.println("				  "+a[0]+"  |  "+a[1]+"  |  "+a[2]+"				1  |  2  |  3");
			System.out.println("				_____|_____|_____ 		      _____|_____|_____");
			System.out.println("				     |     |				   |     |");
			System.out.println("				  "+a[3]+"  |  "+a[4]+"  |  "+a[5]+"				4  |  5  |  6");
			System.out.println("				_____|_____|_____ 		      _____|_____|_____");
			System.out.println("				     |     |				   |     |");
			System.out.println("				  "+a[6]+"  |  "+a[7]+"  |  "+a[8]+"				7  |  8  |  9");
			System.out.println("				     |     |				   |     |");
			System.out.println();
			if((a[0]=="X" && a[4]=="X" && a[8]=="X") || (a[2]=="X" && a[4]=="X" && a[6]=="X") || (a[1]=="X" && a[4]=="X" && a[7]=="X") || (a[0]=="X" && a[3]=="X" && a[6]=="X") ||  (a[2]=="X" && a[5]=="X" && a[8]=="X") || (a[0]=="X" && a[1]=="X" && a[2]=="X") || (a[3]=="X" && a[4]=="X" && a[5]=="X") || (a[6]=="X" && a[7]=="X" && a[8]=="X")){
				System.out.println();
				System.out.print("	");
				System.out.println("		****************	"+player1 + " Won	****************");
				System.out.println();
				break;
			}else if((a[0]=="O" && a[4]=="O" && a[8]=="O") || (a[2]=="O" && a[4]=="O" && a[6]=="O") || (a[1]=="O" && a[4]=="O" && a[7]=="O") || (a[0]=="O" && a[3]=="O" && a[6]=="O") ||  (a[2]=="O" && a[5]=="O" && a[8]=="O") || (a[0]=="O" && a[1]=="O" && a[2]=="O") || (a[3]=="O" && a[4]=="O" && a[5]=="O") || (a[6]=="O" && a[7]=="O" && a[8]=="O")){
				System.out.println();
				System.out.print("	");
				System.out.println("		**************** "+player2 + " Won	****************");
				System.out.println();
				break;
			}
				count = count + 1;
			if(count  == 10 ){
				System.out.println();
				System.out.print("	");
				System.out.println("		***********	 Draw	****************");
				System.out.println();
			}
		}while(count < 10);
		System.out.print("Do u want to continue(1 for yes / 2 for no): ");
		int x = inp.nextInt();
		System.out.println();
		System.out.println();
		if(x==1){
			String swap = "";
			swap = player1;
			player1=player2;
			player2=swap;
			continue;
		}else{
			break;
		}
		}while(true);
		
	}
}
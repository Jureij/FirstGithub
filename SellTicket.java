import java.util.Scanner;
public class SellTicket{
	public static void main(String[]args){
		Scanner n= new Scanner(System.in);
		int Standard = 50;
		int VIP = 100;
		System.out.println("Enter your  TicketNumber:");
		int ticket= n.nextInt();
		System.out.println("Enter your  Amount:");
		int Amount= n.nextInt();
		int Ticket=(Amount*20)/100;
		System.out.println("THE DISCOUNT IS:"+Ticket);
		if(Amount >=500){
			System.out.println("CONGRATULATE THE USER ON BEING A PREMIUM CUSTOMER");

			}else{
				System.out.println( "THE USER ARE NOT ON BEING A PREMIUM CUSTOMER");
				}
		}

	}
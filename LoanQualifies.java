import java.util.Scanner;
public class LoanQualifies{
	public static void main(String[]args){
		Scanner s= new Scanner(System.in);
		System.out.println("enter your AnnualIncome:");
		int AnnualIncome = s.nextInt();
		System.out.println("enter your CreditScore:");
		int CreditScore =  s.nextInt();
		System.out.println("enter your Loan:");
		int Loan =  s.nextInt();
		int RequestLoan = (Loan * AnnualIncome);
		System.out.println("YOUR QUALIFIES LOAN IS:"+ RequestLoan);
		if(AnnualIncome >=$3000){
			System.out.println(AnnualIncome);
			else if(CreditScore>700){
				System.out.println(CreditScore);
				else if(CreditScore>700){
					System.out.println(CreditScore);
					else if(Loan<=5){
						System.out.println(Loan);
						else if(RequestLoan = Loan*AnnualIncome){
							System.out.println("YOUR ARE QUALIFIES THE LOAN");

							}else{
								System.out.println("YOUR ARE NOT  QUALIFIES THE LOAN");
								}
						}
					}

				}

			}
		}

	}
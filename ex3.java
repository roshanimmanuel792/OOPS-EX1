import java.util.Scanner;

public class bankAtm {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);

		 boolean a=true;

		 double balance = 10000;

		while (a==true) {

			System.out.println("Menu:");

			System.out.println("1.check account balance\n 2. deposit money \n 3.withdraw money \n 4.exit the application");

			System.out.println("enter your option(1-4):");

			int option = sc.nextInt();			

			switch(option) {

			case 1:

				System.out.println("the balance amount is " + balance);

				break;

			case 2:

				System.out.print("enter the amount to deposit:");

				double deposit = sc.nextDouble();

				balance = deposit + balance;

				break;

			case 3:

				System.out.println("enter the amount you want to withdraw:");

				double withdraw = sc.nextDouble();

				if(withdraw>balance) {

					System.out.println("you dont have sufficient balance amount to withdraw");

					break;

				}

				else {

					System.out.print("you have succesfully withdrawed"+withdraw);

					balance = balance - withdraw;

					break;

					}

			case 4:

				System.out.println("Exiting....");

				System.exit(0);

				

				

				

				

				

			}

		}



	}



}

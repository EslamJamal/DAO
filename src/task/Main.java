/***************************************************************************************************
 * SOFTWARE ENGINEERING COURSE
 * TASK(1) Submitted to Eng.Yassin by Eslam Gamal Thabet Bn(6)
 * In this task, users choose an operation number for their process(insert,delete,update or retrieve)
 * then enter the desired values through cmd. I made a random database through MYSQL server in terminal
 * on my localhost. 
 ***************************************************************************************************/



package task;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {

		DAO newtest = new DAO();
		Scanner scan = new Scanner(System.in);
		int OP_number;
		String id,type,manufacturer,prod_date,exp_date ;
		
		
		do {
			System.out.println("Enter Operation number:");
			OP_number = scan.nextInt();
			scan.nextLine();
			switch (OP_number){
			
				//insert
				case 1: 
					
					System.out.println("Enter Product_ID:");
					id = scan.nextLine();
					Product insert = new Product(id);
					
					System.out.println("Enter Type:");
					type = scan.nextLine();
					insert.setType(type);
					
					System.out.println("Enter Manufacturer:");
					manufacturer = scan.nextLine();
					insert.setMan(manufacturer);
					
					System.out.println("Enter Prod_date:");
					prod_date = scan.nextLine();
					insert.setPro(prod_date);
					
					System.out.println("Enter Exp_date:");
					exp_date = scan.nextLine();
					insert.setExp(exp_date);
					newtest.insert_product(insert);
		
					break;
					
				//update	
				case 2:
					
					System.out.println("Enter Product_ID:");
					id = scan.nextLine();
					Product update = new Product(id);
					
					System.out.println("Enter Type:");
					type = scan.nextLine();
					update.setType(type);
					
					System.out.println("Enter Manufacturer:");
					manufacturer = scan.nextLine();
					update.setMan(manufacturer);
					
					System.out.println("Enter Prod_date:");
					prod_date = scan.nextLine();
					update.setPro(prod_date);
					
					System.out.println("Enter Exp_date:");
					exp_date = scan.nextLine();
					update.setExp(exp_date);
					newtest.update_product(update);
		
					break;
					
				//delete	
				case 3:
					
					System.out.println("Enter Product_ID:");
					id = scan.nextLine();
					newtest.delete_product(id);
					
					break;
					
				//retrieve	
				case 4:
					
					System.out.println("Enter Manufacturer:");
					manufacturer = scan.nextLine();
					newtest.retrieve_product(manufacturer);
					
					break;
					
				//break the loop and end the program	
				case 0: System.out.println("GOODBYE!!");
					break;
				
				}	
				}while(OP_number != 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}


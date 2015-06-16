import java.util.*;
public class InvManage 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String choice;
		System.out.println("Select 1 to perform inventory management or 2 to exit: ");
		choice = scan.next();
		switch(choice)
		{
		case "1":
		{
			Inventory i = new Inventory();
			i.menu();
		}
		break;
		case "2":
			System.out.println("Thank you for managing inventory!");
		}

	}

}

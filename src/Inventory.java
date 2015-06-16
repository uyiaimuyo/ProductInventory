import java.util.*;
public class Inventory extends Product {
	public ArrayList<Product> storage = new ArrayList<Product>();
	public ArrayList<Inventory> inv = new ArrayList<Inventory>();
	Scanner scan = new Scanner(System.in);
	
	public void createInventory()
	{
		System.out.println("Would you like to create a new inventory? (y/n)");
		String choice = scan.next();
		if(choice == "y")
		{
			Inventory i = new Inventory();
			inv.add(i);
		}
	}
	
	public void addProduct()
	{
		String n;
		double p;
		int di;
		int q;
		
		System.out.print("Please enter the name of the item you wish to add: ");
		n = scan.next();
		System.out.print("Please enter the price of the item you wish to add: $");
		p = scan.nextDouble();
		System.out.print("Please enter the ID of the item you wish to add: ");
		di = scan.nextInt();
		System.out.print("Please enter the quantity of the item you wish to add: ");
		q = scan.nextInt();
		Product pro = new Product(n,p,di,q);
		storage.add(pro);
		menu();
	}
	
	public void removeProduct()
	{
		int di;
		System.out.println("Please enter the ID of the item you desire: ");
		di = scan.nextInt();
		for(int i = 0; i < storage.size(); i++)
		{
			if(di == storage.get(i).getId())
			{
				System.out.println("Are you sure you would like to remove this product? (y/n)");
				String choice = scan.next();
				if(choice == "y")
					storage.remove(i);			
			}
			else
			{
				System.out.println("Invalid ID. Please try again: ");
				di = scan.nextInt();
			}
		}
		menu();
	}
	public void displayInvTotal()
	{
		double total = 0;
		for(int i = 0; i < storage.size(); i++)
		{
			total += storage.get(i).getPrice() * storage.get(i).getQuantity();
		}
		System.out.println("The current inventory total is $" + total);
		menu();
		
		
	}
	
	public void displayInventory()
	{
		for(int i = 0; i < storage.size(); i++)
		{
			System.out.println(storage.get(i).getName());
			System.out.println(storage.get(i).getId());
			System.out.println(storage.get(i).getPrice());
			System.out.println(storage.get(i).getQuantity() + "\n");
		}
		menu();
	}
	
	public void menu()
	{
		String selection;
		System.out.println("Welcome to Uyi and Son's! Please make a selection from the menu.");
		System.out.println("1. Add items");
		System.out.println("2. Remove items");
		System.out.println("3. Display inventory");
		System.out.println("4. Display inventory total");
		System.out.print("Enter any other key to exit: ");
		selection = scan.next();
		
		switch(selection)
		{
		case "1":
			addProduct();
		break;
		case "2":
			removeProduct();
		break;
		case "3":
			displayInventory();
		break;
		case "4":
			displayInvTotal();
		break;
		default:
			System.out.println("Thank you for shopping at Uyi and Son's. Come again sometime!");
		}
		
	}

}

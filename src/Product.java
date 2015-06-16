

public class Product {

	public String name;
	public double price;
	public int id;
	public int quantity;
	
	public Product()
	{
		name = "";
		price = 0.0;
		id = 0;
		quantity = 0;
	}
	
	public Product(String n, double p, int di, int q)
	{
		name = n;
		price = p;
		id = di;
		quantity = q;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public void setId(int di)
	{
		id = di;
	}
	
	public void setQuantity(int q)
	{
		quantity = q;
	}
	
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
}

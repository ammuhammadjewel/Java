class Product 
{

    String productId;
    String productName;
    double price = 0;
	int availableQuantity = 0;
	
	public Product()
	{
		
	}
	
	public Product(String id, String name, double bdt, int quantity) 
	{
        this.productId = id;
        this.productName = name;
        this.price = bdt;
	    this.availableQuantity = quantity;
    }

    void setproductId(String id) 
	{
         productId = id;
    }
	
	String getproductId()
	{
		return productId;
	}

    void setproductName(String name) 
	{
         productName = name;
    }
	String getproductName()
	{
         return productName;
    }

    void setprice(double bdt) 
	{
         price = bdt;   
    }
	double getprice()
	{
         return price;
    }

      void setavailableQuantity(int quantity) 
	{
         availableQuantity = quantity;   
    }
	int getavailableQuantity()
	{
         return availableQuantity;
    }

    void showInformations() 
	{
         System.out.println("Product Id: " + productId + ", Product Name: " + productName + ", Price: " + price + ", Avaiable Quantity: " + availableQuantity);
    }
}
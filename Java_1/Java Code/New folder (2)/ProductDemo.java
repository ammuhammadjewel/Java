class ProductDemo 
{
    public static void main(String[] args) 
	{

        Product s1 = new Product("A09","Desktop",30000,21);
		
		System.out.println("Product Details 1 : ");
		s1.showInformations();
		s1.setproductId("A");
		s1.setproductName("Basketball");
        s1.setprice(350.0);
		s1.setavailableQuantity(5);
		System.out.println("Product Details 2: ");
		s1.showInformations();
		
    }
}
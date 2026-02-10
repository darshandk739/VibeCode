package demo;

public class Product {



	int id;
	String name;
	int exp;
	
	
	public Product(int id, String name, int exp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", exp=" + exp + "]";
	}

}

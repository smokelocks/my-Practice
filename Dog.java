package class宠物店;

public class Dog {
	private String name;
	private int age; 
	private double price; 
	
	Dog(String name, Integer age) {
		this.name = name; 
		this.age = age;
		this.price = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double howMuch() {
		return price;
	}
	
	public void hello() {
		System.out.println(name +" is saying 'woof woof' to you");
	}
	
	public String dogInfo() {
		return "name: " + "\t"+name +"\nage: "+ "\t"+age+"\nprice: "+"\t"+price+"\n";
	}
	
	
	
}

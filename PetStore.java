package class宠物店;

import java.util.ArrayList;

public class PetStore {
	private double revenue;
	private String name; 
	private ArrayList<Dog> dogs;
	private ArrayList<Cat> cats;
	
	public PetStore(String name) {
		this.name = name; 
		this.dogs = new ArrayList<Dog>();
		this.cats = new ArrayList<Cat>();
		this.revenue = 0;
	}
	
	public String getStoreName() {
		return name;
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog); 
//		System.out.println(dog.getName()+" added");
	}
	
	public void showAllDogs() {
		if(dogs.isEmpty()) {
			System.out.println("现在我店没有小狗");
		} else {
			System.out.println("本店待售小狗如下:");

			for(Dog x:dogs) {
				System.out.println("--------------");
				System.out.println(x.dogInfo());
			}
		}
	}
	
	public void sellDog(Dog dog) {
		dogs.remove(dogs.indexOf(dog));
		System.out.println("小狗"+dog.getName()+"已经被卖走了。");
		revenue += dog.getPrice();
		System.out.println("我店现在有￥"+revenue+"\n");
	}
	
	
	public void addCat(Cat cat) {
		cats.add(cat); 
//		System.out.println(cat.getName()+" added");
	}
	
	public void showAllCats() {
		if(cats.isEmpty()) {
			System.out.println("现在我店没有小狗");
		} else {
			System.out.println("本店待售小猫如下:");
			for(Cat x:cats) {
				System.out.println("--------------");
				System.out.println(x.catInfo());
			}
		}
	}
	
	public void sellCat(Cat cat) {
		cats.remove(cats.indexOf(cat));
		System.out.println("小猫"+cat.getName()+"已经被卖走了。");
		revenue += cat.getPrice();
		System.out.println("我店现在有￥"+revenue+"\n");
	}
	
}

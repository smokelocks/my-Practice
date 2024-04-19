package class宠物店;

public class Main {

	public static void main(String[] args) {
		// 创建一个名为 `PetStore` 的类，并设计其能够管理的宠物类型（如猫、狗等）。
		// 任务：
		// a. 为宠物商店定义属性，如商店名称、宠物列表等。
		// b. 实现几种宠物类，每个宠物具有名称、年龄、品种等属性，和吃（eat）、玩（play）等行为。
		// c. 在 `PetStore` 类中定义方法来添加新宠物、售卖宠物和列出所有宠物。
		// d. 在主函数中创建 `PetStore` 对象，并实例化一些宠物，演示添加和售卖宠物的过程。

		//造一个商店
		PetStore yoyo = new PetStore("火腿宠物店");
		System.out.println(yoyo.getStoreName());
		
		
		//狗子的操作
		Dog dog1 = new Dog("普吉", 1); 
		dog1.setPrice(5000);
		yoyo.addDog(dog1);
		
		Dog dog2 = new Dog("查隆", 3); 
		dog2.setPrice(200.99);
		yoyo.addDog(dog2);
		
		Dog dog3 = new Dog("阿祖尔", 1); 
		dog3.setPrice(4230.67);
		yoyo.addDog(dog3);
		
		yoyo.showAllDogs();
		
		yoyo.sellDog(dog2);
		yoyo.showAllDogs();
		
		
		//猫子的操作
		Cat cat1 = new Cat("清风",3); 
		Cat cat2 = new Cat("细雨",5); 
		Cat cat3 = new Cat("润物",2); 
		Cat cat4 = new Cat("无声",1); 
		
		yoyo.addCat(cat1);
		yoyo.addCat(cat2);
		yoyo.addCat(cat3);
		yoyo.addCat(cat4);
		
		cat1.setPrice(7800);
		cat2.setPrice(800);
		cat3.setPrice(300);
		cat4.setPrice(12800);
		
		yoyo.showAllCats();
		yoyo.sellCat(cat2);
		
	}

}

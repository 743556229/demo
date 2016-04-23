package demo;

public class Master {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="贝贝";
		dog.variety="Labrador";
		String message=dog.bark();	
		dog.setAge(5);
		System.out.print("品种为"+dog.variety+"\n"
				         +"名叫"+dog.name+"\n"
				         +"年龄为"+dog.getAge()+"的狗"+"\n"
				         +dog.bark()+"的叫着"+"\n"+"正在");
		dog.lookDoor();
		System.out.println();
		
		Cat cat=new Cat();
		cat.name="多多";
		cat.variety="波斯猫";
		String message1=cat.bark();	
		cat.setAge(11);
		System.out.print("品种为"+cat.variety+"\n"
				         +"名叫"+cat.name+"\n"
				         +"年龄为"+cat.getAge()+"的猫"+"\n"
				         +cat.bark()+"的叫着"+"\n"+"正在");
		cat.catchMouse();
		System.out.println();
		
		Pig pig=new Pig();
		pig.name="小猪";
		pig.variety="茶杯猪"	;
		pig.age=3;
		String message2=pig.bark();	
		System.out.print("品种为"+pig.variety+"\n"
		         +"名叫"+pig.name+"\n"
		         +"年龄为"+pig.age+"的猪"+"\n"
		         +pig.bark()+"\n");
		pig.eat("饲料");
		pig.sleep();

		
	}

}

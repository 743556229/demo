package demo;

public class Master {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="����";
		dog.variety="Labrador";
		String message=dog.bark();	
		dog.setAge(5);
		System.out.print("Ʒ��Ϊ"+dog.variety+"\n"
				         +"����"+dog.name+"\n"
				         +"����Ϊ"+dog.getAge()+"�Ĺ�"+"\n"
				         +dog.bark()+"�Ľ���"+"\n"+"����");
		dog.lookDoor();
		System.out.println();
		
		Cat cat=new Cat();
		cat.name="���";
		cat.variety="��˹è";
		String message1=cat.bark();	
		cat.setAge(11);
		System.out.print("Ʒ��Ϊ"+cat.variety+"\n"
				         +"����"+cat.name+"\n"
				         +"����Ϊ"+cat.getAge()+"��è"+"\n"
				         +cat.bark()+"�Ľ���"+"\n"+"����");
		cat.catchMouse();
		System.out.println();
		
		Pig pig=new Pig();
		pig.name="С��";
		pig.variety="�豭��"	;
		pig.age=3;
		String message2=pig.bark();	
		System.out.print("Ʒ��Ϊ"+pig.variety+"\n"
		         +"����"+pig.name+"\n"
		         +"����Ϊ"+pig.age+"����"+"\n"
		         +pig.bark()+"\n");
		pig.eat("����");
		pig.sleep();

		
	}

}

package demo;

public class Dog extends Pet {
	 
	private int age;
	
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>20||age<0){
			System.out.println("�������䲻�ԣ�����������");
		}else{	
			this.age = age;
		}
	}

	public String bark(){
	    	return "������";
	    }
	 
	public void lookDoor(){
		System.out.println("����");
	}

}

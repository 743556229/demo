package demo;

public class Cat extends Pet{
	private int age;
	
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>10||age<0){
			System.out.println("�������䲻�ԣ�����������");
		}else{	
			this.age = age;
		}
	}
	 public String bark(){
	    	return "������";
	    }
	 
	public void catchMouse(){
		System.out.println("ץ����");
	}

}

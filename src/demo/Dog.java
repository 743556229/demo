package demo;

public class Dog extends Pet {
	 
	private int age;
	
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>20||age<0){
			System.out.println("输入年龄不对，请重新输入");
		}else{	
			this.age = age;
		}
	}

	public String bark(){
	    	return "汪汪汪";
	    }
	 
	public void lookDoor(){
		System.out.println("看门");
	}

}

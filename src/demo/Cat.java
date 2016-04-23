package demo;

public class Cat extends Pet{
	private int age;
	
	 public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>10||age<0){
			System.out.println("输入年龄不对，请重新输入");
		}else{	
			this.age = age;
		}
	}
	 public String bark(){
	    	return "喵喵喵";
	    }
	 
	public void catchMouse(){
		System.out.println("抓老鼠");
	}

}

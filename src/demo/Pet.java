package demo;

public class Pet {
	String name;
	String variety;
	int age;
	
	public String bark(){
    	return "饿了";
    }  
    public void eat(String food){
    	System.out.println("正在吃"+food);
    } 
    public void sleep(){
    	System.out.println("正在睡觉");
    }

}

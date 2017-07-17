package jun.text;

interface Fruit{
	void eat();
}

class Apple implements Fruit{
	public void eat() {
		System.out.println("eat apple");
	}
	
}
class Hhhhh implements Fruit{
	public void eat() {
		System.out.println("eat hhhhh");
	}
	
}
class Orange implements Fruit{
	public void eat() {
		System.out.println("eat orange");
	}
	
}
class Factory{
	public static Fruit getInstance(String className){
		if("apple".equals(className)){
			return new Apple();
		}
		else if("orangle".equals(className)){
			return new Orange();
		}
		return null;		
	}
}

public class TFactory {
	public static void main(String[] args) {
		Fruit f = Factory.getInstance("orangle");
		f.eat();
	}
}

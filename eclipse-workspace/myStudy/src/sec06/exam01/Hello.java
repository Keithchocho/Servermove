package sec06.exam01;

public class Hello {

	String foodType;
	
	
	public Hello(String name){
		foodType = name;
	}
	
	public void order() {
		String message = "This food is " + foodType + "!";
		System.out.println(message);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Hello food = new Hello("Kimchi");
			food.order();
	}

}



public class cake {
	//Feild
	
	
	String brand = "파리바게트";
	String type = "Cake";
	String makingTime = "30min";
	int price = 20000;
		
	public cake(String brand,String type, String makingTime, int price) {
		
		this.brand = brand;
		this.type = type;
		this.makingTime = makingTime;
		this.price = price;
		
		
		
	}

public static void main(String[] args) {
	
	
	cake myCake = new cake("뚜레주르","초콜릿케이크","20min", 17800);
	
	System.out.println("제품회사:"+ myCake.brand + " 종류:" + myCake.type + " 제조시간:" + myCake.makingTime + " 가격:" + myCake.price + "원");

	
	cake myCake2 = new cake("파리바게트","당근케이크","30mim", 20000);
	System.out.println("제품회사:"+ myCake2.brand + " 종류:" + myCake2.type + " 제조시간:" + myCake2.makingTime + " 가격:" + myCake2.price + "원");

	}

}
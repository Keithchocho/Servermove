
public class cake {
	//Feild
	
	
	String brand = "�ĸ��ٰ�Ʈ";
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
	
	
	cake myCake = new cake("�ѷ��ָ�","���ݸ�����ũ","20min", 17800);
	
	System.out.println("��ǰȸ��:"+ myCake.brand + " ����:" + myCake.type + " �����ð�:" + myCake.makingTime + " ����:" + myCake.price + "��");

	
	cake myCake2 = new cake("�ĸ��ٰ�Ʈ","�������ũ","30mim", 20000);
	System.out.println("��ǰȸ��:"+ myCake2.brand + " ����:" + myCake2.type + " �����ð�:" + myCake2.makingTime + " ����:" + myCake2.price + "��");

	}

}
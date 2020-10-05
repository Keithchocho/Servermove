
public class java1009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var reverseNum = "";
		var plusNum = 0;
		
		var numStr = args + "";
		
		for(var i = 0; i < numStr.length(); i++) {
			
			var nThNum =
			reverseNum.charAt(i);
			reverseNum =
			nThNum + reverseNum;
			
			plusNum =
			plusNum + (nThNum);
		}
		
		System.out.println(reverseNum + " " + plusNum);
	}

}


public class study03 {
		// 실행함수(메인함수)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String daehee = "공부좀해";
			byte a = 1;
			if(daehee == "공부좀해") { // 만약에 () 라면,,, 중과로 내부를 실행
			System.out.println("인정합니다");
			} else {// if문에서 제외된 모든 상황을 가져옴
				System.out.println("싫은데요??");
			}
			
			
			if(a == 0) {
				System.out.println("a는 0입니다");
			}else if  (a == 1)
				System.out.println("a는 1입니다");
			
	
	// and 연산자 or 연산자
	
	
	if(a == 0 && a ==1) { //&& >> and 연산자 
		System.out.println("Test");
	}
	 
	if(a == 0 || a == 1) { // || >> or 연산자
		System.out.println("Test2");
	}
	
		}
}



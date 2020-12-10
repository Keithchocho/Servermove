
public class Cal {

	int sum1(int[]values) {
		int sum = 0;
		for(int i = 0; i <values.length; i++);{
		
				sum += values[i];
		}
			return sum;
	}
	
	int sum2(int[]values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++);{
		sum +=values[i];
		}
			return sum;
	}

	public static void main(String[] args) {
		
	Cal myCal = new Cal();
	int[] values1 = {1,2,3};
	int result1 = myCal.sum1(values1);
	System.out.println("Result1: " + result1);
	
	}
}


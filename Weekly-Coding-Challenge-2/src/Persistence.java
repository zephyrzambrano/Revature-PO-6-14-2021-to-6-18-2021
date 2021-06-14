
public class Persistence {
	
	public static int additivePersistence(int num) {
		
		int iterations = 0;
		
		while (Integer.toString(num).length() != 1) {
			
			String numString = Integer.toString(num);
			
			int sum = 0;
			
			for (int i = 0; i < numString.length(); i = i + 1) {
				sum = sum + Integer.parseInt(numString.substring(i, i + 1));
			}
			
			num = sum;
			
			iterations = iterations + 1;
			
		}
		
		return iterations;
		
	}
	
	public static int multiplicativePersistence(int num) {
		
		int iterations = 0;
		
		while (Integer.toString(num).length() != 1) {
			
			String numString = Integer.toString(num);
			
			int product = 1;
			
			for (int i = 0; i < numString.length(); i = i + 1) {
				product = product * Integer.parseInt(numString.substring(i, i + 1));
			}
			
			num = product;
			
			iterations = iterations + 1;
			
		}
		
		return iterations;
		
	}
	
}

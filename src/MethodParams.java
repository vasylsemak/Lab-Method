
public class MethodParams {

	public static void main(String[] args) {
		MethodParams mp = new MethodParams();
		
		double d = mp.convertIntToDouble(15);
		System.out.println("Converted to diuble: " + d);
		
		double mySum = mp.sum(9, 7, 6.555);
		System.out.println("My sum is: " + mySum);
		
		
		int[] myArgs = {2, 4, 5, 7};
		float[] mySquares = mp.square(myArgs);
		 
		for(int i = 0; i < mySquares.length; i++) {
			 System.out.println(myArgs[i] + " number squared " + " is " + mySquares[i]);
		 }
		
		
		String longer = mp.findFirstWorld("Audi", "Mercedes");
		System.out.println("First word is : " + longer);
	}
	
	// METHOD convertIntToDouble
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	// METHOD sum
	public double sum(int x, int y, double z) {
		return (x + y + z);
	}
	
	// METHOD square
	public float[] square(int[] args) {
		 float[] result = new float[4];
		 
		 for(int i = 0; i < args.length; i++) {
			 result[i] = args[i] * args[i];
		 }
		 return result;
	}
	
	// METHOD findFirstWorld
	public String findFirstWorld(String strA, String strB) {
		String longerStr = "";
		String shorterStr = "";
		
		if(strA.length() >= strB.length()) {
			longerStr = strA;
			shorterStr = strB;
		} else {
			longerStr = strB;
			shorterStr = strA;
		}
		
		char[] longerArr = longerStr.toCharArray();
		char[] shorterArr = shorterStr.toCharArray();
		
		for(int i = 0; i < longerArr.length; i++) {
			if(longerArr[i] < shorterArr[i]) return longerStr;
			if(longerArr[i] > shorterArr[i]) return shorterStr;
		}
		
		return longerStr;
	}
	
	

}

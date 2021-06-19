
public class MethodDeclaration {

	public static void main(String[] args) {
		// create a class instance
		// call your first method here
		MethodDeclaration md = new MethodDeclaration();
		md.talk();
		
		// one parameter method
		int num = 55;
		int myInt = md.getInt(num);
		System.out.println("Your number: " + myInt);
		
		// three parameters method
		double mySum = md.sum(5.6, 4, 6);
		System.out.println("Three nums sum is: " + mySum);
	}
	
	 	// create your first method here
	public void talk() {
		System.out.println("Inside of the talk method");
	}
	
	public int getInt(int num) {
		return num;	
	}
	
	public double sum(double x, int y, int z) {
		return x + y + z;
	}
}

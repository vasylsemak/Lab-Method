
public class ReturnTypes {

	public static void main(String[] args) {
		ReturnTypes rt = new ReturnTypes();
		rt.returnNothing();
		
		boolean b = rt.returnBoolean();
		System.out.println("The value of b is: " + b);
		
		double pi = rt.getPi();
		System.out.println("The value of pi is: " + pi);
		
		char[] alphabet = rt.getAlphabetArray('a', 'z');
		for(int i = 0; i < alphabet.length; i++) {
			System.out.println("Array " + i + " is " + alphabet[i]);
		}
	}
	
	// METHODS
	public void returnNothing() {
		System.out.println("Inside of a void method");
	}
	
	public boolean returnBoolean() {
		return true;
	}
	
	public double getPi() {
		return Math.PI;
	}
	
	public char[] getAlphabetArray(char first, char last) {
		char[] alphabetArr = new char[26];
		int idx = 0;
		
		do {
			alphabetArr[idx] = first;
			idx++;
			first++;
			
		} while(first <= last);
		
		
		return alphabetArr;
		
	}
}

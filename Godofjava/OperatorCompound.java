package Godofjava;

public class OperatorCompound {
	public static void main(String[] args) {
		OperatorCompound sample = new OperatorCompound();
		sample.Compound();
		
	}
	
	public void Compound() {
		int intValue=10;
		intValue += 5;
		System.out.println(intValue);
		
		intValue -= 5;
		System.out.println(intValue);
		
		intValue *= 5;
		System.out.println(intValue);
		
		intValue /= 5;
		System.out.println(intValue);
		
		intValue %= 5;
		System.out.println(intValue);
		
	}

}

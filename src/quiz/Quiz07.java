package quiz;

public class Quiz07 {

	public static void main(String[] args) {
		
		double d = 1.2;
		float f = 0.9f;
		
		int i = (int) d; // 1
		int i2 = (int) f; // 0
		int i3 = (int) d + (int) f; // 1
		int i4 = (int) (d + f); // 2
		
		System.out.println("i: " + i);
		System.out.println("i2: " + i2);
		System.out.println("i3: " + i3);
		System.out.println("i4: " + i4);
		
	}

}

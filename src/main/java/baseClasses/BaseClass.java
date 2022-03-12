package baseClasses;

public class BaseClass {
  
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=4; i>=1; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

package week1.day2;

public class calculator {
	public int getDetails(int x, int y) {
		return x+y;
	}
	public int getSub(int a, int b) {
		return a-b;
	}
	public int getMul(int x, int y) {
		return x*y;
	}
	public double getDiv(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		calculator cal =  new calculator();
		System.out.println(cal.getDetails(6, 9));
		System.out.println(cal.getSub(16, 9));
		System.out.println(cal.getMul(6, 9));
		System.out.println(cal.getDiv(15, 5));
		
	}
}

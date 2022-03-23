package week1.day2;

public class ArmStrong {
	public static void main(String[] args) {

        int input =153;
        int original = input;
        int sum = 0;
        while(input>0) {
        	int rem = input%10; 
        	sum = sum + (rem*rem*rem);
        	input = input/10;
        }
        if(original==sum)
           
        	System.out.println(sum+ " is an Armstrong number.");
        else
            System.out.println(sum + " is not an Armstrong number.");
    }
}

package recurssions;

public class Factorial {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int smallOutput = fact(n - 1);
		int output = n * smallOutput;
		return output;
	}

	public static void main(String[] args) {
		int fact = fact(5);
		System.out.println(fact);
		// TODO Auto-generated method stub
	}

}

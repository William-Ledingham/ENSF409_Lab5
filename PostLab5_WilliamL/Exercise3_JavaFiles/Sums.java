
import java.io.*;

public class Sums {

	public static void sum(BufferedReader in){ 
		// takes a sequence of integers as inputs, and outputs their sum

		int s, nextInt;
		s = 0;
		boolean invalidInput = false;

		System.out.println("Please input the sequence of integers to sum, terminated by a 0");
		try {
			nextInt = Integer.parseInt(in.readLine());
			invalidInput = false;
			//Read next datum in input. An integer is expected
		}catch(NumberFormatException e) {
			System.out.println("Invalid Number. Please re-enter.");
			nextInt = 0;
			invalidInput = true;
		}catch(IOException e) {
			System.out.println("Invalid Number. Please re-enter.");
			nextInt = 0;
			invalidInput = true;
		}
		while ( (nextInt!=0 && invalidInput == false) || (nextInt == 0 && invalidInput == true) ) {
			s = s + nextInt;
			try {
				nextInt = Integer.parseInt(in.readLine());
				invalidInput = false;
			}catch(NumberFormatException e) {
				System.out.println("Invalid Number. Please re-enter.");
				nextInt = 0;
				invalidInput = true;
			}catch(IOException e) {
				System.out.println("Invalid Number. Please re-enter.");
				nextInt = 0;
				invalidInput = true;
			}
		}

		System.out.println("The sum is " + s);
	}

	public static void main(String[] arg) {         

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//"in" will receive data from the standard input stream
		String c;

		System.out.println("Do you wish to calculate a sum? (y/n)");

		try {
			c = in.readLine();
			//Read next datum in input. A string "y" or "n" is expected
		}catch(IOException e){
			c = null;
		}

		while (!c.equals("y") && !c.equals("n")) {
			System.out.println("Please answer y or n");
			try {
				c = in.readLine();
			}catch(IOException e) {

			}
		}

		while (c.equals("y")) {
			sum(in);
			System.out.println("Do you wish to calculate another sum? (y/n)");
			try {
				c = in.readLine();
			}catch(IOException e) {

			}

			while (!c.equals("y") && !c.equals("n")) {
				System.out.println("Please answer y or n");
				try {
					c = in.readLine();
				}catch(IOException e) {

				}
			}
		}

		System.out.println("Goodbye");
	}
}

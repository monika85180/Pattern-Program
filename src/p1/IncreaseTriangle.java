package p1;


//* 
//* * 
//* * * 
//* * * * 
//* * * * * 

// increasing triangle consist 2 loop outer loop will run 1 to n
// inner loop will run 1 to i


public class IncreaseTriangle {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) { // here we are putting condition j<=i because the j will print the coloum as
											// the no. of row i will show
											// like outer loop has row 1 so in inner loop it will print 1 col and next
											// outer loop 2 than inner loop will print 2 col

				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

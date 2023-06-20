package p1;

//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 
//* * * * * 

public class SquarePattern {

	public static void main(String []args) {
		int n=5;
		for(int i=1; i<=n; i++) {   		// outer loop will print the no. of rows
			for(int j=1; j<=n; j++) {  		// inner loop will print the no. of coloumns
			System.out.print("* ");
		}System.out.println();            	// this should be only define after inner for loop
			}
		
	}
	
	
}

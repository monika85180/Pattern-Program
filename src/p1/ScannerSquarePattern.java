package p1;

import java.util.Scanner;

public class ScannerSquarePattern {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the no. which you want to print as star");
	int n = scan.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.print("* ");
	}
	System.out.println();
	}


	// Increasing Triangle
	System.out.println("Increasing triangle");
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {   // here we are putting condition j<=i because the j will print the coloum as the no. of row i will show
	System.out.print("* ");
}
System.out.println();
}


//Decreasing Triangle
System.out.println("Decreasing triangle");
for(int i=1;i<=n;i++) {
	for(int j=i;j<=n;j++) {
	System.out.print("* ");
}

System.out.println();
}
}

}

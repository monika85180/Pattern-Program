package p1;

public class Butterfly {
public static void main(String[] args) {
	int n =5;
	for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		
for(int j=i; j<n;j++) {   // for making the peek in hill pattern we put j<i instead of j<=i
			
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++) {
			
			System.out.print("  ");
			}
		for (int j=1; j<=i; j++) {
			System.out.print("* ");
		}
		
		System.out.println();
		}

	for(int k=1; k<=n*2+1; k++) {
		System.out.print("* ");
	}
	System.out.println();
	for(int i=1; i<=n; i++) {
		
		for(int j=i; j<=n; j++) {
			System.out.print("* ");
		}
		
		for(int j=1; j<i;j++) {
			System.out.print("  ");
		}
	
		for (int j=1; j<=i; j++) {
			System.out.print("  ");
		}
		
		for(int j=i; j<=n; j++) {
			System.out.print("* ");
		}
	System.out.println();
	}
	}
}


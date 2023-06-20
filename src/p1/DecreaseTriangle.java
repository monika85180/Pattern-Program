package p1;

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 



//Decreasing  triangle consist 2 loop outer loop will run 1 to n
//inner loop will run i to n


public class DecreaseTriangle {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {
		System.out.print("* ");
	}
	
	System.out.println();
	}
}
}

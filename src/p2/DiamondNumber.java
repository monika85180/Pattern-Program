package p2;

//        2 2 
//      3 3 3 3 
//    4 4 4 4 4 4 
//  5 5 5 5 5 5 5 5 
//6 6 6 6 6 6 6 6 6 6 
//  7 7 7 7 7 7 7 7 
//    8 8 8 8 8 8 
//      9 9 9 9 
//       10 10 



public class DiamondNumber {
public static void main(String[] args) {
	int n = 5, p=1;
	for(int i=1;i<=n;i++,p++) {
		for(int j=i; j<=n;j++) {
			
			System.out.print("  ");
			
		}
		for(int j=1;j<i;j++) {   // for making the peek in hill pattern we put j<i instead of j<=i
			System.out.print(p+" ");
		}
		
		for(int j=1;j<i;j++)
		{
			System.out.print(p+" ");
		}
		System.out.println();
	}
		for(int i=1;i<=n;i++,p++) {
			for(int j=1;j<i;j++) {  // this will print _ triangle
		
			System.out.print("  ");
			}
			for(int j=i; j<=n;j++) {   // for making the peek in hill pattern we put j<i instead of j<=i
				
				System.out.print(p+" ");
			}
			for(int j=i;j<=n;j++) {
				
				System.out.print(p+" ");
				}
		System.out.println();
		}
}
}


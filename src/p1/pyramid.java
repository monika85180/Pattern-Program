package p1;

//
//- - - - - * 
//- - - - * * * 
//- - - * * * * * 
//- - * * * * * * * 
//- * * * * * * * * * 



//Pyramid  consist 4 loop outer loop will run 1 to n and will be blank  / 2nd loop i to n 
//3rd loop will run 1 to i and = sign will remove from condition // 4th loop will run 1 to i


public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {

			for(int j=i; j<=n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<i;j++) {      // this loop will print 1 less col so the pyramid got the top edge
				System.out.print("* ");
			}
			
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
	            System.out.println();
	            }}
}

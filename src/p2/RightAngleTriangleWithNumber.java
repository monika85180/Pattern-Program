package p2;
//
//1 
//1 1 
//1 1 1 
//1 1 1 1 
//1 1 1 1 1 


public class RightAngleTriangleWithNumber {
public static void main(String[] args) {
	int n = 5;
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=i;j++) {
		System.out.print("1 ");
	}
	System.out.println();
}
	
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

	
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=i;j++) {
		System.out.print(i+" ");
	}
	System.out.println();
}
	
	// correct way to print above pattern by intializing p  
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 
	
	for(int i=1,p=1;i<=n;i++,p++) {
		for(int j=1; j<=i;j++) {
		System.out.print(p+" ");
	}
	System.out.println();
}
	
//	5 
//	4 4 
//	3 3 3 
//	2 2 2 2 
//	1 1 1 1 1 
//	
	
	for(int i=1,p=5;i<=n;i++,p--) {
		for(int j=1; j<=i;j++) {
		System.out.print(p+" ");
	}
	System.out.println();
}
	
//	0 
//	2 2 
//	4 4 4 
//	6 6 6 6 
//	8 8 8 8 8 
	
	for(int i=1,p=0;i<=n;i++,p+=2) {
		for(int j=1; j<=i;j++) {
		System.out.print(p+" ");
	}
	System.out.println();
}
	
	
	//code for alternating number and symbols
//	1 
//	2 2 
//	1 1 1 
//	2 2 2 2 
//	1 1 1 1 1 
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=i;j++) {
			if(i%2==0) {
		System.out.print("2 ");
			}else 
				System.out.print("1 ");
		}
	System.out.println();
}
	
//	# 
//	& & 
//	# # # 
//	& & & & 
//	# # # # # 
	
	for(int i=1;i<=n;i++) {
		for(int j=1; j<=i;j++) {
			if(i%2==0) {
		System.out.print("& ");
			}else 
				System.out.print("# ");
		}
	System.out.println();
}
	

}}

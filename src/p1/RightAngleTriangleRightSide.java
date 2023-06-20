package p1;

// in the right side angle triangle we have to make to triangle first is invisible but in decreasing order 
// and with that have to also create an increasing rightangle triangle

//----------* 
//--------* * 
//------* * * 
//----* * * * 
//--* * * * * 

public class RightAngleTriangleRightSide {
	public static void main(String[] args) {
		int n = 5;
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++) {  // this loop will print empty triangle and in the same rows next loop will start printing right side triangle
	System.out.print("  ");
		
		}
	
	for(int j=1;j<=i;j++) {
	System.out.print("* ");
		
		}
	System.out.println();
	}
	}
	 

}

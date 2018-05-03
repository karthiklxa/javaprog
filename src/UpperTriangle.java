
public class UpperTriangle {

public static void main(String[] args) {
		
		int r=5,c=5;
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				a[i][j]=i+j;
			}			
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
							
				if(i<=j)
				System.out.print(a[i][j]+" ");	
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

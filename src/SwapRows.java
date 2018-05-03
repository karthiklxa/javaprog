
public class SwapRows {

public static void main(String[] args) {
		
		int r=4,c=4;
		int a[][]=new int[r][c];
		int mid = r/2;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				
				a[i][j]=i+j;
			}			
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {						
				
				System.out.print(a[i][j]+" ");	
				
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<r/2;i++) {
			for(int j=0;j<c;j++) {						
				
				int temp=a[i][j];
				a[i][j]=a[mid][j];
				a[mid][j]=temp;
				//mid++;
				System.out.print(a[i][j]+" ");	
				
			}
			System.out.println();
		}
		
	}

}
